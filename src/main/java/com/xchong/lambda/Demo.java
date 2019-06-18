package com.xchong.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

/**
 * 学习lamdba方法
 */
public class Demo {
    public static void main(String[] args) {
        LamdbaTest testDmo = new LamdbaTest();
        testDmo.innerCalss();
        testDmo.listDemo();
    }

     static class LamdbaTest{
        /**
         * 匿名内部类
         */
        public void innerCalss(){
            System.out.println();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("JDK8 以前用法");
                    System.out.println("theah running");
                }
            }).start();
            new Thread(() ->{
                System.out.println("JDK8 以后用法");
                System.out.println("theah running");
            }).start();
        }

        /**
         * 遍历访问list
         */
        public void listDemo(){
            System.out.println();
            List<String> names = Arrays.asList("Kong","Xian","Ming","Li","Chao","Hong");
            System.out.println("jdk8 以前使用放法");
            for (String name: names) {
                System.out.println(name);
            }
            System.out.println("JDK8 以后用法");
            names.forEach(name -> System.out.println(name));
        }
    }
}
