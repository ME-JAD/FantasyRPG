package com.jad.fantasyrpg;

class ValuedCharacteristic implements NamedValue<Integer> {
    private final Characteristic characteristic;
    private Integer value;

    public ValuedCharacteristic(final Characteristic characteristic, final Integer value) {
        this.characteristic = characteristic;
        this.value = value;
    }

    @Override
    public String getName() {
        return this.characteristic.getName();
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
                "characteristicName=" + this.characteristic +
                ", value=" + this.value +
                '}';
    }
}
