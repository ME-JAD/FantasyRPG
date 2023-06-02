package com.jad.fantasyrpg;

public class Character implements ICharacter {

    public Character(final String name,final IProfil profil,final IRace race) {
    }
    @Override
    public int getCharacteristic(final String characteristicName) {
        return 0;
    }

    @Override
    public int getCharacteristicModifier(final String characteristicName) {
        return 0;
    }

    @Override
    public int getLifePoint() {
        return 0;
    }

    @Override
    public int getMeleeAttack() {
        return 0;
    }

    @Override
    public int getRangedAttack() {
        return 0;
    }

    @Override
    public int getMagicAttack() {
        return 0;
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
        return 0;
    }
}
