package it.myjava.collection_map_stream.d3_colletion_Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
    private List<Card> allCards=new ArrayList<>();
    public Room(){
        //1.做出54张牌
        //1）点数：个数确定，类型确定，用数组
        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //2) 花色：个数确定，类型确定，用数组
        String[] colors={"♠","◆","♣","♥"};
        int size=0;
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                Card c=new Card(number,color,size);
                allCards.add(c);
            }
        }
        //单独存入大小王
        Card c1=new Card("","🃏",++size);
        Card c2=new Card("","👨",++size);
        Collections.addAll(allCards,c1,c2);
        System.out.println(allCards);
    }


    public void start() {
        //1.洗牌
        Collections.shuffle(allCards);
        //2.发牌
        List<Card> xiaoWang=new ArrayList<>();
        List<Card> xiaoCao=new ArrayList<>();
        List<Card> xiaoLiu=new ArrayList<>();
        for (int i = 0; i < allCards.size()-3; i++) {
            Card c=allCards.get(i);
            if(i%3==0){
                xiaoWang.add(c);
            }else if(i%3==1){
                xiaoCao.add(c);
            }else if(i%3==2){
                xiaoLiu.add(c);
            }
        }
        //3.排序
        sortCards(xiaoWang);
        sortCards(xiaoCao);
        sortCards(xiaoLiu);

        //4.看牌
        System.out.println("xiaoWang"+xiaoWang);
        System.out.println("xiaoCao"+xiaoCao);
        System.out.println("xiaoLiu"+xiaoLiu);
        List<Card> LastThreeCards=allCards.subList(allCards.size()-3,allCards.size());
        System.out.println("底牌"+LastThreeCards);



    }

    private void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getSize()-o1.getSize();
            }
        });
    }
}
