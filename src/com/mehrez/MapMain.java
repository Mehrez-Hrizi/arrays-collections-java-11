package com.mehrez;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {
    public static void main(String ...args) {
        //these are different declarations of HashMap
        HashMap map1 = new HashMap();
        HashMap<Integer, String> map2 = new HashMap<>();
        Map map3 = new HashMap();
        Map<Integer, String> map4 = new HashMap<>();

        map4.put(123, "str1"); map4.put(124, "str2"); map4.put(125, "str3");
        System.out.println(map4.keySet());  //[123, 124, 125]
        System.out.println(map4.entrySet());  //[123=str1, 124=str2, 125=str3]
        System.out.println(map4.values()); //[str1, str2, str3]

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(123, "str1"); treeMap.put(124, "str2"); treeMap.put(125, "str3");
        System.out.println(treeMap.values()); //[str1, str2, str3]
        treeMap.put(125, "str4");
        System.out.println(treeMap.values()); //v[str1, str2, str4] it overrides the value if the key is already exist
    }
}
