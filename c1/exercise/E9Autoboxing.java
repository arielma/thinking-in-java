/******************************* Exercise 9 ********************************
 * Write a program that demonstrates that autoboxing works for all the
 * primitive types and their wrappers.
 ***************************************************************************/
package c1.exercise;

public class E9Autoboxing {
    public static void main(String[] args) {
        boolean boolTest = false;
        byte byteTest = 108;
        short shortTest = 10001;
        long longTest = 2000000l;
        float floatTest = 3.1415926f;
        double doubleTest = 3.1415926d;
        char charTest = 'c';
        int intTest = 123;

        System.out.println("Autoboxed boolean = " + new Boolean(boolTest));
        System.out.println("Autoboxed byte = " + new Byte(byteTest));
        System.out.println("Autoboxed short = " + new Short(shortTest));
        System.out.println("Autoboxed long = " + new Long(longTest));
        System.out.println("Autoboxed float = " + new Float(floatTest));
        System.out.println("Autoboxed double = " + new Double(doubleTest));
        System.out.println("Autoboxed char = " + new Character(charTest));
        System.out.println("Autoboxed int = " + new Integer(intTest));
    }
}
