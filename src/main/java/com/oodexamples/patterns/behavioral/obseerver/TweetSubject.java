package com.oodexamples.patterns.behavioral.obseerver;

import java.util.ArrayList;
import java.util.Collection;

/*
    Subject can have many observers
    Subject generates updates
 */
public class TweetSubject implements  ISubject {
    Collection<IObserver> observers = new ArrayList<>();
    Object arbitraryState = new Object();

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        // we demonstrate PUSH model here
        // However we could pass the subjects itself with getters
        // that would provide necessary information the observer needs
        // hence PULL model.
        this.observers.forEach(observer -> observer.update(arbitraryState));
    }
}

/*
     java.util.EventListeners are examples of the observer pattern
 */
