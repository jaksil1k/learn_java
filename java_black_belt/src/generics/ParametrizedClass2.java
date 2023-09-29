package generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("hello", 20);
        System.out.println(pair1);

        Pair<Integer, Double> pair2 = new Pair<>(156, 3.14);
        System.out.println(pair1);
    }
}

class Pair<V1, V2> {
    private V1 first;
    private V2 second;

    public Pair(V1 first, V2 second) {
        this.first = first;
        this.second = second;
    }

    public V1 getFirst() {
        return first;
    }

    public V2 getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
