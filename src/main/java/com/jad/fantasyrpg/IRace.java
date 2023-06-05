package com.jad.fantasyrpg;

public interface IRace extends CharacterComponent {
    String getName();

    @Override
    default CharacterComponentType getType() {
        return CharacterComponentType.RACE;
    }
}
