package com.emabarks.JavaStreams;

import com.emabarks.BeanScopeTester;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class StreamQues {
    public static void main(String[] args) {


        List<Integer> list= Arrays.asList(1,2,3,4,5,5,4,3,4,1,3);

        List<String> list2=Arrays.asList("happy","tomorrow");
        List<Integer> topK = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        System.out.println(list2);



        Map<String,Integer> map=list2.stream().collect(Collectors.toMap(Function.identity(),String::length));
        System.out.println(map);

        List<Integer> distinctList=list.stream().distinct().toList();
        System.out.println(distinctList);


        List<String> listStr=Arrays.asList("Hello","World","Hi","tro","must","ii");

        Map<Integer,List<String>> map2=listStr.stream().collect(Collectors.groupingBy(String::length));

       map2.forEach((key,value)-> {
           System.out.println(key+","+value);


       });


    

        }







//

}
