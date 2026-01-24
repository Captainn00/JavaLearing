package it.myjava.demo6_tcp;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ServerReader extends Thread{
    /*
    * 线程类
    * */
    private Socket socket;
    public ServerReader(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            //3。获取输入流，读取数据
            InputStream is = socket.getInputStream();

            //4.把字节输入流包装成特殊字符输入流
            DataInputStream dis = new DataInputStream(is);

            while (true) {
                //5.读取数据
                String msg=dis.readUTF();
                System.out.println("服务端收到数据："+msg);

                //6.客户端的IP和端口
                String ip=socket.getInetAddress().getHostAddress();
                int port=socket.getPort();
                System.out.println("客户端的IP："+ip);
                System.out.println("客户端的端口："+port);
                System.out.println("------------------------------------------------");
            }
        } catch (Exception e) {
            System.out.println("客户端下线了："+socket.getInetAddress().getHostAddress());
        }
    }
}
