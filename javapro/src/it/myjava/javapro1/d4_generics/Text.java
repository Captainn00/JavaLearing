package it.myjava.javapro1.d4_generics;


import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {

        //泛型
        ArrayList<String> list=new ArrayList<>();
        MyArrayList<String> list2=new MyArrayList<>();

        MyClass3<Animal> c=new MyClass3<Animal>();
        MyClass3<cat> c2=new MyClass3();
    }
}












