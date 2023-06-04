package com.jad.fantasyrpg;

enum Characteristic implements Named {
    STRENGTH("Force", BehaviorGetStartingValue.ROLL_3D6),
    DEXTERITY("Dextérité", BehaviorGetStartingValue.ROLL_3D6),
    CONSTITUTION("Constitution", BehaviorGetStartingValue.ROLL_3D6),
    INTELLIGENCE("Intelligence", BehaviorGetStartingValue.ROLL_3D6),
    WISDOM("Sagesse", BehaviorGetStartingValue.ROLL_3D6),
    CHARISMA("Charisme", BehaviorGetStartingValue.ROLL_3D6),
    LIFE_POINTS("Points de vie", BehaviorGetStartingValue.ZERO),
    MELEE_ATTACK("Attaque de mêlée", BehaviorGetStartingValue.ZERO),
    RANGED_ATTACK("Attaque à distance", BehaviorGetStartingValue.ZERO),
    MAGIC_ATTACK("Attaque magique", BehaviorGetStartingValue.ZERO);

    private final String name;

    private final BehaviorGetStartingValue behaviorGetStartingValue;

    Characteristic(final String name, final BehaviorGetStartingValue behaviorGetStartingValue) {
        this.name = name;
        this.behaviorGetStartingValue = behaviorGetStartingValue;
    }

    public static Characteristic getByName(final String name) {
        for (final Characteristic characteristic : Characteristic.values()) {
            if (characteristic.getName().equals(name)) {
                return characteristic;
            }
        }
        throw new IllegalArgumentException("No characteristic named " + name + " found.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getInitialValue() {
        return this.behaviorGetStartingValue.getStartingValue();
    }

    @Override
    public String toString() {
        return "CharacteristicName{" +
                "name='" + name + '\'' +
                ", behaviorGetStartingValue=" + behaviorGetStartingValue +
                "} " + super.toString();
    }
}
