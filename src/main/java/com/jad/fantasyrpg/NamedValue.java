package com.jad.fantasyrpg;

interface NamedValue<E> extends Named {
    E getValue();

    void setValue(final E value);
}
