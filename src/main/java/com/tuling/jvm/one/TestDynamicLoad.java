package com.tuling.jvm.one;

public class TestDynamicLoad {
    static{
        System.out.println("**************load TestDynamicLoad *****************************");
    }
    public static void main(String[] args) {
        new A();
        System.out.println("****************loat test****************************");
        B b =null;
    }
    static class A{
        static {
            System.out.println("*************load A************");
        }
        public A (){
            System.out.println("*************initial A************");
        }
    }
    static class B{
        static {
            System.out.println("*************load B************");
        }
        public B ()  {
            System.out.println("*************initial B************");
        }
    }

}
