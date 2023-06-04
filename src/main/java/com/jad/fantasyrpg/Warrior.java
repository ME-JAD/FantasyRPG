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
            case LIFE_POINTS -> 10;
            default -> 0;
        };
    }
}
