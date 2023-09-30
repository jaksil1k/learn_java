package generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        X x = new Y();

        //can not make ArrayList<Y>(). ArrayList<Y> is not subclass of List<X>
//        List<X> list1  = new ArrayList<Y>();

        //can add double 3.14 to List<Number> but under the hood we have ArrayList<Integer>
//        List<Number> list = new ArrayList<Integer>();
//        list.add(18);
//        list.add(3.14);
    }
}

class X {}
class Y extends X {}
