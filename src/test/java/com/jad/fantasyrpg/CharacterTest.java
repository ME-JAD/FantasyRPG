package com.jad.fantasyrpg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CharacterTest {
    private final Character humanWarrior = new Character("Humain guerrier", () -> "Guerrier", Race.HUMAN);

    private final Character elfWizard = new Character("Elfe magicien", () -> "Magicien", Race.ELF);

    private final Character dwarfPriest = new Character("Prêtre nain", () -> "Prêtre", Race.DWARF);

    @Test
    void getCharacteristic() {
        for (int numTest = 0; numTest < 100; numTest++) {
            assertTrue(this.humanWarrior.getCharacteristic("Force") >= 3);
            assertTrue(this.humanWarrior.getCharacteristic("Force") <= 18);
            assertTrue(this.humanWarrior.getCharacteristic("Dextérité") >= 3);
            assertTrue(this.humanWarrior.getCharacteristic("Dextérité") <= 18);
            assertTrue(this.humanWarrior.getCharacteristic("Constitution") >= 3);
            assertTrue(this.humanWarrior.getCharacteristic("Constitution") <= 18);
            assertTrue(this.humanWarrior.getCharacteristic("Intelligence") >= 3);
            assertTrue(this.humanWarrior.getCharacteristic("Intelligence") <= 18);
            assertTrue(this.humanWarrior.getCharacteristic("Sagesse") >= 3);
            assertTrue(this.humanWarrior.getCharacteristic("Sagesse") <= 18);
            assertTrue(this.humanWarrior.getCharacteristic("Charisme") >= 3);
            assertTrue(this.humanWarrior.getCharacteristic("Charisme") <= 18);

            assertTrue(this.elfWizard.getCharacteristic("Force") >= 1);
            assertTrue(this.elfWizard.getCharacteristic("Force") <= 16);
            assertTrue(this.elfWizard.getCharacteristic("Dextérité") >= 5);
            assertTrue(this.elfWizard.getCharacteristic("Dextérité") <= 20);

            assertTrue(this.dwarfPriest.getCharacteristic("Constitution") >= 5);
            assertTrue(this.dwarfPriest.getCharacteristic("Constitution") <= 20);
            assertTrue(this.dwarfPriest.getCharacteristic("Dextérité") >= 1);
            assertTrue(this.dwarfPriest.getCharacteristic("Dextérité") <= 16);
        }
    }

    @org.junit.jupiter.api.Test
    void getCharacteristicModifier() {
        assertEquals(this.humanWarrior.getCharacteristic("Force") / 2 - 5,
                this.humanWarrior.getCharacteristicModifier("Force"));
        assertEquals(this.humanWarrior.getCharacteristic("Dextérité") / 2 - 5,
                this.humanWarrior.getCharacteristicModifier("Dextérité"));
        assertEquals(this.humanWarrior.getCharacteristic("Constitution") / 2 - 5,
                this.humanWarrior.getCharacteristicModifier("Constitution"));
        assertEquals(this.humanWarrior.getCharacteristic("Intelligence") / 2 - 5,
                this.humanWarrior.getCharacteristicModifier("Intelligence"));
        assertEquals(this.humanWarrior.getCharacteristic("Sagesse") / 2 - 5,
                this.humanWarrior.getCharacteristicModifier("Sagesse"));
        assertEquals(this.humanWarrior.getCharacteristic("Charisme") / 2 - 5,
                this.humanWarrior.getCharacteristicModifier("Charisme"));
    }

    @org.junit.jupiter.api.Test
    void getLifePoint() {
        assertEquals(this.humanWarrior.getLifePoint(), 10);
        assertEquals(this.elfWizard.getLifePoint(), 4);
        assertEquals(this.dwarfPriest.getLifePoint(), 8);
    }

    @org.junit.jupiter.api.Test
    void getMeleeAttack() {
        assertEquals(this.humanWarrior.getCharacteristicModifier("Force") + 1,
                this.humanWarrior.getMeleeAttack());
    }

    @org.junit.jupiter.api.Test
    void getRangedAttack() {
        assertEquals(this.humanWarrior.getCharacteristicModifier("Dextérité") + 1,
                this.humanWarrior.getRangedAttack());
    }

    @org.junit.jupiter.api.Test
    void getMagicAttack() {
        assertEquals(0,
                this.humanWarrior.getMagicAttack());
        assertEquals(this.elfWizard.getCharacteristicModifier("Intelligence") + 1,
                this.elfWizard.getMagicAttack());
        assertEquals(this.dwarfPriest.getCharacteristicModifier("Sagesse") + 1,
                this.dwarfPriest.getMagicAttack());
    }

    @org.junit.jupiter.api.Test
    void getLevel() {
        assertEquals(1, this.humanWarrior.getLevel());
        assertEquals(1, this.elfWizard.getLevel());
        assertEquals(1, this.dwarfPriest.getLevel());
    }
}