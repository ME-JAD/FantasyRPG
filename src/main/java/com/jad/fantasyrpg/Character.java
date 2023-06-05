package com.jad.fantasyrpg;

import java.util.ArrayList;

public class Character implements ICharacter {
    private final ArrayList<ValuedCharacteristic> valuedCharacteristics = new ArrayList<>();
    private final ArrayList<CharacterComponent> components = new ArrayList<>();
    @SuppressWarnings("FieldMayBeFinal")
    private int level;

    public Character(final String name, final IProfil profil, final IRace race) {
        this.level = 1;
        this.components.add(profil);
        this.components.add(race);
        for (final Characteristic characteristic : Characteristic.values()) {
            this.valuedCharacteristics.add(new ValuedCharacteristic(characteristic, characteristic.getInitialValue() +
                    this.getInitialCharacteristicVariation(characteristic)));
        }
    }

    private int getInitialCharacteristicVariation(final Characteristic characteristic) {
        int variation = 0;
        for (final CharacterComponent component : this.components) {
            variation += component.getInitialCharacteristicVariation(characteristic, this);
        }
        return variation;
    }

    @Override
    public int getCharacteristic(final String characteristicName) {
        return this.getCharacteristic(Characteristic.getByName(characteristicName));
    }

    private int getCharacteristicVariation(final Characteristic characteristic) {
        int variation = 0;
        for (final CharacterComponent component : this.components) {
            variation += component.getCharacteristicVariation(characteristic, this);
        }
        return variation;
    }

    public int getCharacteristicModifier(final Characteristic characteristic) {
        int modifier = Character.calculateCharacteristicModifier(this.getCharacteristic(characteristic));
        for (final CharacterComponent component : this.components) {
            modifier += component.getCharacteristicVariation(characteristic, this);
        }
        return modifier;
    }

    @Override
    public int getCharacteristic(final Characteristic characteristic) {
        for (final ValuedCharacteristic valuedCharacteristic : this.valuedCharacteristics) {
            if (valuedCharacteristic.isNamedAs(characteristic.getName())) {
                return valuedCharacteristic.getValue() + this.getCharacteristicVariation(characteristic);
            }
        }
        throw new IllegalArgumentException("No characteristic named " + characteristic + " found.");
    }

    @Override
    public int getCharacteristicModifier(final String characteristicName) {
        return this.getCharacteristicModifier(Characteristic.getByName(characteristicName));
    }

    private static int calculateCharacteristicModifier(final int characteristicValue) {
        return characteristicValue / 2 - 5;
    }

    @Override
    public int getLifePoint() {
        return this.getCharacteristic(Characteristic.LIFE_POINTS);
    }

    @Override
    public int getMeleeAttack() {
        return this.getCharacteristic(Characteristic.MELEE_ATTACK);
    }

    @Override
    public int getRangedAttack() {
        return this.getCharacteristic(Characteristic.RANGED_ATTACK);
    }

    @Override
    public int getMagicAttack() {
        return this.getCharacteristic(Characteristic.MAGIC_ATTACK);
    }

    @Override
    public IRace getRace() {
        return Race.getByName(this.getComponent(CharacterComponentType.RACE).getName());
    }

    @Override
    public IProfil getProfil() {
        return Profil.getByName(this.getComponent(CharacterComponentType.PROFIL).getName());
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    private CharacterComponent getComponent(final CharacterComponentType componentType) {
        for (final CharacterComponent component : this.components) {
            if (component.getType().equals(componentType)) {
                return component;
            }
        }
        throw new IllegalArgumentException("No component named " + componentType + " found.");
    }

    @Override
    public String toString() {
        return "Character{" +
                "characteristics=" + this.valuedCharacteristics +
                ", components=" + this.components +
                ", level=" + this.level +
                '}';
    }
}
