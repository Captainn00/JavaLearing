package it.myjava.javapro1.d3_enum;

public class Text {
    public static void main(String[] args) {
        //枚举
        A a1=A.X;
        System.out.println(a1);//X

        //1.枚举的构造器是私有的，不能对外创建对象
        //A a=new A();    报错

        //2.枚举类的第一行都是常量，记住的是枚举类的对象
        A a2=A.Y;

        //3.枚举提供一些额外的API
        A[] as=A.values();//拿到全部对象
        A a3=A.valueOf("Z");
        System.out.println(a3.name());//Z
        System.out.println(a3.ordinal());//索引
    }
}













