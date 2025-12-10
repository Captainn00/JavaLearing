package it.myjava.javapro1.d11_stringJoiner;

import java.util.StringJoiner;

public class Text {
    public static void main(String[] args) {
        //StringJoiner s=new StringJoiner(",");
        StringJoiner s=new StringJoiner(",","[","]");
        s.add("1");
        s.add("1");
        s.add("1");
        
    }
}
