package com.jad.fantasyrpg;

enum BehaviorGetStartingValue {
    ROLL_3D6(() -> Dice.D6.roll(3)),
    ZERO(() -> 0);

    private final IBehaviorGetStartingValue behavior;

    BehaviorGetStartingValue(final IBehaviorGetStartingValue behavior) {
        this.behavior = behavior;
    }

    public int getStartingValue() {
        return this.behavior.getStartingValue();
    }

    interface IBehaviorGetStartingValue {
        int getStartingValue();
    }
}
