package it.myjava.demo4_fileinputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo3 {
    public static void main(String[] args) throws Exception {
        /**
         * 掌握文件字节输入流读取文件中的字节数组到内存中
         * */

        //1.创建文件字节输入流对象
        //InputStream is=new FileInputStream(new File("d4-File_IO\\src\filedemo3.txt"));
        InputStream is=new FileInputStream("d4-File_IO\\src\\filedemo3.txt");

        //2.开始读取文件中的字节并输出：一次性读完所有字节（只适合小文件），避免乱码
        byte[] bytes = is.readAllBytes();
        System.out.println(new String(bytes));

        is.close();

    }
}
