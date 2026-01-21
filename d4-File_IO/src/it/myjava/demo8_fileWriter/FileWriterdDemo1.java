package it.myjava.demo8_fileWriter;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterdDemo1 {
    public static void main(String[] args) {

        try (
                //Writer fw = new FileWriter("d4-File_IO\\src\\filedemo6.txt") //覆盖管道
                Writer fw = new FileWriter("d4-File_IO\\src\\filedemo6.txt",true)  //追加管道
        ) {

            //写一个字符出去
            fw.write('a');
            fw.write(98);
            fw.write('金');
            fw.write("\r\n");

            //写一个字符串出去
            fw.write("hello");
            fw.write("\r\n");

            //写一个字符串的部分出去
            fw.write("hello",0,2);
            fw.write("\r\n");

            //写一个字符串数组出去
            char[] chs=new char[]{'a','b'};
            fw.write(chs);
            fw.write("\r\n");

            //写一个字符串数组的一部分出去
            fw.write(chs,0,1);
            fw.write("\r\n");

            /*fw.flush(); //刷新缓冲区,将缓冲区中的数据写出去，但是不会关闭流
            fw.close(); //关闭流，关闭包含了刷新！关闭后，缓冲区清空，不能再次使用！
*/
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
