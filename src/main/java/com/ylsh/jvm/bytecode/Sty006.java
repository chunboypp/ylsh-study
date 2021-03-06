package com.ylsh.jvm.bytecode;

/**
 *方法的动态分派：
 * 方法的动态分派涉及到一个重要概念：方法接收者。
 * invokevirtual字节码指令的多态查找流程
 * 比较方法的重载（overload）与方法重写（overwrite）.可得出：
 * 方法重载（方法名字相同，参数不同）是静态的，是编译器行为；方法重写是动态的，是运行期行为。
 *
 */
public class Sty006 {

 public static void main(String[] args) {
     Fruit apple = new Apple();
     Fruit orange = new Orange();

     apple.test();
     orange.test();

     apple = new Orange();
     apple.test();

 }
}
class Fruit{
    public void test(){
        System.out.println("fruit");
    }
}
class Apple extends Fruit{
    @Override
    public void test(){
        System.out.println("apple");
    }
}
class Orange extends Fruit{
    @Override
    public void test(){
        System.out.println("orange");
    }
}
