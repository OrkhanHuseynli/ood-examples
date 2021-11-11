package com.oodexamples.multithreading;

import lombok.SneakyThrows;


class Locker {
    private Boolean open;
    Locker(boolean open){
        this.open = open;
    }
    public Boolean getOpen(){
        return  this.open;
    }

    public void setOpen(boolean open){
        this.open = open;
    }

}
public class SeparateLocks {
    Locker lock1 = new Locker(false);
    Locker lock2 = new Locker(false);


    public void example() throws IllegalMonitorStateException, InterruptedException {
        Thread threadA = new Thread(() -> {
            synchronized (lock1){
                try {
                    if (!lock1.getOpen()){
                        System.out.println("lock1 BEFORE wait");
                        lock1.wait();
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                    while (lock1.getOpen()){
//                        try {
//                            Thread.sleep(2000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        lock1.notify();
//                    }
                    System.out.println("lock1 OPENED");

                System.out.println("lock1 AFTER released");
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    lock1.setOpen(true);
                    lock1.notify();
                    System.out.println("thread B lock open set");
                }
            }
        });

        threadA.run();
        Thread.sleep(500 );
        threadB.run();
        threadA.join();
        threadB.join();

    }

}

class Demo2 {
    public static void main( String args[] ) throws InterruptedException {
        var s = new SeparateLocks();
        s.example();
    }
}