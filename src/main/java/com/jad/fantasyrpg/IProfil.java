package com.jad.fantasyrpg;

public interface IProfil extends CharacterComponent {
    String getName();

    @Override
    default CharacterComponentType getType() {
        return CharacterComponentType.PROFIL;
    }
}
