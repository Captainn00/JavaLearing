package it.myjava.demo2_recursion;

import java.io.File;

public class FileSearch {
    public static void main(String[] args) {
        /*
         * 完成文件搜索
         * */

        File file = new File("E:\\");
        searchFile(file, "1.txt");

    }

    private static void searchFile(File file, String fileName) {
        if (file == null || !file.exists()) {
            System.out.println("文件不存在");
            return;
        }

        File[] files = file.listFiles();
        if (files != null && files.length > 0) {
            for (File f : files) {
                if (f.isFile()) {
                    if (f.getName().equals(fileName)) {
                        System.out.println("找到文件：" + f.getAbsolutePath());
                    }
                } else {
                    searchFile(f, fileName);
                }
            }
        }




    }
}
