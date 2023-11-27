package stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 8, 1};
        Arrays.stream(arr).forEach(e -> {
            e *= 2;
            System.out.println(e);
        });

        Arrays.stream(arr).forEach(System.out::println);
    }
}
