import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int l;
        for (int i = 0;i < 1000;++i) {
            l = i % 26;
            System.out.print((char)(l + 'a'));
        }
    }
}