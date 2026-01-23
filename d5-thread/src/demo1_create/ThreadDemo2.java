package demo1_create;

public class ThreadDemo2 {
    public static void main(String[] args) {
        /*
        * 掌握线程的创建方式二：实现Runnable接口
        * */
        Runnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程："+i);
        }
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程："+i);
        }
    }
}
