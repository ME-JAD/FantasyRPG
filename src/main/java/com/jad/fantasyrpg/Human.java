package com.jad.fantasyrpg;

class Human implements IRace {
    private static final String NAME = "Human";

    @Override
    public String getName() {
        return Human.NAME;
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
