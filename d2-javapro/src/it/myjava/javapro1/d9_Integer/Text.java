package it.myjava.javapro1.d9_Integer;

public class Text {
    public static void main(String[] args) {
        //掌握包装类的使用
        //int->Integer  char->Character

        //Integer a1=new Integer(6);  过时
        Integer a2=Integer.valueOf(6);
        System.out.println(a2);

        //自动装箱
        Integer a3=2;

        //自动拆箱
        int a4=a3;

        System.out.println("_______________________");

        //1.把基本类型的数据转换成字符串
        Integer a=3;
        String rs1=Integer.toString(a);//"23"
        String rs2=a.toString();//"23"
        String rs3=a+"";//"23"
        System.out.println(rs1+1);//231

        //2.把字符串类型的数值转换成对应的基本类型
        String ageStr="18";
        //int ageI=Integer.parseInt(ageStr);
        int ageI=Integer.valueOf(ageStr);

        String scoreStr="99.5";
        //double score=Double.parseDouble(scoreStr);
        double score=Double.valueOf(scoreStr);



    }
}
