package c1.exercise;

import java.util.*;

public class E3ATypeName {
    List testList = new ArrayList<String>();

    public E3ATypeName() {
        testList.add("My First String List");
    }

    public static void main(String[] args) {
        E3ATypeName object = new E3ATypeName();
        System.out.println("The value of the list is: " + object.testList + "\n"
                            + "The length of the list is: " + object.testList.size());
    }
}
