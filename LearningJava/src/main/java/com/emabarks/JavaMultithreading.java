package com.emabarks;

import java.util.concurrent.*;

public class JavaMultithreading {
    public static void main(String[] args) {




        Thread t1=new Thread(()->
                System.out.println("Hello"));

        t1.start();


        Runnable obj=()-> System.out.println("Hello there");

        ExecutorService executors= Executors.newFixedThreadPool(4);

        for(int i=0;i<5;i++){
            // CompletableFuture future = executors.submit(() -> System.out.println(Thread.currentThread()));
        }
    }


}
