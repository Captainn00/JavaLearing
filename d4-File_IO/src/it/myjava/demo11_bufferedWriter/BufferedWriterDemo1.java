package it.myjava.demo11_bufferedWriter;

import java.io.*;

public class BufferedWriterDemo1 {

    public static void main(String[] args) {
        /*
         * 使用缓冲字符输出流读取数据，新增newLine换行
         * */

        try (
                //Writer bw = new FileWriter("d4-File_IO\\src\\filedemo6.txt") //覆盖管道
                Writer fw = new FileWriter("d4-File_IO\\src\\filedemo6.txt",true); //追加管道
                BufferedWriter bw=new BufferedWriter(fw);
        ) {

            //写一个字符出去

            bw.write('a');
            bw.write(98);
            bw.write('金');
            bw.newLine();

            //写一个字符串出去
            bw.write("hello");
            bw.newLine();


            //写一个字符串的部分出去
            bw.write("hello",0,2);
            bw.newLine();


            //写一个字符串数组出去
            char[] chs=new char[]{'a','b'};
            bw.write(chs);
            bw.newLine();


            //写一个字符串数组的一部分出去
            bw.write(chs,0,1);
            bw.newLine();


            /*bw.flush(); //刷新缓冲区,将缓冲区中的数据写出去，但是不会关闭流
            bw.close(); //关闭流，关闭包含了刷新！关闭后，缓冲区清空，不能再次使用！
*/
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
