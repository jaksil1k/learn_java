package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        //instead of ? can be any class
        List<?> list = new ArrayList<String>();

        //can not modify list if we have wildcard
//        list.add("hello");


        //bounded wildcards
        List<? extends Number> list30 = new ArrayList<Integer>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("hello");
        list2.add("goodbye");
        showListInfo(list2);

        ArrayList<Double> arrayList1 =  new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        System.out.println(summ(arrayList1));

    }
    static void showListInfo(List<?> list) {
        System.out.println("My list contains next elements " + list);
    }

    public static double summ(ArrayList<? extends Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
