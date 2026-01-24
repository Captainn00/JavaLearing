package it.myjava.demo4_tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        /*
        * 目标：实现TCP通信下的一发一收，服务端开发
        * */
        System.out.println("服务端启动了...");
        //1.创建一个服务器ServerSocket对象，绑定端口
        ServerSocket ss=new ServerSocket(8888);

        //2.调用accept方法，阻塞等待客户端连接，一旦有客户端连接，就返回一个Socket对象
        Socket socket=ss.accept();

        //3。获取输入流，读取数据
        InputStream is = socket.getInputStream();

        //4.把字节输入流包装成特殊字符输入流
        DataInputStream dis = new DataInputStream(is);

        //5.读取数据
        int id=dis.readInt();
        String msg=dis.readUTF();
        System.out.println("服务端收到数据："+id+"--"+msg);

        //6.客户端的IP和端口
        String ip=socket.getInetAddress().getHostAddress();
        int port=socket.getPort();
        System.out.println("客户端的IP："+ip);
        System.out.println("客户端的端口："+port);

    }
}
