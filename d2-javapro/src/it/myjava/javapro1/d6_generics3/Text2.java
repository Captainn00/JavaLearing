package it.myjava.javapro1.d6_generics3;

import java.util.ArrayList;

public class Text2 {
    public static void main(String[] args) {
        //理解泛型注意事项
        //1.泛型是工作在编译阶段的，一定那程序编译成class文件，class文件中就不存在泛型了，这就是泛型擦除
        //2.泛型不支持基本数据类型（int，double等），只能支持对象类型（引用数据类型)
        ArrayList<Integer> List1=new ArrayList<>();//int
        ArrayList<Double> List2=new ArrayList<>();//double

    }
}
