package it.myjava.javapro1.d7_Interface;

public class TextC {
    public static void main(String[] args) {
        /**
         * 接口注意事项
         * 1.一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承
         * 2.一个类继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承
         * 3.一个类继承了父类，又同时实现了接口，父类中和接口中有同名的默认方法，实现类会优先使用父类的
         * 4.一个类继承多个接口，多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可
         */

        Zi zi=new Zi();
        zi.f();
    }
}
//1.一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承
interface a{
    void f();
}
interface b{
    String f();
}
//interface c extends a,b{}

//2.一个类继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承
//class c implements a,b{}

interface f{
    default void f(){
        System.out.println("接口f方法执行了");
    }
}
class Zi extends fu implements f{

}

//4.一个类继承多个接口，多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可
interface t1{
    default void f(){

    }
}
interface t2{
    default void f(){

    }
}
class c implements t1,t2{

    @Override
    public void f() {
        //t1.super.f();
    }
}

















