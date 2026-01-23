package demo2_threadapi;

public class ThreadAPIDemo1 {
    public static void main(String[] args) {

        /*
        * 线程常用方法
        * */
        Thread t1=new MyThread("1号线程");
//        t1.setName("线程1");
        t1.start();
        System.out.println(t1.getName()); //线程名默认为Thread-索引

        Thread t2=new MyThread("2号线程");
//        t2.setName("线程2");
        t2.start();
        System.out.println(t2.getName());

        //获取当前线程
        Thread m=Thread.currentThread();
        m.setName("主线程");
        System.out.println(m.getName());


    }
}
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);  //线程休眠
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"正在执行："+ i);
        }
    }
}
