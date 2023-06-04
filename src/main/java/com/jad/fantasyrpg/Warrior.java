package com.jad.fantasyrpg;

public class Warrior implements IProfil {
    private static final String NAME = "Guerrier";

    @Override
    public String getName() {
        return Warrior.NAME;
    }

    @Override
    public int getCharacteristicVariation(final CharacteristicName characteristicName, final ICharacter character) {
        return switch (characteristicName) {
            case MELEE_ATTACK -> character.getCharacteristicModifier(CharacteristicName.STRENGTH) + 1;
            case RANGED_ATTACK -> character.getCharacteristicModifier(CharacteristicName.DEXTERITY) + 1;
            default -> 0;
        };
    }

    @Override
    public int getInitialCharacteristicVariation(final CharacteristicName characteristicName,
                                                 final ICharacter character) {
        return switch (characteristicName) {
            case LIFE_POINTS -> 10;
            default -> 0;
        };
    }
}
