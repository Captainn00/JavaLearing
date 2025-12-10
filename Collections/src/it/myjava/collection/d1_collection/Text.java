package it.myjava.collection.d1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Text {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        //1.public boolean add(E e) ： 添加元素，添加成功后返回True
        c.add("1");
        c.add("1");
        c.add("1");
        System.out.println(c);
        //2.public void clear（）：清空集合元素
        c.clear();
        //3.public boolean isEmpty(): 判断集合是否为空，是空返回true
        boolean b=c.isEmpty();
        //4.public int size(): 获取集合的大小
        int i=c.size();
        //5.public boolean contains(Object obj): 判断集合中是否包含某个元素
        boolean b2=c.contains("2");
        //6.public boolean remove（E e): 删除某个元素（第一个）
        c.remove("1");
        //7.public Object[] toArray: 把集合转换成数组
        Object[] arr=c.toArray();
        System.out.println(Arrays.toString(arr));


        String[] arr2=c.toArray(new String[c.size()]);//转为指定字符串数组


        System.out.println("-----------------------------------");
        //把一个集合的全部数据倒入到另一个集合中去
        Collection<String> c1=new ArrayList<>();
        c1.add("1");
        c1.add("2");
        Collection<String> c2=new ArrayList<>();
        c2.add("3");
        c2.add("4");
        c2.add("5");
        c1.addAll(c2);//c1和c2数据类型相同,c2中数据不变
        System.out.println(c1);
    }
}
