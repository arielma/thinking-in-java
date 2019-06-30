/******************************* Exercise 6 ********************************
 * Write a program that includes and calls the storage( ) method defined
 * as a code fragment in this chapter.
 ***************************************************************************/

package c1.exercise;

public class E6Storage {

    private String testString;

    public String getTestString() {
        return this.testString;
    }

    public void setTestString(String s) {
        this.testString = s;
    }

    public static void main(String[] args) {
        E6Storage storage = new E6Storage();
        storage.setTestString("Testing String.");
        System.out.println(storage.getTestString().length() * 2);
    }
}
