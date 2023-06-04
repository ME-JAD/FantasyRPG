package com.jad.fantasyrpg;

class Elf implements IRace {
    private static final String NAME = "Elfe";

    @Override
    public String getName() {
        return Elf.NAME;
    }

    @Override
    public int getCharacteristicVariation(final CharacteristicName characteristicName, final ICharacter character) {
        return switch (characteristicName) {
            case DEXTERITY -> 2;
            case STRENGTH -> -2;
            default -> 0;
        };
    }
}
