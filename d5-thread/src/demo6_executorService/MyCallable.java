package demo6_executorService;

import java.util.concurrent.Callable;

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
        return Thread.currentThread().getName()+"计算1~"+n+"的和为："+sum;
    }
}