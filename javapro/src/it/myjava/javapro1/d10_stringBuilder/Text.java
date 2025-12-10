package it.myjava.javapro1.d10_stringBuilder;

import java.lang.ref.SoftReference;

public class Text {
    public static void main(String[] args) {
        //StringBuilder s=new StringBuilder();//“”
        StringBuilder s=new StringBuilder("love");//"love"

        //1.拼接内容
        s.append("free");
        s.append(10);
        s.append(true);
        System.out.println(s);

        //支持链式拼接
        s.append(1).append(2);
        System.out.println(s);

        //2.反转操作
        s.reverse();
        System.out.println();

        //3.返回字符串的长度
        System.out.println(s.length());

        //4.转换成String类型
        String rs=s.toString();
        System.out.println(rs);




    }
}
