package it.myjava.collection.d2_list;

import java.util.LinkedList;

/**
 * LinkedList  有序，可重复，有索引
 */

public class Text3 {
    public static void main(String[] args) {
        //1.创建一个队列
        LinkedList<String> queue=new LinkedList<>();
        //入队
        queue.addLast("1");
        queue.addLast("2");
        queue.addLast("3");

        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println("--------------------------");

        //2.创建一个栈对象
        LinkedList<String> stack=new LinkedList<>();
        //压栈push或addFirst
        stack.push("1");
        stack.addFirst("2");
        stack.addFirst("3");

        //出栈pop或removeFirst
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.removeFirst());
    }
}
