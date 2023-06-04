package com.jad.fantasyrpg;

public class Priest implements IProfil {
    private static final String NAME = "Prêtre";

    @Override
    public String getName() {
        return Priest.NAME;
    }

    @Override
    public int getCharacteristicVariation(final CharacteristicName characteristicName, final ICharacter character) {
        return switch (characteristicName) {
            case MAGIC_ATTACK -> character.getCharacteristicModifier(CharacteristicName.WISDOM) + 1;
            case MELEE_ATTACK -> character.getCharacteristicModifier(CharacteristicName.STRENGTH) + 1;
            case RANGED_ATTACK -> character.getCharacteristicModifier(CharacteristicName.DEXTERITY) + 1;
            default -> 0;
        };
    }

    @Override
    public int getInitialCharacteristicVariation(final CharacteristicName characteristicName,
                                                 final ICharacter character) {
        return switch (characteristicName) {
            case LIFE_POINTS -> 8;
            default -> 0;
        };
    }
}
