package Collections.Map;

import javafx.scene.effect.SepiaTone;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Basic01 {
    public static void main(String[] args) {

        //HashMap doesn’t allow duplicate keys but allows duplicate values. That means A single key can’t contain more than 1 value but more than 1 key can contain a single value.
        //HashMap allows null key also but only once and multiple null values.
        //This class makes no guarantees as to the order of the map; in particular, it does not guarantee that the order will remain constant over time.
        HashMap<String, Integer> map
                = new HashMap<>();


        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        System.out.println(map);

        if (map.containsValue(20))
        {
            System.out.println("found");
        }

        if (map.containsKey("sachin"))
        {
            System.out.println(map.get("sachin"));
        }

        Set<String> s=map.keySet();
        System.out.println(s);

        Set<Map.Entry<String,Integer>> data=map.entrySet();
        System.out.println(data);

        //FOR LOOP
        System.out.println("For Loop:");
        for (Map.Entry me : map.entrySet()) {
            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }


        //WHILE LOOP & ITERATOR
        System.out.println("While Loop:");
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator.next();
            System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        }




    }
}
