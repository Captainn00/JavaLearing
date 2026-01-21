package it.myjava.demo10_bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderDemo1 {
    public static void main(String[] args) {
        /*
         * 使用缓冲字符输入流读取数据，新增readLine()
         * */

        try (
                //创建文件字符输入流 与源文件接通
                Reader fr = new FileReader("d4-File_IO\\src\\filedemo5.txt");
                BufferedReader br=new BufferedReader(fr);
        ) {
//            //定义一个字符数组，每次读多个字符
//            char[] chs=new char[3];
//            int len;
//            while((len=br.read(chs))!=-1){
//                String str=new String(chs,0,len);
//                System.out.print(str);
//            }

            //按照行读 BufferedReader新增
            //读取文本非常好的方案
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);  //加ln
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
