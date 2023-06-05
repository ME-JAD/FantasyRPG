package com.jad.fantasyrpg;

@SuppressWarnings("FieldNamingConvention")
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

    public static IRace getByName(final String name) {
        for (final Race race : Race.values()) {
            if (race.getName().equals(name)) {
                return race;
            }
        }
        throw new IllegalArgumentException("No race named " + name + " found.");
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
                "race=" + this.race +
                "} " + super.toString();
    }
}
