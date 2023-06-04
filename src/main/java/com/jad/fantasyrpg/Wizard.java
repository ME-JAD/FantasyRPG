package com.jad.fantasyrpg;

public class Wizard implements IProfil {
    private static final String NAME = "Magicien";

    @Override
    public String getName() {
        return Wizard.NAME;
    }

    @Override
    public int getCharacteristicVariation(final CharacteristicName characteristicName, final ICharacter character) {
        return switch (characteristicName) {
            case MAGIC_ATTACK -> character.getCharacteristicModifier(CharacteristicName.INTELLIGENCE) + 1;
            case MELEE_ATTACK -> character.getCharacteristicModifier(CharacteristicName.STRENGTH) + 1;
            case RANGED_ATTACK -> character.getCharacteristicModifier(CharacteristicName.DEXTERITY) + 1;
            default -> 0;
        };
    }

    @Override
    public int getInitialCharacteristicVariation(final CharacteristicName characteristicName,
                                                 final ICharacter character) {
        return switch (characteristicName) {
            case LIFE_POINTS -> 4;
            default -> 0;
        };
    }
}
