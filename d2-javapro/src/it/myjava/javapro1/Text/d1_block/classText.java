package it.myjava.javapro1.Text.d1_block;

public class classText {
    static int num=80;
    static  String s;

    //静态代码块
    static {
        System.out.println("静态代码执行了");
    }

    //实例代码块
    {
        System.out.println("实例代码块执行了");
        System.out.println("有人创建了对象："+this);
    }

    public classText(){
        System.out.println("无参构造器执行力");
       // System.out.println("有人创建了对象："+this);
    }
    public classText(String s){
        System.out.println("有参构造器执行力");
      //  System.out.println("有人创建了对象："+this);
    }
}





