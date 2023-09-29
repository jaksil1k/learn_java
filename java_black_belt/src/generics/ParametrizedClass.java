package generics;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("hello");
        System.out.println(info1);
        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);
        Integer i1 = info2.getValue();
    }
}

class Info<T> {

    //field with T can not be static
    private final T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return  "{ [" + value + "] }";
    }
}
