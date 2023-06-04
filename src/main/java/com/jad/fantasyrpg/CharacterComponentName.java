package com.jad.fantasyrpg;

public enum CharacterComponentName implements Named {
    RACE("Race"),
    PROFIL("Profil");

    private final String name;

    CharacterComponentName(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "CharacterComponentName{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
