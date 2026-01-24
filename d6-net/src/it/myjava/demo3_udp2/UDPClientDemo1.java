package it.myjava.demo3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        /*
        * 目标：完成UDP通信一发一收：客户端开发
        *
        * */
        System.out.println("UDP客户端启动...");
        //1.创建UDP客户端对象（发送端）
        DatagramSocket socket=new DatagramSocket();

        Scanner sc=new Scanner(System.in);
        while (true) {
            //2.创建数据，并把数据打包
            System.out.println("请输入要发送的数据：");
            String data=sc.nextLine();

            if("exit".equals( data)){
                System.out.println("UDP客户端退出...");
                socket.close();
                break;
            }

            byte[] bytes=data.getBytes();
            DatagramPacket packet=new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 10086);

            //3.发送数据
            socket.send(packet);
        }

        socket.close();
    }
}
