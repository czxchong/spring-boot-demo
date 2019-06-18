package com.xchong.demo;

import org.junit.Test;

import java.util.*;

public class WorkTest {

    @Test
    public  void  workTest(){
        String nameNum = "test_0";
        Map<String, List<Integer>> map = new HashMap<>(16);

        List<Integer> lists = Arrays.asList(1);
        lists.forEach(integer -> {
            getList(map,nameNum,integer);
        });

        map.forEach((str,list)->{
            System.out.println("map--"+str);
            System.out.println("list--"+list.toString());
        });

    }

    protected Map<String,List<Integer>> getList(Map<String,List<Integer>> map,String nameNum,Integer integer){
        if(Objects.isNull(map.get(nameNum))){
            List<Integer> list2 = new ArrayList<>();
            list2.add(integer);
            map.put(nameNum,list2);
        }else{
            List<Integer> list3 = map.get(nameNum);
            if(list3.size()>4 ){
                String sp = nameNum.split("_")[1];
                String name = nameNum.split("_")[0];

                int nameNum2 = 1;
                if(!Objects.isNull(sp)){
                    nameNum2 = Integer.valueOf(sp) + 1;
                }

                // 超过1000个默认报错，防止无限递归
                if(nameNum2 > 1000) throw  new RuntimeException("防止无限递归");

                String nameNum3 = name+"_"+nameNum2;
                getList(map,nameNum3,integer);
                return map;
            }

            list3.add(integer);
            map.put(nameNum,list3);
        }
        return map;
    }
}
