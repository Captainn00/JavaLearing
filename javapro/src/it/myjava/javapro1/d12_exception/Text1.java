package it.myjava.javapro1.d12_exception;

public class Text1 {
    public static void main(String[] args) {
        try{
            saveAge(190);
            System.out.println("底层执行成功");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("底层出现了bug");
        }

    }
    public static void saveAge(int age) throws AgeIllegalRuntimeException {
        if(age>0&&age<150){
            System.out.println("年龄保存成功！");
        }else{
            //用一个异常对象封装这个问题
            //throw 抛出去这个异常对象
            //throws 用在方法上，抛出方法内部的异常
            throw new AgeIllegalRuntimeException("/age is illegal,your age is:"+age);
        }
    }
}
