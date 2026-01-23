package demo1_create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) {
        /*
        * 掌握多线程的创建方式三：实现Callable接口，优势：线程有返回值
        * */
        Callable<String> c1=new MyCallable(100);
        //把Callable对象包装成FutureTask对象
        /*
        * 未来任务对象的作用
        * 1.可以获取Callable线程的返回值
        * 2.本质是一个Runnable线程任务对象，可以交给Thread对象处理
        * */
        FutureTask<String> ft1=new FutureTask<>(c1);
        Thread t1=new Thread(ft1);
        t1.start();

        Callable<String> c2=new MyCallable(100);
        FutureTask<String> ft2=new FutureTask<>(c2);
        Thread t2=new Thread(ft2);
        t2.start();

        try {
            System.out.println(ft1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(ft2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return "计算1~"+n+"的和为："+sum;
    }
}