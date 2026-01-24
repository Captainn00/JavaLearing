package it.myjava.demo6_tcp;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        /*
        * 目标：实现TCP通信下的多发多收：支持多个客户端开发
        * */

        System.out.println("客户端启动了...");
        //1.创建Socket管道对象，请求与服务器的Socket连接，可靠连接
        Socket socket=new Socket("127.0.0.1",8888);

        //2.从管道中得到一个字节输出流，写数据
        OutputStream os = socket.getOutputStream();

        //3.特殊数据流
        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的数据：");
            String data=sc.nextLine();
            if("exit".equals( data)){
                System.out.println("客户端退出...");
                dos.close(); //关闭流
                socket.close(); //关闭Socket
                break;
            }
            dos.writeUTF(data);
            dos.flush();
        }



    }
}
