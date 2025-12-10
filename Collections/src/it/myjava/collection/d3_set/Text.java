package it.myjava.collection.d3_set;

import java.util.Set;
import java.util.TreeSet;

public class Text {
    public static void main(String[] args) {
        //1.创建一个Set集合的对象
        //Set<Integer> set=new HashSet<>();//创建了一个HashSet的集合对象。（一行经典代码）/无序，不重复，无索引
        //Set<Integer> set=new LinkedHashSet<>();//  /有序，不重复，无索引
        Set<Integer> set=new TreeSet<>();//  /可排序，不重复，无索引
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        System.out.println(set);
        //若希望一个类产生的对象在集合中不重复，可重写equals方法和hashCode方法
    }
}
