package com.jad.fantasyrpg;

public interface Named {
    default boolean isNamedAs(final String name) {
        return getName().equals(name);
    }

    String getName();
}
