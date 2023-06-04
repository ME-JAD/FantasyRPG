package com.jad.fantasyrpg;

class HalfOrc implements IRace {
    private static final String NAME = "Demi-Orc";

    @Override
    public String getName() {
        return HalfOrc.NAME;
    }

    @Override
    public int getCharacteristicVariation(final CharacteristicName characteristicName, final ICharacter character) {
        return 0;
    }

    @Override
    public int getInitialCharacteristicVariation(final CharacteristicName characteristicName,
                                                 final ICharacter character) {
        return switch (characteristicName) {
            case STRENGTH -> 2;
            case INTELLIGENCE, CHARISMA -> -2;
            default -> 0;
        };
    }
}
