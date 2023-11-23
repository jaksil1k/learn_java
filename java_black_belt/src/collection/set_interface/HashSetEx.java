package collection.set_interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");

        System.out.println(set);
        System.out.println(set.size());
        boolean misha = set.contains("Misha");
        ArrayList<Object> list = new ArrayList<>();
    }
}
