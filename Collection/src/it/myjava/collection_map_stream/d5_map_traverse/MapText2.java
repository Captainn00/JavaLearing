package it.myjava.collection_map_stream.d5_map_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map 集合的第二种遍历方式：键值对
 */
public class MapText2 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("新疆",2);
        map.put("西藏",1);
        map.put("兰州",3);
        //map.put(null,null);

        //1.调用Map集合的entrySet方法，把Map集合转换成键值对类型的Set集合
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key=entry.getKey();
            int value=entry.getValue();
            System.out.println(key+"--->"+value);
        }
    }
}
