package it.myjava.demo7_fileReader;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo1 {
    public static void main(String[] args) {
        /*
         * 字符输入流
         * 1.文件字符输入流每次读取多个字符，性能较好
         * 2.是按照字符读取，不会出现乱码，只是一种读取中文较好的方案
         *
         * */

        try (
                //创建文件字符输入流 与源文件接通
                Reader fr = new FileReader("d4-File_IO\\src\\filedemo5.txt")
        ) {
            //定义一个字符数组，每次读多个字符
            char[] chs=new char[3];
            int len;
            while((len=fr.read(chs))!=-1){
                String str=new String(chs,0,len);
                System.out.print(str);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
