package generics;

import java.util.*;

public class ParametrizedMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 5));
        int a = GenMethod.getSecondElement(list);
        System.out.println(a);
    }
}

class GenMethod{
    public static <T> T getSecondElement(List<T> list) {
        return list.get(1);
    }
}
