package com.jad.fantasyrpg;

public class Thief implements IProfil {
    private static final String NAME = "Voleur";

    @Override
    public String getName() {
        return Thief.NAME;
    }

    @Override
    public int getCharacteristicVariation(final CharacteristicName characteristicName, final ICharacter character) {
        return switch (characteristicName) {
            case LIFE_POINTS -> 6;
            default -> 0;
        };
    }
}
