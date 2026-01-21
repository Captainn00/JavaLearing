package it.myjava.collection_map_stream.d7_Game;

import java.util.*;

public class Room {

    //准备54张牌
    private List<Card> allCards=new ArrayList<>();
    //2.初始化54张牌
    {
        //3.准备点数
        String[] sizes={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //4.准备花色
        String[] colors={"♥","♦","♣","♠"};
        //5.组合点数和花色
        int num=0;
        for (String size : sizes) {
            num++;
            for (String color : colors) {
                Card card=new Card(size, color,num);
                allCards.add(card);
            }
        }
//        allCards.add(new Card("小王","🃏"));
//        allCards.add(new Card("大王","🃏"));
        Collections.addAll(allCards,new Card("小王","🃏",++num),new Card("大王","🃏",++num));
        System.out.println("新牌是："+allCards);
    }

    public void start() {
        //洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后："+allCards);

        //发牌：定义三个玩家
        Map<String,List<Card>> players=new HashMap<>();
        List<Card> xiaoWang=new ArrayList<>();
        players.put("小王",xiaoWang);
        List<Card> xiaoLi=new ArrayList<>();
        players.put("小李",xiaoLi);
        List<Card> xiaoLiu=new ArrayList<>();
        players.put("小六",xiaoLiu);

        for (int i = 0; i < allCards.size()-3; i++) {
            Card c=allCards.get(i);
            if(i%3==0){
                xiaoWang.add(c);
            }else if(i%3==1){
                xiaoLi.add(c);
            }else{
                xiaoLiu.add(c);
            }
        }

        //对牌排序
        sortCards(xiaoLiu);
        sortCards(xiaoLi);
        sortCards(xiaoWang);



        //抢地主
        List<Card> lastCards = allCards.subList(allCards.size() - 3, allCards.size());
        //随机抢地主
        int index = (int)(Math.random()*3);
        String name = index==0?"小王":index==1?"小李":"小六";
        players.get(name).addAll(lastCards);
        System.out.println("抢地主是："+name);

        //看牌
        System.out.println("底牌是："+lastCards);
        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            System.out.println(entry.getKey()+"的牌是："+entry.getValue());

        }



    }
    private void sortCards(List<Card> cards){
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getNum()-o1.getNum();
            }
        });
    }
}
