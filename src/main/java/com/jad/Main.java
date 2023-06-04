package com.jad;

import com.jad.fantasyrpg.Character;
import com.jad.fantasyrpg.Profil;
import com.jad.fantasyrpg.Race;

public class Main {
    public static void main(String[] args) {
        Character character = new Character("Humain guerrier", Profil.WARRIOR, Race.HUMAN);
        System.out.println(character);
    }
}