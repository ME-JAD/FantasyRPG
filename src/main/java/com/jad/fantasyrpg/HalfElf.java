package com.jad.fantasyrpg;

class HalfElf implements IRace {
    private static final String NAME = "Demi-Elfe";

    @Override
    public String getName() {
        return HalfElf.NAME;
    }

    @Override
    public int getCharacteristicVariation(final CharacteristicName characteristicName, final ICharacter character) {
        return 0;
    }

    @Override
    public int getInitialCharacteristicVariation(final CharacteristicName characteristicName,
                                                 final ICharacter character) {
        return 0;
    }
}
