package it.myjava.demo6_copy;

import java.io.*;

public class CopyDemo1 {
    public static void main(String[] args) {

        /*
         * 使用字节流完成文件的复制
         * */
        //源文件：E:\\1.txt
        //目标文件: D:\\1_copy.txt


        copyFile("E:\\1.txt", "D:\\1_copy.txt");


    }

    private static void copyFile(String srcPath, String destPath) {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(srcPath);
            os = new FileOutputStream(destPath);

            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完毕");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放资源
            try {
                if(os!=null) os.close();
            }  catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if(is!=null) is.close();
            }  catch (Exception e) {
                e.printStackTrace();
            }


        }

    }
}
