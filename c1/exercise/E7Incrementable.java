package c1.exercise;

public class E7Incrementable {
    static void increment() {
        System.out.println(StaticTest.i++);
    }

    public static void main(String[] args) {
       increment();
       increment();
    }
}

class StaticTest {
    static int i = 47;
}
