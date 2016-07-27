package com.leandro.submarine.interfaces;

@FunctionalInterface
public interface CommandConverter<T, D> {

    void apply(T t, D d);
}
