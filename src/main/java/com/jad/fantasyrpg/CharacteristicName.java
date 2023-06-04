package com.jad.fantasyrpg;

public enum CharacteristicName implements Named {
    STRENGTH("Force"),
    DEXTERITY("Dextérité"),
    CONSTITUTION("Constitution"),
    INTELLIGENCE("Intelligence"),
    WISDOM("Sagesse"),
    CHARISMA("Charisme"),
    LIFE_POINTS("Points de vie"),
    MELEE_ATTACK("Attaque de mêlée"),
    RANGED_ATTACK("Attaque à distance"),
    MAGIC_ATTACK("Attaque magique");

    private final String name;

    CharacteristicName(final String name) {
        this.name = name;
    }

    public static CharacteristicName getByName(final String name) {
        for (final CharacteristicName characteristicName : CharacteristicName.values()) {
            if (characteristicName.getName().equals(name)) {
                return characteristicName;
            }
        }
        throw new IllegalArgumentException("No characteristic named " + name + " found.");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
