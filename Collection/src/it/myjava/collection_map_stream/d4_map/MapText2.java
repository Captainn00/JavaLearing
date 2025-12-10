package it.myjava.collection_map_stream.d4_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@SuppressWarnings("all")
public class MapText2 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        //1.添加元素：无序，不重复，无索引
        map.put("新疆",2);
        map.put("西藏",1);
        map.put("兰州",3);
        map.put(null,null);
        //2.public int size(); 获取集合的大小
        map.size();

        //3.public void clear(); 清空集合
        //map.clear();

        //4.public boolean isEmpty(); 判断集合是否为空
        System.out.println(map.isEmpty());

        //5.public V get(Object key); 根据键获取对应值
        System.out.println(map.get("新疆"));

        //6.public V remove(Object key); 根据键删除整个元素（返回键的值）
        System.out.println(map.remove("西藏"));

        //7.public boolean containsKey(Object key); 判断是否包含某个键，包含返回True
        System.out.println(map.containsKey("新疆"));

        //8.public boolean containsValue(Object Value); 判断是否包含某个值
        System.out.println(map.containsValue(2));

        //9.public Set<K> keySet(); 获取Map集合的全部键
        Set<String> keys=map.keySet();
        System.out.println(map.keySet());

        //10.public Collection<V> values(); 获取Map集合的全部值
        Collection<Integer> values=map.values();
        //11.把其他Map集合的数据倒入到自己集合中来
        Map<String,Integer> map1=new HashMap<>();
        map1.put("a",1);
        map1.put("b",2);
        Map<String,Integer> map2=new HashMap<>();
        map2.put("a",2);
        map2.put("c",2);
        map1.putAll(map2);//把map2中的元素全部倒入map1中
        System.out.println(map1);
        System.out.println(map2);

    }
}
