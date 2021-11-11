package com.oodexamples.patterns.behavioral.iterator;

public interface Iterable<T> {

    Iterator<T> createIterator();
}
