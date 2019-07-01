/******************************* Exercise 1 ********************************
 * Create a class containing an int and a char that are not initialized, and
 * print their values to verify that Java performs default initialization.
 ***************************************************************************/
package c1.exercise;

public class E1PrimitiveInitialiser {
    private int num;
    private char character;

    public E1PrimitiveInitialiser() {
        System.out.println("The default value of the integer is: " + num);
        System.out.println("The default value of the character is: " + character);
    }
    public static void main(String[] args) {
        new E1PrimitiveInitialiser();
    }
}
