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
            case LIFE_POINTS -> 4;
            case MAGIC_ATTACK -> character.getCharacteristicModifier(CharacteristicName.INTELLIGENCE) + 1;
            default -> 0;
        };
    }
}
