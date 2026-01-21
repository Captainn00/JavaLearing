package it.myjava.collection.d1_collection;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class lambda {
    public static void main(String[] args) {
        //Lambda
        Collection<String> c=new ArrayList<>();
        c.add("1");
        c.add("2");
        c.add("3");

        //default void forEach(Consumer<? super T> action)   结合Lambda表达式遍历集合
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //简化
        c.forEach((String s)-> {
                System.out.println(s);

        });

        //简化
        c.forEach(s-> {
            System.out.println(s);

        });

        //简化
        c.forEach(s->
            System.out.println(s));

        //简化
        c.forEach(System.out::println);
    }
}









