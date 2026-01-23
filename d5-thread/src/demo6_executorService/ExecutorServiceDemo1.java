package demo6_executorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo1 {
    public static void main(String[] args) {

        /*
        * 创建线程池对象来使用
        * */

        //1,使用线程池的实现类ThreadPoolExecutor创建线程池对象
        ExecutorService pool=new ThreadPoolExecutor(3,5,10,
                TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(3),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        //2.使用线程池处理任务，看会不会复用线程
        Runnable r=new MyRunnable();
        pool.execute(r); //提交第一个任务，创建第一个线程，自动启动线程处理这个任务
        pool.execute(r); //提交第二个任务，创建第二线程
        pool.execute(r); //提交第三个任务，创建第三个线程
        pool.execute(r); //复用线程
        pool.execute(r); //复用线程
        pool.execute(r);
        pool.execute(r); //到了临时线程的创建时机
        pool.execute(r); //到了临时线程的创建时机
        pool.execute(r); //到了拒绝策略

        //3..关闭线程池,一般不关闭线程池，线程池会自动关闭
        pool.shutdown(); //等所有任务执行完毕，再关闭线程池
//        pool.shutdownNow(); //不等所有任务执行完毕，就关闭线程池

    }
}
