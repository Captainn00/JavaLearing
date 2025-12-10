package it.myjava.collection.d3_set;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 目标：了解哈希值
 * Java中的所有对象，都可以调用Object类提供的hashCode方法，返回该对象自己的哈希值。
 * public int hashCode();返回对象的哈希值。
 * 同一个对象多次调用hashCode方法返回的哈希值是相同的。
 * 不同的对象，他们的哈希值一般不相同，但也有可能会相同（哈希碰撞）
 */

public class hashCode {
    public static void main(String[] args) {
        HashSet<s> ss=new HashSet<>();



        Set<s> students=new HashSet<>();
        s s1=new s("张三",18);
        s s2=new s("张三",18);
        s s3=new s("李四",18);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        students.add(s1);
        students.add(s2);
        students.add(s3);
        System.out.println(students);
    }
}
class s {
    String name;
    int age;

    public s(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        s student = (s) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}












