package demo2_threadapi;

public class ThreadAPIDemo2 {
    public static void main(String[] args) {
        /*
        * join方法：线程插队，让调用这个方法的线程先执行完毕
        * */
        Thread t1=new MyThread2();
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"正在执行："+ i);
            if(i==3){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"正在执行："+ i);
        }
    }
}