package com.emabarks.RateLimiter;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

interface Ratelimiters{
    public boolean requestAccess();
}

public class Ratelimiter {

    public static void main(String[] args) {
        SlidingWindow slidingWindow=new SlidingWindow(10,5);

        User user=new User(1,"Sa");
       if(slidingWindow.requestAccess()){
           System.out.println("Access granted");
       }
       else{
           System.out.println("Limit reached Please try again after some time");
       }
    }
}

class User{

    int id;
    String name;

    public User(int i, String sa) {
        this.id=i;
        this.name=sa;
    }
}

class SlidingWindow implements Ratelimiters{

    Queue<Integer> queue;
    int bucSize;
    int winSize;


    public SlidingWindow(int bucksize, int winSize) {
        this.bucSize=bucksize;
        this.winSize=winSize;
        queue=new ConcurrentLinkedQueue<>();
    }

    @Override
    public boolean requestAccess() {

        long currTime=System.currentTimeMillis();
        int currWinFront;

        while( !queue.isEmpty()){

            currWinFront=(int) (currTime- queue.peek());
            if(currWinFront>=winSize){
                queue.poll();
            }

        }
        if(queue.size()<bucSize)
        {
            queue.offer((int) currTime);
            return true;
        }
        return false;
    }
}
