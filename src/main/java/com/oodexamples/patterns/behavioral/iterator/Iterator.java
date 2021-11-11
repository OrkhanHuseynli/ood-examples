package com.oodexamples.patterns.behavioral.iterator;

public interface Iterator<T>{
    T Next();
    boolean hasNext();
}
