package it.myjava.collection_map_stream.d5_map_traverse;

import java.util.*;

/**
 * 统计投票人数
 */
public class MapDemo4 {
    public static void main(String[] args) {
        List<String> data=new ArrayList<>();
        String[] places={"A","B","C","D"};
        Random r=new Random();
        for (int i = 1; i <=80 ; i++) {
            int index=r.nextInt(4);
            data.add(places[index]);
        }

        Map<String,Integer> result=new HashMap<>();
        for (String datum : data) {
            if(result.containsKey(datum)){
                result.put(datum,result.get(datum)+1);
            }else {
                result.put(datum,1);
            }
        }
        System.out.println(result);
    }
}
