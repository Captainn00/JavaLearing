package it.myjava.api;

public class Example01 {
    public static void main(String[] args) throws Exception {
        String str1 = new String();// 创建一个空的字符串
        String str2 = new String("abcd");// 创建一个内容为abcd的字符串
        char[] charArray = new char[] { 'D', 'E', 'F' };// 创建一个内容为字符数组的字符串
        String str3 = new String(charArray);
        byte[] arr = {97,98,99};
        String str4 = new String(arr);// 创建一个内容为字节数组的字符串
        System.out.println("a" + str1 + "b");
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
