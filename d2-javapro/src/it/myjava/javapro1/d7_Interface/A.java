package it.myjava.javapro1.d7_Interface;

public interface A
{

    /**
     * 接口
     * 没有构造器和代码块
     * 不能创建对象；接口是用来被类实现（implements）的，实现接口的类称为实现类
     * 一个类可以实现多个接口，实现类实现多个接口，必须重写完全部接口的全部抽象方法，
     * 否则实现类需要定义为抽象类
     */

    //成员变量（常量）
    String name="超人";

    //成员方法（抽象方法）
    void text();
}
