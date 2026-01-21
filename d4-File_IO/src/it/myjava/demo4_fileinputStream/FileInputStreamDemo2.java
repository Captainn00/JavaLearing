package it.myjava.demo4_fileinputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        /* *
         * 掌握文件字节输入流读取文件中的字节数组到内存中
         * */

        //1.创建文件字节输入流对象
        //InputStream is=new FileInputStream(new File("d4-File_IO\\src\filedemo2.txt"));
        InputStream is=new FileInputStream("d4-File_IO\\src\\filedemo2.txt");

        //2.开始读取文件中的字节并输出：每次读取多个字节
        byte[] buffer=new byte[3]; //定义一个字节数组，每次读取3个字节
        int len; //定义一个int变量，记录每次读取的字节个数
        while((len=is.read(buffer))!=-1){
            System.out.print(new String(buffer,0,len));
        }
        //每次读取多个字节的问题:性能好，但遇到汉字也可能会乱码

        is.close();

    }
}
