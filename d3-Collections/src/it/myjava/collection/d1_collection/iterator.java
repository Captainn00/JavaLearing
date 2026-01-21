package it.myjava.collection.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        //Collection集合的遍历方式之一：使用Iterator遍历
        Collection<String> c=new ArrayList<>();
        c.add("1");
        c.add("2");
        c.add("3");
        System.out.println(c);
        //c=[1,2,3]

        //1.从集合对象中获取迭代器对象
        Iterator<String> it=c.iterator();
        //it.next() 返回当前元素并移动到下一元素
        System.out.println(it.next());
        //it.hasNext()  判断当前位置是否有数据
        while (it.hasNext()){
            String ele=it.next();
            System.out.println(ele);
        }
    }
}
