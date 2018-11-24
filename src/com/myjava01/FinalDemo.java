package com.myjava01;
/*
    final:修饰符，可以用于修饰类，成员方法和成员变量
    特点：
        final修饰的类，不能被继承，不能有子类
        final修饰的方法:不能被子类重写
        final修饰的变量：是不可以修改的，是常量；

    常亮：
        字面值常量：1，2，3
        自定义常量：被final所修饰的成员变量，一旦初始化不可改变；


    注意：
        自定义常量必须初始化，可以选择显示初始化，或者构造初始化

 */
public class FinalDemo {
    public static void main(String[] args) {
//        Animal a = new Animal();
//        a.eat();
        Dog d = new Dog();
        d.eat();
//        d.num = 20;

    }
}

class Animal{

    public final void eat(){
        System.out.println("吃东西");
    }
}

class Dog extends Animal {
//    public void eat(){}
    final int NUM = 10;
}