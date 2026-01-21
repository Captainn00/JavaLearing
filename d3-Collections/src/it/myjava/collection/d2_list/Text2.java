package it.myjava.collection.d2_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Text2 {
    public static void main(String[] args) {
        //遍历
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        //for
        for (int i = 0; i < list.size(); i++) {
            String s=list.get(i);
            System.out.println(s);
        }

        //迭代器
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //foreach

        for(String s:list){
            System.out.println(s);
        }

        //JDK 1.8 开始之后的Lambda表达式
        list.forEach(s-> System.out.println(s));
    }
}
