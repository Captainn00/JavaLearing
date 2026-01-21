package it.myjava.collection.d4_exception;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionText1 {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("小王");
        list.add("小李");
        list.add("大李");
        list.add("大王");
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String name=it.next();
            if(name.contains("王")){
                //list.remove(name);//并发修改异常的错误
                it.remove();//删除迭代器当前遍历到的数据，每删除一个数据后，相当于也在底层做了i--
            }

        }
        //使用增强for循环遍历集合并删除元素，是没有办法解决bug的
        System.out.println(list);
    }
}
