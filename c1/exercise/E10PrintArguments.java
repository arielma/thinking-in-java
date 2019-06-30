/**************************** Exercise 10 *****************************
 * Write a program that prints three arguments taken from the command line.
 * To do this, you’ll need to index into the command-line array of Strings.
 **********************************************************************/

package c1.exercise;

public class E10PrintArguments {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
