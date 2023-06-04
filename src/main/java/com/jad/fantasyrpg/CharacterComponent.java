package com.jad.fantasyrpg;

public interface CharacterComponent extends Named {
    default int getCharacteristicVariationByName(final String name, final ICharacter character) {
        return this.getCharacteristicVariation(CharacteristicName.valueOf(name), character);
    }

    default int getCharacteristicVariation(final CharacteristicName characteristicName,
                                           final ICharacter character) {
        return 0;
    }

}
