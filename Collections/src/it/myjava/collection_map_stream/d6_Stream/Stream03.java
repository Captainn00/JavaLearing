package it.myjava.collection_map_stream.d6_Stream;

import java.util.ArrayList;
import java.util.List;

public class Stream03 {
    /*
    * 目标；掌握Stream提供的中间方法，对流上的数据进行处理，返回一个新的流（支持链式编程）
    * */
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("张三");
        list.add("张哈哈");
        list.add("张三丰");
        list.add("李四");
        list.add("王五");

        //1.过滤方法 filter(Predicate p)
        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);

        //2.排序方法 sorted()
        List<Double> scores=new ArrayList<>();
        scores.add(99.9);
        scores.add(66.6);
        scores.add(77.7);
        scores.add(88.8);
        scores.add(88.8);
        scores.stream().sorted().forEach(System.out::println);//默认升序
        System.out.printf("-----------------");
        scores.stream().sorted((s1,s2)->Double.compare(s2,s1)).forEach(System.out::println);
        System.out.printf("-----------------");
        //只要前两个
        scores.stream().sorted((s1,s2)->Double.compare(s2,s1)).limit(2).forEach(System.out::println);
        System.out.printf("-----------------");
        //跳过前两个
        scores.stream().sorted((s1,s2)->Double.compare(s2,s1)).skip(2).forEach(System.out::println);
        System.out.printf("-----------------");
        //去重
        scores.stream().sorted((s1,s2)->Double.compare(s2,s1)).distinct().forEach(System.out::println);



    }
}
