package it.myjava.demo9_bufferedInputStream;

import java.io.*;

public class CopyDemo1 {
    public static void main(String[] args) {

        /*
         * 使用缓冲字节流完成文件的复制
         * jdk7之后关闭资源：try(资源1;资源2;资源3){}
         * */
        //源文件：E:\\1.txt
        //目标文件: D:\\1_copy.txt


        copyFile("E:\\1.txt", "D:\\1_copy.txt");


    }

    private static void copyFile(String srcPath, String destPath) {

        try (
                InputStream is = new FileInputStream(srcPath);
                OutputStream os = new FileOutputStream(destPath);
                //创建缓冲字节输入流
                InputStream bis = new BufferedInputStream(is);
                //创建缓冲字节输出流
                OutputStream bos = new BufferedOutputStream(os);
                ){
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完毕");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
