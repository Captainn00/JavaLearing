package it.myjava.demo14_commonsIo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CommonsIoDemo1 {
    public static void main(String[] args) throws Exception {
        //IO框架
        FileUtils.copyFile(new File("d4-File_IO\\src\\filedemo5.txt"),new File("d4-File_IO\\src\\filedemo5_copy.txt"));

        //jdk7提供
//        Files.copy(new File("d4-File_IO\\src\\filedemo5.txt").toPath(),new File("d4-File_IO\\src\\filedemo5_copy.txt").toPath())



    }
}
