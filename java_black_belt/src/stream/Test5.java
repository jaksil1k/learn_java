package stream;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
//        arr = Arrays.stream(arr).sorted().toArray();
//        System.out.println(Arrays.toString(arr));
        int res = Arrays.stream(arr)
                .filter(x -> x % 2 == 1)
                .map(x -> x % 3 == 0 ? x / 3 : x)
                .reduce(0, Integer::sum);
        System.out.println(res);
    }
}
