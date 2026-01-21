package it.myjava.demo5_fileoutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        /*
        * 字节输出流
        * */

        //1.创建文件字节输出流对象
        //OutputStream os = new FileOutputStream("d4-File_IO\\src\\filedemo4.txt");//覆盖管道
        OutputStream os = new FileOutputStream("d4-File_IO\\src\\filedemo4.txt", true); //追加管道

        //2.开始向文件输出流中写入数据
        os.write(97);
        os.write('b');
        os.write("\r\n".getBytes());//换行

        //写字节数组
        byte[] bytes="一颗大草莓".getBytes();
        os.write(bytes);
        os.write("\r\n".getBytes());

        //写一个字节数组的一部分
        os.write(bytes,0,3);
        os.write("\r\n".getBytes());

        os.close();

    }
}
