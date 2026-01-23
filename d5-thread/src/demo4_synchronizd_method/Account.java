package demo4_synchronizd_method;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private double money;

    public synchronized void drawMoney(int money) {

        if (money <= this.money) {
            System.out.println(Thread.currentThread().getName() + "取钱成功，取钱金额：" + money);
            this.money -= money;
            System.out.println("余额为：" + this.money);
        } else {
            System.out.println(Thread.currentThread().getName() + "取钱失败，余额不足！");
        }

    }
}
