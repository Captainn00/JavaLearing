package it.myjava.javapro1.d7_Interface.Text1;

import java.util.ArrayList;

public class studentOperatorlmpl1 implements studentOperator {

    @Override
    public void printAllInfo(ArrayList<student> students) {
        System.out.println("--------------全班学生信息-------------------");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("姓名："+students.get(i).getName()+"，性别："+students.get(i).getSex()+"，分数："+students.get(i).getScore());
        }
        System.out.println("------------------------------------------");
    }

    @Override
    public void printAverageScore(ArrayList<student> students) {
        double allScores=0;
        for (int i = 0; i < students.size(); i++) {
            allScores+=students.get(i).getScore();
        }
        System.out.println("平均分："+allScores/students.size());
    }
}






















