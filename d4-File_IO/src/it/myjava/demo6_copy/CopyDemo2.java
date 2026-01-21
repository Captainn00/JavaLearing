package it.myjava.demo6_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDemo2 {
    public static void main(String[] args) {

        /*
         * 使用字节流完成文件的复制
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
                ){
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完毕");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
