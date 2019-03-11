package com.xchong.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
       /* int number = 1;
        Integer number2 =  new Integer(1);
        Integer number3 = 1;

        System.out.println(number2.equals(number));
        System.out.println(number2 == number);
        System.out.println(number2 == number3);
        System.out.println(number2.equals(number3));
*/


        /*Integer num = -129,num1 = -129,num2 = 0,num4 =0;
        System.out.println(num == num1);
        System.out.println(num2 == num4);*/

      /*  int abc = 1;
        Integer numI =-128;
        Integer numI2 =-128;
        System.out.println(numI == numI2);*/


        Long log1 = new Long(1);
        Long log2 = new Long(1);
        long log3 = 1;
        System.out.println(log1 == log2);
        System.out.println(log3 == log1);
        System.out.println(log3 == log2);
    }

}
