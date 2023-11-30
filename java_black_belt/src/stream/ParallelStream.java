package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    // 1 2 3 4 ... 10000000

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

//        Double reduce = list.parallelStream().reduce(0.0, Double::sum);
//        System.out.println(reduce);

        Double reduce = list.parallelStream().reduce((x, y) -> x / y).get();
        System.out.println(reduce);//in the stream we have 8, but we have in the parallelStream we have 0.5

    }
}
