package com.jad.fantasyrpg;

class Elf implements IRace {
    private static final String NAME = "Elfe";

    @Override
    public String getName() {
        return Elf.NAME;
    }

    @Override
    public int getCharacteristicVariation(final Characteristic characteristic, final ICharacter character) {
        return 0;
    }

    @Override
    public int getInitialCharacteristicVariation(final Characteristic characteristic,
                                                 final ICharacter character) {
        return switch (characteristic) {
            case DEXTERITY -> 2;
            case STRENGTH -> -2;
            default -> 0;
        };
    }
}
