package com.jad.fantasyrpg;

interface Named {
    default boolean isNamedAs(final String name) {
        return this.getName().equals(name);
    }

    String getName();
}
