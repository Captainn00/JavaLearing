package it.myjava.api;

public class Example04 {
    public static void main(String[] args) {
        String s = "swpu.edu";
        // 字符串替换操作
        System.out.println("将swpu替换成cn.swpu的结果:" + s.replace("swpu", "cn.swpu"));
        // 字符串去除空格操作
        String s1 = "     s w p u     ";
        System.out.println("去除字符串两端空格后的结果:" + s1.trim());
        System.out.println("去除字符串中所有空格后的结果:" + s1.replace(" ", ""));
    }
}
