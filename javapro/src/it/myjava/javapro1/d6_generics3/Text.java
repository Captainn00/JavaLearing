package it.myjava.javapro1.d6_generics3;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        //掌握泛型方法的定义和使用

        String s=text("love");
        Dog d=text(new Dog());

    }

    //泛型方法
    public static <T> T text(T t){
        return  t;
    }
    public static <T> void text1(T t){

    }
    //? 通配符，在使用泛型时可以代表一切类型

    public static void text1(ArrayList<? extends  Animal> t){

    }
    public static void text2(ArrayList<? super  Animal> t){

    }
}
