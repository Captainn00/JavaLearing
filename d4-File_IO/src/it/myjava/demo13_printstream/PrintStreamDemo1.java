package it.myjava.demo13_printstream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) {
        /*
        * 打印流的使用
        * */

        try(
                PrintStream ps = new PrintStream(new FileOutputStream("d4-File_IO\\src\\filedemo8.txt",true))

        ){
            ps.println("hello");
            ps.println(123);
            ps.println(true);
            ps.println(12.34);
            ps.println('a');
            ps.println(97);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
