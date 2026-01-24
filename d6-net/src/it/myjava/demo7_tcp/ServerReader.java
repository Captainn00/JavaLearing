package it.myjava.demo7_tcp;


import java.io.OutputStream;
import java.io.PrintStream;
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
            //给当前对应的浏览器管道响应一个网页数据回去
            OutputStream os=socket.getOutputStream();
            //通过字节输出流包装写出去给浏览器
            //把字节输出流包装成打印流
            PrintStream ps=new PrintStream(os);

            //响应数据给浏览器
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=utf-8");
            ps.println();
            ps.println("<html>");
            ps.println("<head><title>响应结果</title></head>");
            ps.println("<body>");
            ps.println("<h1>hello,TCP</h1>");
            ps.println("</body>");
            ps.println("</html>");

            ps.close();
            socket.close();

        } catch (Exception e) {
            System.out.println("客户端下线了："+socket.getInetAddress().getHostAddress());
        }
    }
}
