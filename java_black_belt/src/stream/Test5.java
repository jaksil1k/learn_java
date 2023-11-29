package stream;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9, 12, 4, 81, 7, 18};
        arr = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr));
    }
}
