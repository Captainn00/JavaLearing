package it.myjava.collection.d2_list;

import java.util.ArrayList;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        //ArrayList和 LinkedList 继承接口 List
        //List 集合支持的遍历方式：for循环（因为List集合有索引）、迭代器、增强for循环、Lambda表达式

        //1.创建一个ArrayList集合对象（有序、可重复、有索引）
        List<String> list =new ArrayList<>();//经典代码
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");


        //2.public void add (int index.E element): 在某个索引位置插入元素
        list.add(2,"--");

        //3.public E remove(int index): 根据索引删除元素，返回被删除元素
        list.remove(2);
        System.out.println(list);
        //4.public get(int index): 返回集合中指定位置的元素
        list.get(2);

        //5.public E set(int index,E element): 修改索引位置处的元素，修改成功后，会返回原来的数据
        list.set(2,"**");

    }
}
