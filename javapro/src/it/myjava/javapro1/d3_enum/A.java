package it.myjava.javapro1.d3_enum;

public enum A {
    //注意：枚举类的第一行必须罗列的是枚举对象的名字
    X,Y,Z;

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
