package it.myjava.demo6_tcp;


import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        /*
         * 目标：实现TCP通信下的多发多收，服务端开发，支持多个客户端开发
         * */
        System.out.println("服务端启动了...");
        //1.创建一个服务器ServerSocket对象，绑定端口
        ServerSocket ss=new ServerSocket(8888);

        while (true) {
            //2.调用accept方法，阻塞等待客户端连接，一旦有客户端连接，就返回一个Socket对象
            Socket socket=ss.accept();
            System.out.println("一个客户端连接了："+socket.getInetAddress().getHostAddress());
            new ServerReader(socket).start();
        }


    }
}
