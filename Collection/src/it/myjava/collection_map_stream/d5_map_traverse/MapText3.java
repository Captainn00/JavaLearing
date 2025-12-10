package it.myjava.collection_map_stream.d5_map_traverse;

import java.util.HashMap;
import java.util.Map;

/**
 * Map 集合的第三种遍历方式：Lambda
 */
public class MapText3 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("新疆",2);
        map.put("西藏",1);
        map.put("兰州",3);
        map.forEach((k,v)->
            System.out.println(k+"--->"+v)
        );
    }
}
