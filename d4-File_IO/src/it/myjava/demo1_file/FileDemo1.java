package it.myjava.demo1_file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) throws Exception {
        //创建
        File file1=new File("E:\\a.txt");
        System.out.printf("", file1.createNewFile()); //创建文件
        File file2=new File("E:\\b");
        System.out.printf("", file2.mkdir()); //创建文件夹
        File file3=new File("E:\\c\\d");
        System.out.printf("", file2.mkdirs()); //创建多级文件夹
        //判断、获取
        System.out.println(file1.exists()); //判断文件是否存在
        System.out.println(file1.isFile()); //判断是否是文件
        System.out.println(file1.isDirectory()); //判断是否是文件夹
        System.out.println(file1.length()); //获取文件大小
        System.out.println(file1.getAbsolutePath()); //获取绝对路径
        System.out.println(file1.getPath()); //获取路径
        System.out.println(file1.getName()); //获取文件名
        System.out.println(file1.lastModified()); //获取最后修改时间
        //删除
        System.out.println(file1.delete()); //删除文件 (不能删除非空文件夹)

        //遍历
        File file4=new File("E:\\");
        for (File file : file4.listFiles()) {  //获取所有文件
            System.out.println(file);
        }
        System.out.println("-------------");
        for (String name : file4.list()) { //获取文件名
            System.out.println(name);
        }


    }
}
