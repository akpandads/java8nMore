package com.lambdas.interfaces;

@FunctionalInterface
public interface Functional <T,R>{
    R apply(T t);
}
