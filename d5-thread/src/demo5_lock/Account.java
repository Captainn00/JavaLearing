package demo5_lock;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private double money;
    private final Lock lock=new ReentrantLock();  //加final保护锁

    public synchronized void drawMoney(int money) {
        lock.lock(); //加锁

        try {
            if (money <= this.money) {
                System.out.println(Thread.currentThread().getName() + "取钱成功，取钱金额：" + money);
                this.money -= money;
                System.out.println("余额为：" + this.money);
            } else {
                System.out.println(Thread.currentThread().getName() + "取钱失败，余额不足！");
            }
        } finally {
            lock.unlock(); //解锁
        }

    }
}
