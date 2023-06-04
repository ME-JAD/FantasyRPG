package com.jad.fantasyrpg;

import java.util.ArrayList;

public class Character implements ICharacter {
    private final ArrayList<Characteristic> characteristics = new ArrayList<>();
    private final ArrayList<CharacterComponent> components = new ArrayList<>();
    private int level;

    public Character(final String name, final IProfil profil, final IRace race) {
        this.level = 1;
    }

    @Override
    public int getCharacteristic(final String characteristicName) {
        return this.getCharacteristic(CharacteristicName.getByName(characteristicName));
    }

    public int getCharacteristicModifier(final CharacteristicName characteristicName) {
        int modifier = Character.CalculateCharacteristicModifier(this.getCharacteristic(characteristicName));
        for (final CharacterComponent component : this.components) {
            modifier += component.getCharacteristicVariation(characteristicName, this);
        }
        return modifier;
    }

    @Override
    public int getCharacteristic(final CharacteristicName characteristicName) {
        for (final Characteristic characteristic : this.characteristics) {
            if (characteristic.isNamedAs(characteristicName.name())) {
                return characteristic.getValue();
            }
        }
        throw new IllegalArgumentException("No characteristic named " + characteristicName + " found.");
    }

    @Override
    public int getCharacteristicModifier(final String characteristicName) {
        return this.getCharacteristicModifier(CharacteristicName.getByName(characteristicName));
    }

    private static int CalculateCharacteristicModifier(final int characteristicValue) {
        return characteristicValue / 2 - 5;
    }

    @Override
    public int getLifePoint() {
        return this.getCharacteristic(CharacteristicName.LIFE_POINTS);
    }

    @Override
    public int getMeleeAttack() {
        return this.getCharacteristic(CharacteristicName.MELEE_ATTACK);
    }

    @Override
    public int getRangedAttack() {
        return this.getCharacteristic(CharacteristicName.RANGED_ATTACK);
    }

    @Override
    public int getMagicAttack() {
        return this.getCharacteristic(CharacteristicName.MAGIC_ATTACK);
    }

    @Override
    public IRace getRace() {
        return null;
    }

    @Override
    public IProfil getProfil() {
        return null;
    }

    @Override
    public int getLevel() {
        return this.level;
    }
}
