package com.jad.fantasyrpg;

enum Dice {
    D6(6),
    D8(8),
    D20(20);
    private final int nbSides;

    Dice(final int nbSides) {
        this.nbSides = nbSides;
    }

    int roll(final int nbRolls) {
        int total = 0;
        for (int i = 0; i < nbRolls; i++) {
            total += this.roll();
        }
        return total;
    }

    int roll() {
        return (int) (Math.random() * this.nbSides) + 1;
    }
}
