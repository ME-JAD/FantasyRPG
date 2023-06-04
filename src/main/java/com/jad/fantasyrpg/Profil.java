package com.jad.fantasyrpg;

public enum Profil implements IProfil {
    WARRIOR(new Warrior()),
    WIZARD(new Wizard()),
    RANGER(new Ranger()),
    PRIEST(new Priest()),
    THIEF(new Thief());;
    private final IProfil profil;

    Profil(final IProfil profil) {
        this.profil = profil;
    }

    @Override
    public String getName() {
        return this.profil.getName();
    }

    @Override
    public int getCharacteristicVariation(final CharacteristicName characteristicName, final ICharacter character) {
        return this.profil.getCharacteristicVariation(characteristicName, character);
    }

    @Override
    public int getInitialCharacteristicVariation(final CharacteristicName characteristicName,
                                                 final ICharacter character) {
        return this.profil.getInitialCharacteristicVariation(characteristicName, character);
    }

    @Override
    public String toString() {
        return "Profil{" +
                "profil=" + profil +
                "} " + super.toString();
    }
}
