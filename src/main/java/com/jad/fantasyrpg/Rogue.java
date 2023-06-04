package com.jad.fantasyrpg;

public class Rogue implements IProfil {
    private static final String NAME = "";

    @Override
    public String getName() {
        return Rogue.NAME;
    }

    @Override
    public int getCharacteristicVariation(final CharacteristicName characteristicName, final ICharacter character) {
        return switch (characteristicName) {
            case LIFE_POINTS -> 6;
            default -> 0;
        };
    }
}
