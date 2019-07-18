package com.designPattern.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class ChessFlyWeghtFactory {
    //享元池
    private static Map<String,ChessFlyWeight> map=new HashMap<>();

    public static ChessFlyWeight getChess(String color){
        if(map.get(color)!=null){
            return map.get(color);
        }else{
            ChessFlyWeight chw=new ConcreateChess(color);
            map.put(color,chw);
            return chw;
        }
    }
}
