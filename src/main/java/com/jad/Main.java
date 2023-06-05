package com.jad;

import com.jad.fantasyrpg.Character;
import com.jad.fantasyrpg.Profil;
import com.jad.fantasyrpg.Race;

public enum Main {
    ;

    public static void main(final String[] args) {
        final Character character = new Character("Humain guerrier", Profil.WARRIOR, Race.HUMAN);
        System.out.println(character);
        System.out.println(character.getProfil().getName());
        System.out.println(character.getRace().getName());
    }
}