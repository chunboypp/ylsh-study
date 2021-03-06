package com.ylsh.concurrent;

/**
 * 死锁：线程1等待线程2互斥持有的资源，而线程2也在等待线程1互斥持有的资源，两个线程都无法继续执行
 *
 *
 * 活锁：线程持续重试一个总是失败的操作，导致无法继续执行
 *
 * 饿死：线程一直被调度器延迟访问其依赖执行的资源，业务是调度器先于低优先级的线程而执行高优先级的线程，同时总是
 * 会有一个高优先级的线程可以执行，饿死也叫做无线延期
 */
public class Sty007 {

    public static void main(String[] args){
        Sty007 sty007 = new Sty007();
        if(null != null){
            System.out.println("真");
        }
        System.out.println(sty007.getClass().getName());
//        sun.nio.ch.Util
    }
}
