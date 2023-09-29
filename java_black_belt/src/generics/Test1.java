package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(1);

        for (Object o : list) {
            System.out.println(o + "dlina" + ((String)o).length());
        }

    }
}
