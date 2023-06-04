package com.jad.fantasyrpg;

public interface Named {
    default boolean isNamedAs(final String name) {
        return this.getName().equals(name);
    }

    String getName();
}
