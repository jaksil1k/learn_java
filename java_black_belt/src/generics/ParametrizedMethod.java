package generics;

import java.util.*;

public class ParametrizedMethod {
    public static void main(String[] args) {
        //after compilation, jvm makes type erasure to maintain backward compatibility
        //in other word after compilation all objects casts to Object
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 5));
        //List list = new ArrayList();
//        int a = GenMethod.getSecondElement(list);
        //int a = (Integer)GenMethod.getSecondElement(list);
//        System.out.println(a);
    }

    //compilation error here is evidence of type erasure
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
    public void abc(Info<Integer> info) {
        Integer i = info.getValue();
    }
}

class GenMethod {

    public static <T  extends Number&I1&I2>/*first go classes then interfaces*/ T getSecondElement(List<T> list) {
        return list.get(1);
    }
}

class Parent {
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
}

class Child extends Parent {
    //compiler forbids it
//    public void abc(Info<Integer> info) {
//        Integer i1 = info.getValue();
//    }
}

interface I1 {}
interface I2 {}