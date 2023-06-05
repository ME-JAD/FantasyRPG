package com.jad.fantasyrpg;

public enum Profil implements IProfil {
    WARRIOR(new Warrior()),
    WIZARD(new Wizard()),
    RANGER(new Ranger()),
    PRIEST(new Priest()),
    THIEF(new Thief());
    private final IProfil profil;

    Profil(final IProfil profil) {
        this.profil = profil;
    }

    public static IProfil getByName(final String name) {
        for (final Profil profil : Profil.values()) {
            if (profil.getName().equals(name)) {
                return profil;
            }
        }
        throw new IllegalArgumentException("No profil named " + name + " found.");
    }

    @Override
    public String getName() {
        return this.profil.getName();
    }

    @Override
    public int getCharacteristicVariation(final Characteristic characteristic, final ICharacter character) {
        return this.profil.getCharacteristicVariation(characteristic, character);
    }

    @Override
    public int getInitialCharacteristicVariation(final Characteristic characteristic,
                                                 final ICharacter character) {
        return this.profil.getInitialCharacteristicVariation(characteristic, character);
    }

    @Override
    public String toString() {
        return "Profil{" +
                "profil=" + this.profil +
                "} " + super.toString();
    }
}
