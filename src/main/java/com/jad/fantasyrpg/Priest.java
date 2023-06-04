package com.jad.fantasyrpg;

class Priest implements IProfil {
    private static final String NAME = "Prêtre";

    @Override
    public String getName() {
        return Priest.NAME;
    }

    @Override
    public int getCharacteristicVariation(final Characteristic characteristic, final ICharacter character) {
        return switch (characteristic) {
            case MAGIC_ATTACK -> character.getCharacteristicModifier(Characteristic.WISDOM) + 1;
            case MELEE_ATTACK -> character.getCharacteristicModifier(Characteristic.STRENGTH) + 1;
            case RANGED_ATTACK -> character.getCharacteristicModifier(Characteristic.DEXTERITY) + 1;
            default -> 0;
        };
    }

    @Override
    public int getInitialCharacteristicVariation(final Characteristic characteristic,
                                                 final ICharacter character) {
        return switch (characteristic) {
            case LIFE_POINTS -> 8;
            default -> 0;
        };
    }
}
