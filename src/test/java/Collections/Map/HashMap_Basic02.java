package Collections.Map;

import com.sun.xml.internal.ws.util.QNameMap;

import java.util.*;

public class HashMap_Basic02 {
    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");
        String a=hmap.putIfAbsent(6,"A");
        System.out.println(a);

        System.out.println("Before sorting : "+hmap);

        TreeMap<Integer,String> map=new TreeMap<>(hmap);

        System.out.println("After sorting :"+map);
        ////Inserting key-value pairs of map to anotherMap using putAll() method
        //
        //        anotherMap.putAll(map);

        //Adds key-value pair 'ONE-111' only if it is not present in map

       // map.putIfAbsent("ONE", 111);
        Collection<String> val=hmap.values();

        Set<Map.Entry<Integer, String>> keyValueSet = map.entrySet();

        for (Map.Entry<Integer, String> entry : keyValueSet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
