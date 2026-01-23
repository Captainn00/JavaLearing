package demo1_create;

public class ThreadDemo1 {
    public static void main(String[] args) {

        /*
        * 掌握多线程的创建方式一：继承Thread类
        * */
        Thread t=new MyThread();
        t.start();
        for (int i = 0; i < 3; i++) {
            System.out.println("主线程正在执行："+ i);
        }

    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程正在执行："+ i);
        }
    }
}
