package com.leandro.submarine.interfaces;

@FunctionalInterface
public interface CommandConsumer<T, D> {

    void apply(T t, D d);
}
