package com.corejava.collections;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class MapImpl {
    public static void main(String[] args){
        Map<Integer,String> map1 = new HashMap<>(16,0.75f);
          map1.put(120,"Saurabh");
          map1.put(156,"yojna");
          map1.put(200,"John");
          map1.put(190,"ukrich");
          map1.remove(120);
          System.out.println(map1.remove(156,"yojna"));
          System.out.println(map1);
          System.out.println(map1.get(120));
            System.out.println(map1.get(1208));
            System.out.println(map1.containsKey(120));
            System.out.println(map1);

        Set<Integer> S1=map1.keySet();
        for(int keys:S1){
            System.out.println(map1.get(keys));
        }


       for(HashMap.Entry<Integer,String> i : map1.entrySet()){
            System.out.println(i.getKey()+" : "+i.getValue());
            i.setValue(i.getValue().toUpperCase());
       }

       System.out.println(map1);

    }
}
