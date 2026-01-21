package it.myjava.collection_map_stream.d6_Stream;


/*
* Stream介绍
* Stream流，是java8之后出现的，是java集合的扩展，
* 优势：Stream流大量的结合了Lambda的语法风格来编程，功能丰富，性能高效，代码简洁，可读性好
*
* */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream01 {
    /*
    * 目标；认识Stream流，掌握使用基本步骤，体会优势
    * */
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("张三");
        list.add("张哈哈");
        list.add("张三丰");
        list.add("李四");
        list.add("王五");

        //1.传统方法，找出姓张的人，并且是三个字的，把它添加到新的数组中
        List<String> newList=new ArrayList<>();
        for (String name : list) {
            if(name.startsWith("张") && name.length()==3){
                newList.add(name);
            }
        }
        System.out.println(newList);

        //2.使用Stream流
        List<String> newList2 = list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).collect(Collectors.toList());

        /*
        * stream流使用方法
        * 1.获取stream流：stream流代表一条流水线，并能够对数据进行操作
        * 2.调用流水线的方法：对数据进行操作
        * 3.获取结果，遍历、统计、收集到一个新的集合中返回
        * */

    }
}
