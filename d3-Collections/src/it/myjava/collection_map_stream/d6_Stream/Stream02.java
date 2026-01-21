package it.myjava.collection_map_stream.d6_Stream;

import java.util.*;
import java.util.stream.Stream;

public class Stream02 {
    /*
    * 目标；获取Stream流
    * */
    public static void main(String[] args) {
        //1.获取集合的Stream流，集合.stream()
        Collection<String> list=new ArrayList<>();
        Stream<String> stream=list.stream();

        //Map集合的Stream流，map.entrySet().stream()
        Map<String,Integer> map=new HashMap<>();
        //获取键流
        Stream<String> keyStream=map.keySet().stream();
        //获取值流
        Stream<Integer> valueStream=map.values().stream();
        //获取键值对流
        Stream<Map.Entry<String, Integer>> entryStream=map.entrySet().stream();

        //2.获取数组流 Arrays.stream(数组)或者Stream.of(数组元素)
        String[] names={"小王","小李","小张"};
        Stream<String> nameStream= Arrays.stream(names);
        Stream<String> nameStream2=Stream.of(names);
        Stream<String> nameStream3=Stream.of("小王","小李","小张"); // 接可变参数


    }
}
