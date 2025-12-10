package it.myjava.javapro1.d5_generics2;

import java.util.ArrayList;

public interface data<T> {
    void add(T t);
    ArrayList<T> getByName(String name);
}
