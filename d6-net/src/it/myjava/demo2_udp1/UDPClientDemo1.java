package it.myjava.demo2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        /*
        * 目标：完成UDP通信一发一收：客户端开发
        *
        * */
        System.out.println("UDP客户端启动...");
        //1.创建UDP客户端对象（发送端）
        DatagramSocket socket=new DatagramSocket();

        //2.创建数据，并把数据打包
        byte[] bytes="hello,UDP".getBytes();
        /*
        * DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        * buf:数据源
        * length:数据源的长度
        * address:数据的目的地址
        * port:数据目的端口
        * */
        DatagramPacket packet=new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 10086);

        //3.发送数据
        socket.send(packet);

        socket.close();
    }
}
