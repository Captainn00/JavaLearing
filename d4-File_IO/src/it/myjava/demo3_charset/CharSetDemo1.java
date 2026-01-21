package it.myjava.demo3_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws Exception {
        //编码
        String s="一颗大草莓123456";
        byte[] bs=s.getBytes("GBK");
        System.out.println(bs.length);
        System.out.println(Arrays.toString(bs));

        //解码
        String s1=new String(bs,"GBK");
        System.out.println(s1);

    }
}
