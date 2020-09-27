package Collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Andrei");
        map.put(123,"Dima");
        map.put(234,"Sergiu");
        map.put(3,"Alexei");
        map.put(234234,"Leonid");

        System.out.println(map);

        map.putIfAbsent(234,"Leonea"); // nu se va pune nimic deaorece key 234 e ocupata
        map.putIfAbsent(9872,"Xenia");
        System.out.println(map);

        System.out.println(map.get(3));

        map.remove(1);
        System.out.println(map);

        System.out.println(map.containsValue("Xenia"));
        System.out.println(map.containsKey(4));

        System.out.println(map.keySet()); //[9872, 3, 234234, 234, 123]
        System.out.println(map.values()); //[Xenia, Alexei, Leonid, Sergiu, Dima]

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
