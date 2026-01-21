package it.myjava.javapro1.d7_Interface.Text1;

import java.util.ArrayList;

public class studentOperatorlmpl2 implements studentOperator{
    @Override
    public void printAllInfo(ArrayList<student> students) {
        int cnt1=0;
        int cnt2=0;
        System.out.println("--------------全班学生信息-------------------");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("姓名："+students.get(i).getName()+"，性别："+students.get(i).getSex()+"，分数："+students.get(i).getScore());
            if(students.get(i).getSex()=='男'){
                cnt1++;
            }else{
                cnt2++;
            }
        }
        System.out.println("男生人数："+cnt1+",女生人数："+cnt2);
        System.out.println("------------------------------------------");
    }

    @Override
    public void printAverageScore(ArrayList<student> students) {
        double allScores=0.0;
        double max=students.get(0).getScore();
        double min=students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {

            if(students.get(i).getScore()>max){
                max=students.get(i).getScore();
            }
            if(students.get(i).getScore()<min){
                min=students.get(i).getScore();
            }
            allScores+=students.get(i).getScore();
        }
        System.out.println("平均分："+(allScores-max-min)/(students.size()-2));
    }
}
