package it.myjava.demo2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServerDemo2 {
    public static void main(String[] args) throws Exception {
        /*
        * 目标：完成UDP通信一发一收：服务端开发
        * */

        System.out.println("服务端启动了...");
        //1.创建UDP服务端对象
        DatagramSocket socket=new DatagramSocket(10086);

        //2.创建一个数据包对象，用于接收数据
        byte[] bytes=new byte[1024*64];
        DatagramPacket packet=new DatagramPacket(bytes, bytes.length);

        //3.接收数据
        socket.receive(packet);

        //4.检查数据是否收到了
        int length=packet.getLength();
        String data=new String(bytes, 0, length);
        System.out.println("服务端收到数据："+data);

        //获取对方的IP和端口
        String ip=packet.getAddress().getHostAddress();
        int port=packet.getPort();
        System.out.println("对方的IP："+ip);
        System.out.println("对方的端口："+port);

        socket.close();
    }
}
