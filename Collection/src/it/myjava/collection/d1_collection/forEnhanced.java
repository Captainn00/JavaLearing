package it.myjava.collection.d1_collection;

import java.util.ArrayList;
import java.util.Collection;

public class forEnhanced {
    public static void main(String[] args) {
        //遍历方式  增强for循环
        Collection<String> c=new ArrayList<>();
        c.add("1");
        c.add("2");
        c.add("3");

        for(String ele: c){
            System.out.println(ele);
        }

    }
}
