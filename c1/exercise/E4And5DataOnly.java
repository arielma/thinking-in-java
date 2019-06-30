/******************************* Exercise 5 ********************************
 * Modify the previous exercise so that the values of the data in DataOnly
 * are assigned to and printed in main( ).
 ***************************************************************************/

package c1.exercise;

public class E4And5DataOnly {
    private static int i = 100;
    private double d;
    private boolean b;

    public static void main(String[] args) {
        E4And5DataOnly object1 = new E4And5DataOnly();
        E4And5DataOnly object2 = new E4And5DataOnly();
        E4And5DataOnly.i++;
        object1.d = 8.25;
        object1.b = true;
        System.out.println("The values of members in onject 1 are:\n" + object1.i + "\n " + object1.d + "\n" + object1.b);
        System.out.println("The values of members in onject 2 are:\n" + object2.i + "\n " + object2.d + "\n" + object2.b);
    }
}


