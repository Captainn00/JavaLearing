package it.myjava.demo4_fileinputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        /* *
         * 掌握文件字节输入流读取文件中的字节数组到内存中
         * */

        //1.创建文件字节输入流对象
        //InputStream is=new FileInputStream(new File("d4-File_IO\\src\filedemo1.txt"));
        InputStream is=new FileInputStream("d4-File_IO\\src\\filedemo1.txt");

        //2.开始读取文件中的字节并输出：每次读取一个字节
        int b;
        while((b=is.read())!=-1){
            System.out.print((char)b);
        }
        //每次读取一个字节的问题:性能较差，遇到汉字会乱码

        is.close();

    }
}
