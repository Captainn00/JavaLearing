package it.myjava.javapro1.d2_inner;

public class Text {
    public static void main(String[] args) {
        //匿名内部类，通常作为参数直接传给方法
//        Swimming s1=new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("狗游泳很快");
//            }
//        };
//        go(s1);
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗游泳很快");
            }
        });

    }
    public static void go(Swimming s){
        s.swim();
    }
}

interface Swimming{
    public void swim();
}





