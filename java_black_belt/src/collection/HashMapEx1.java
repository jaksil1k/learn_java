package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Mariya Sidorova");
        map1.put(15879, "Nikolay Petrov");
        map1.putIfAbsent(1000, "Oleg Ivanov");
        map1.put(null, "Sergey Petrov");
        map1.put(85214, null);
        System.out.println(map1);
//        System.out.println(map1.get(1001));
        map1.remove(15879);
//        System.out.println(map1);
//        System.out.println(map1.containsValue("Ivan Ivanov"));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
