package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
//        list.add(1);

        for (String s : list) {
            System.out.println(s + "dlina" + s.length());
        }

    }
}
