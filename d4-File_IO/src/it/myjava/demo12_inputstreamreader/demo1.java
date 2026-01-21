package it.myjava.demo12_inputstreamreader;

import java.io.*;

public class demo1 {
    public static void main(String[] args) {

        /*
         * 目标：演示下一个问题：不同编码读取乱码问题
         * 代码：UTF-8   文件：UTF-8   读取不乱码
         * 代码：UTF-8   文件：GBK   读取乱码
         * */

        try (
                Reader fr = new FileReader("d4-File_IO\\src\\filedemo7.txt");
                BufferedReader br = new BufferedReader(fr);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
