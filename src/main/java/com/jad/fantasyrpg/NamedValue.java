package com.jad.fantasyrpg;

public interface NamedValue<E> extends Named {
    E getValue();

    void setValue(final E value);
}
