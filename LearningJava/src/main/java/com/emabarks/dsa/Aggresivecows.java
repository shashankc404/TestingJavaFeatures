package com.emabarks.dsa;

import java.util.Arrays;

public class Aggresivecows {
    public static void main(String[] args) {

        int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = aggressiveCows(stalls, k);
        if(ans!=-1)
            System.out.println("maxmin distance will be:"+ans);
        else System.out.println("No solution possible");

    }

    public static int aggressiveCows(int[] arr,int k){

        Arrays.sort(arr);
        int limit=arr[arr.length-1]-arr[0];
        int maxx=-1;
        for(int i=1;i<=limit;i++){
            int last=arr[0];
            int count=1;
            for(int stall=1;stall<arr.length;stall++){
                if((arr[stall]-last)>=i){
                    count++;
                    last=arr[stall];
                }
            }
            if(count>=k){
                maxx=i;
            }
        }
        return maxx;
    }
}
