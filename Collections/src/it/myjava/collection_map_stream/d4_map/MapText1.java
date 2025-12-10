package it.myjava.collection_map_stream.d4_map;

import java.util.*;

/**
 * 掌握map集合的特点
 */
public class MapText1 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();//经典代码，按照键 / 无序，不重复，无索引
        map.put("小兔",6);
        map.put("小猫",2);
        map.put("小狗",2);
        map.put("小猫",3);//后面重复的数据会覆盖前面的数据（键）

        System.out.println(map);


        Map<String,Integer> map2=new LinkedHashMap<>();//有序，不重复，无索引
        map2.put("小猫",2);
        map2.put("小狗",2);
        map2.put("小猫",3);//后面重复的数据会覆盖前面的数据（键）
        map2.put("小兔",6);
        System.out.println(map2);

        Map<Integer,String> map3=new TreeMap<>();//可排序，不重复，无索引
        map3.put(2,"小猫");
        map3.put(2,"小狗");//后面重复的数据会覆盖前面的数据（键）
        map3.put(3,"小猫");
        map3.put(6,"小兔");
        System.out.println(map3);
    }
}
