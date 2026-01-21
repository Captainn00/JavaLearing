package it.myjava.demo12_inputstreamreader;

import java.io.*;

public class demo2 {
    public static void main(String[] args) {

        /*
         * 目标：使用字符输入转换流解决乱码
         * 代码：UTF-8   文件：UTF-8   读取不乱码
         * 代码：UTF-8   文件：GBK   读取乱码
         * */

        try (
//                Reader fr = new FileReader("d4-File_IO\\src\\filedemo7.txt");
                //先提取文件的原始字节流
                InputStream is=new FileInputStream("d4-File_IO\\src\\filedemo7.txt");
                //指定字符集把原始字节流转换为指定字符集的输入流
                Reader isr=new InputStreamReader(is,"GBK");

                BufferedReader br = new BufferedReader(isr);
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
