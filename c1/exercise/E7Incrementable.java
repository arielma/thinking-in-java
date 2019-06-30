/******************************* Exercise 7 ********************************
 * Turn the Incrementable code fragments into a working program.
 ***************************************************************************/

package c1.exercise;

public class E7Incrementable {
    private static int i = 47;

    static void increment() {
        System.out.println(E7Incrementable.i++);
    }

    public static void main(String[] args) {
       increment();
       increment();
    }
}
