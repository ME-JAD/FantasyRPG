package com.jad.fantasyrpg;

enum CharacterComponentType implements Named {
    RACE("Race"),
    PROFIL("Profil");

    private final String name;

    CharacterComponentType(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "CharacterComponentName{" +
                "name='" + this.name + '\'' +
                "} " + super.toString();
    }
}
