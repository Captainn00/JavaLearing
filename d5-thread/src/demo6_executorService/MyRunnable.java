package demo6_executorService;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+"线程："+i);
            if(i==1){
                try {
                    Thread.sleep(Integer.MAX_VALUE);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
