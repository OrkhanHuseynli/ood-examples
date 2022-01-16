package com.oodexamples.patterns.behavioral.obseerver;


//
public class TweetObserver  implements IObserver {

    @Override
    public void update(Object newState) {
        // use the state to take some
        // actions
        System.out.println(newState);
    }
}
