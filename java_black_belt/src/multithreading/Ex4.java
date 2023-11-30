package multithreading;

public class Ex4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> System.out.println("Hello"));
        thread1.start();
    }
}
