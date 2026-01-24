package it.myjava.demo1_inetaddress;

import java.net.InetAddress;

public class InetAddresssDemo1 {
    public static void main(String[] args) {
        /*
        *
        * 认识InetAddress获取本机的IP对象和对方的IP对象
        *
        * */

        try {
            //获取本机的IP对象
            InetAddress ip1 = InetAddress.getLocalHost();
            System.out.println(ip1);
            System.out.println(ip1.getHostName()); //本机的主机名
            System.out.println(ip1.getHostAddress()); //本机的IP地址

            //获取对方的IP对象
            InetAddress ip2 = InetAddress.getByName("www.baidu.com");
            System.out.println(ip2);
            System.out.println(ip2.getHostName());
            System.out.println(ip2.getHostAddress());

            //判断本机与对方主机是否互通
            System.out.println(ip2.isReachable(5000)); //5000毫秒
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
