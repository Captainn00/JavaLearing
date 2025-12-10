package it.myjava.javapro1.d8_object;

public class Text {
    public static void main(String[] args) {
        //掌握object类提供的常用方法
        student s1=new student("张三",29);
        student s2=new student("张三",29);
        //1.toString，一般需要重写
        System.out.println(s1);//相当于System.out.println(s1。toString);

        //2.equals
        System.out.println(s1.equals(s2));

        //3.clone 对象克隆

    }
}
