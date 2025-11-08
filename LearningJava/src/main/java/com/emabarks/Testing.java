package com.emabarks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Testing {




    public void sendEmail(List<String> userEmails){


//        ExecutorService service = Executors.newFixedThreadPool(5);
//        int size=userEmails.size();
//
//        for(int i=0;i<size;i=i+10)
//        {
//            List<String> batch=userEmails.subList(i,i+10);
//           CompletableFuture<?> result= (CompletableFuture) service.submit(()->{
//                sendEmailInBatch(batch);
//
//            });
//
//           result.
//    }



    }

    public void sendEmailInBatch(List<String> s) {

        for(int i = 0; i < s.size(); i++) {
            sendIndividualEmail(s.get(i));
        }
    }

    public void sendIndividualEmail(String s){
//        code for sending email
    }


}
