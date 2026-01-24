package it.myjava.demo4_tcp;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        /*
        * 目标：实现TCP通信下的一发一收：客户端开发
        * */

        System.out.println("客户端启动了...");
        //1.创建Socket管道对象，请求与服务器的Socket连接，可靠连接
        Socket socket=new Socket("127.0.0.1",8888);

        //2.从管道中得到一个字节输出流，写数据
        OutputStream os = socket.getOutputStream();

        //3.特殊数据流
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeInt(10086);
        dos.writeUTF("hello,TCP");

        //4.关闭管道
        socket.close();


    }
}
