package com.jad.fantasyrpg;

public enum Race implements IRace {
    HUMAN(new Human()),
    HALF_ELF(new HalfElf()),
    ELF(new Elf()),
    DWARF(new Dwarf()),
    HALF_ORC(new HalfOrc()),

    ;
    private final IRace race;

    Race(final IRace race) {
        this.race = race;
    }

    @Override
    public String getName() {
        return this.race.getName();
    }

    @Override
    public int getCharacteristicVariation(final Characteristic characteristic, final ICharacter character) {
        return this.race.getCharacteristicVariation(characteristic, character);
    }

    @Override
    public int getInitialCharacteristicVariation(final Characteristic characteristic,
                                                 final ICharacter character) {
        return this.race.getInitialCharacteristicVariation(characteristic, character);
    }

    @Override
    public String toString() {
        return "Race{" +
                "race=" + race +
                "} " + super.toString();
    }
}
