package lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc());
    }

    public static void main(String[] args) {
        int i = 10;
        //i = 15; can use i if it is final or effectively final
        def(() -> 18 + i);
    }
}

interface I {
    int abc();
}