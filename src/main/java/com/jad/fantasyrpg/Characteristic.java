package com.jad.fantasyrpg;

public class Characteristic implements NamedValue<Integer> {
    private final String name;
    private Integer value;

    public Characteristic(final String name, final Integer value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return this.name;
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
                "name='" + this.name + '\'' +
                ", value=" + this.value +
                '}';
    }
}
