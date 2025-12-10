package it.myjava.javapro1.d3_enum;

public enum B {
    //拓展：抽象枚举
    X(){
        @Override
        public void go() {

        }
    },Y(){
        @Override
        public void go() {

        }
    };
    public abstract void go();
}
