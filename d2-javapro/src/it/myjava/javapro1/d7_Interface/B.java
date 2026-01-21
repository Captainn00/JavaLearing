package it.myjava.javapro1.d7_Interface;

 interface B {
    /**
     * 1.默认方法：必须使用default修饰，默认会被public修饰
     * 实例方法：对象的方法，必须使用实现类的对象来访问
     */
    public default void text1(){
        System.out.println("默认方法");
        text2();
    }

    /**
     * 2.私有方法：必须使用private修饰
     * 实例方法：对象的方法
     */
    private void text2(){
        System.out.println("私有方法");
    }

    /**
     * 3.静态方法：必须使用static修饰，默认会被public修饰
     *
     */
    static void text3(){
        System.out.println("静态方法");
    }

}












