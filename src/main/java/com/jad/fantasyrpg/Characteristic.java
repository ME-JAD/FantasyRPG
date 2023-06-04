package com.jad.fantasyrpg;

public class Characteristic implements NamedValue<Integer> {
    private final CharacteristicName characteristicName;
    private Integer value;

    public Characteristic(final CharacteristicName characteristicName, final Integer value) {
        this.characteristicName = characteristicName;
        this.value = value;
    }

    @Override
    public String getName() {
        return this.characteristicName.getName();
    }

    @Override
    public Integer getValue() {
        return this.value;
    }

    @Override
    public void setValue(final Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Characteristic{" +
                "characteristicName=" + characteristicName +
                ", value=" + value +
                '}';
    }
}
