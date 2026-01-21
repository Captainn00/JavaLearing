package it.myjava.collection.d3_set;


import java.util.HashSet;

public class Text2 {
    public static void main(String[] args) {
        HashSet<Student2> s =new HashSet<>();

        Student2 stu1=new Student2("1","q",1);
        Student2 stu2=new Student2("1","q",2);
        Student2 stu3=new Student2("2","q",2);

        s.add(stu1);
        s.add(stu2);
        s.add(stu3);
        System.out.println(s);
    }

}


