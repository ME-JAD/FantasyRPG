package com.jad.fantasyrpg;

public interface ICharacter {
    int getCharacteristic(final String characteristicName);

    int getCharacteristicModifier(final Characteristic characteristic);

    int getCharacteristic(final Characteristic characteristic);

    int getCharacteristicModifier(final String characteristicName);

    int getLifePoint();

    int getMeleeAttack();

    int getRangedAttack();

    int getMagicAttack();

    IRace getRace();

    IProfil getProfil();

    int getLevel();
}
