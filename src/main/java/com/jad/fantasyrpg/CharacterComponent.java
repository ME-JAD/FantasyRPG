package com.jad.fantasyrpg;

interface CharacterComponent extends Named {
    default int getCharacteristicVariationByName(final String name, final ICharacter character) {
        return this.getCharacteristicVariation(Characteristic.valueOf(name), character);
    }

    int getCharacteristicVariation(final Characteristic characteristic, final ICharacter character);

    int getInitialCharacteristicVariation(final Characteristic characteristic, final ICharacter character);
}
