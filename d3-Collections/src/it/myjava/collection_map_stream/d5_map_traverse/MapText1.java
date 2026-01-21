package it.myjava.collection_map_stream.d5_map_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map 集合的第一种遍历方式：键找值
 */
public class MapText1 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("新疆",2);
        map.put("西藏",1);
        map.put("兰州",3);
        //map.put(null,null);
        //1.获取全部键
        Set<String> keys=map.keySet();
        //2.遍历全部的键，根据键获取对应的值
        for (String key : keys) {

            int value=map.get(key);
            System.out.println(key+"--->"+value);
        }
    }
}
