package c1.exercise;

public class E8OneStaticField {
    private static String staticString;

    public static String getStaticString() {
        return staticString;
    }

    public static void setStaticString(String staticString) {
        E8OneStaticField.staticString = staticString;
    }

    public E8OneStaticField() {
        this.setStaticString("Test String");
    }

    public static void main(String[] args) {
        E8OneStaticField object1 = new E8OneStaticField();
        E8OneStaticField object2 = new E8OneStaticField();
        System.out.println("Original Static String from object1: " + object1.getStaticString());
        System.out.println("Original Static String from object2: " + object2.getStaticString());
        E8OneStaticField.setStaticString("Changing StaticString");

        System.out.println("Changed Static String from object1: " + object1.getStaticString());
        System.out.println("Changed Static String from object2: " + object2.getStaticString());

        // https://stackoverflow.com/a/29139595
        // equality operator in Java performs a shallow comparison.
        // In other words it compares the values that variables contains.
        // Now the variables of primitive data types contains the value itself while
        // the reference types contains reference to heap area which stores the actual content.
        // That means that in the code snippet object1.staticString will hold the memory address of
        // the actual String object on the heap.
        // == will compare the memory address of object1.staticString and object2.staticString
        // output true means they are referenced by the same memory address
        System.out.println(object1.staticString == object2.staticString);
        System.out.println(E8OneStaticField.getStaticString() == object1.staticString);
    }
}
