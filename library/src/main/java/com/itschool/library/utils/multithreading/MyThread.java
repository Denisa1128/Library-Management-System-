package com.itschool.library.utils.multithreading;

import org.hibernate.validator.cfg.context.TypeTarget;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("My Thread is running");

    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

