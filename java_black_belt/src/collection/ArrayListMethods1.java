package collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivna");
        arrayList1.add("Mariya");
        arrayList1.add(1, "Misha");
        for (String s : arrayList1) {
            System.out.printf("%s ", s);
        }
        System.out.println();
        arrayList1.set(1, "Masha");
        arrayList1.remove(1);
        System.out.println(arrayList1);
    }
}
