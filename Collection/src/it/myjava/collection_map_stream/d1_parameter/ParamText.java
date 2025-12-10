package it.myjava.collection_map_stream.d1_parameter;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 认识可变参数，掌握其作用
 */
public class ParamText {
    public static void main(String[] args) {
        //...
        //特点
        text();//不传数据
        text(1);//传一个数据
        text(1,2,2);//传输多个数据
        text(new int[]{1,23,10});//数组
    }
    //注意事项1：一个形参列表中，只能有一个可变参数
    //注意事项2：可变参数必须放在形参列表的最后面
    public static void text(int...num){
        //可变参数在方法内部，本身就是一个数组
        System.out.println(num.length);//有长度
        System.out.println(Arrays.toString(num));
        System.out.println("---------------------------------");
    }
}
