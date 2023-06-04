package com.jad.fantasyrpg;

class Ranger implements IProfil {
    private static final String NAME = "Rôdeur";

    @Override
    public String getName() {
        return Ranger.NAME;
    }

    @Override
    public int getCharacteristicVariation(final Characteristic characteristic, final ICharacter character) {
        return switch (characteristic) {
            case MELEE_ATTACK -> character.getCharacteristicModifier(Characteristic.STRENGTH) + 1;
            case RANGED_ATTACK -> character.getCharacteristicModifier(Characteristic.DEXTERITY) + 1;
            default -> 0;
        };
    }

    @Override
    public int getInitialCharacteristicVariation(final Characteristic characteristic,
                                                 final ICharacter character) {
        return switch (characteristic) {
            case LIFE_POINTS -> 6;
            default -> 0;
        };
    }
}
