package com.jad.fantasyrpg;

class Dwarf implements IRace {
    private static final String NAME = "Nain";

    @Override
    public String getName() {
        return Dwarf.NAME;
    }

    @Override
    public int getCharacteristicVariation(final CharacteristicName characteristicName, final ICharacter character) {
        return 0;
    }

    @Override
    public int getInitialCharacteristicVariation(final CharacteristicName characteristicName,
                                                 final ICharacter character) {
        return switch (characteristicName) {
            case CONSTITUTION -> 2;
            case DEXTERITY -> -2;
            default -> 0;
        };
    }
}
