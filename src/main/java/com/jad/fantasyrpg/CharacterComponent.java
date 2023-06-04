package com.jad.fantasyrpg;

public interface CharacterComponent extends Named {
    default int getCharacteristicVariationByName(final String name, final ICharacter character) {
        return this.getCharacteristicVariation(CharacteristicName.valueOf(name), character);
    }

    int getCharacteristicVariation(final CharacteristicName characteristicName, final ICharacter character);

    int getInitialCharacteristicVariation(final CharacteristicName characteristicName, final ICharacter character);
}
