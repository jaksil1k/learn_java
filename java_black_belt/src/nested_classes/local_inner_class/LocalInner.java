package nested_classes.local_inner_class;

public class LocalInner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math{
    public void getResult() {
        class Divide{
            private int first;
            private int second;

            public Divide(int first, int second) {
                this.first = first;
                this.second = second;
            }

            public Divide() {
            }

            public int getFirst() {
                return first;
            }

            public void setFirst(int first) {
                this.first = first;
            }

            public int getSecond() {
                return second;
            }

            public void setSecond(int second) {
                this.second = second;
            }
            public int getDivide() {
                return first / second;
            }
            public int getRemains() {
                return first % second;
            }
        }

            Divide divide = new Divide();
            divide.setFirst(21);
            divide.setSecond(4);
            System.out.println(divide.getDivide());
            System.out.println(divide.getRemains());
    }
}