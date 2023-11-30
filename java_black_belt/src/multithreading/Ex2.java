package multithreading;

public class Ex2 extends Thread{

    public void run() {
        for (int i = 1;i <= 1000;++i) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Ex2 thread1 = new Ex2();
        thread1.start();
        thread1.run();



//        Thread thread1 = new MyThread1();
//        Thread thread2 = new MyThread2();
//
//        thread1.start();
//        thread1.join();
//        thread2.start();

    }
}

//class MyThread1 extends Thread {
//    public void run() {
//        for (int i = 1;i <= 1000;++i) {
//            System.out.println(i);
//        }
//    }
//}
//
//
//
//class MyThread2 extends Thread {
//    public void run() {
//        for (int i = 1000;i >= 0;--i) {
//            System.out.println(i);
//        }
//    }
//}