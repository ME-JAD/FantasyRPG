package com.jad.fantasyrpg;

class Warrior implements IProfil {
    private static final String NAME = "Guerrier";

    @Override
    public String getName() {
        return Warrior.NAME;
    }

    @Override
    public int getCharacteristicVariation(final Characteristic characteristic, final ICharacter character) {
        return switch (characteristic) {
            case MELEE_ATTACK -> character.getCharacteristicModifier(Characteristic.STRENGTH) + 1;
            case RANGED_ATTACK -> character.getCharacteristicModifier(Characteristic.DEXTERITY) + 1;
            default -> 0;
        };
    }

    @SuppressWarnings("SwitchStatementWithTooFewBranches")
    @Override
    public int getInitialCharacteristicVariation(final Characteristic characteristic,
                                                 final ICharacter character) {
        return switch (characteristic) {
            case LIFE_POINTS -> 10;
            default -> 0;
        };
    }
}
