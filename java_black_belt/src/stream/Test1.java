package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("OK");
        list.add("poka");

        List<Integer> integers = list.stream().map(String::length).collect(Collectors.toList());

//        System.out.println(list);
//        System.out.println(integers);

        int[] arr = {5, 9, 3, 8, 1};
        arr = Arrays.stream(arr).map(e -> {
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).toArray();
//        System.out.println(Arrays.toString(arr));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela");
        set.add("OK");
        set.add("poka");
        System.out.println(set);

        Set<Integer> set2 = set.stream().map(String::length).collect(Collectors.toSet());
        System.out.println(set2);
    }
}