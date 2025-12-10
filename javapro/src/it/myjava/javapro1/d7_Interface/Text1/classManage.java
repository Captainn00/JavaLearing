package it.myjava.javapro1.d7_Interface.Text1;

import java.util.ArrayList;

public class classManage {
    private ArrayList<student> students=new ArrayList<>();
    private studentOperator so=new studentOperatorlmpl2();
    public classManage(){
        students.add(new student("张三",'男',20));
        students.add(new student("李四",'男',20));
        students.add(new student("李四",'男',20));
    }

    //打印全班学生信息
    public void printInfo(){
        so.printAllInfo(students);
    }
    //打印全班学生平均分
    public void printScore(){
        so.printAverageScore(students);
    }
}























