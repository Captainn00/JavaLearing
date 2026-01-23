package demo3_synchronizd_code;

public class ThreadDemo1 {
    public static void main(String[] args) {

        /*
        * 线程同步的方式一：同步代码块
        * */
        Account a=new Account(1000);

        new DrawThread("小明",a).start();
        new DrawThread("小红",a).start();
    }
}

