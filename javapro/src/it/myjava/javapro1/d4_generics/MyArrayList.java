package it.myjava.javapro1.d4_generics;

public class MyArrayList <E>{
    //泛型类
    private Object[] arr=new Object[10];
    private int size;
    public boolean add(E e){
        arr[size++]=e;
        return true;
    }
    public E get(int index){


        return (E) arr[index];
    }
}

















