/*********************************** Exercise 3 ***************************************
 * Create a class containing a float and use it to demonstrate aliasing during method calls.
 ***************************************************************************************/

package c2.exercise;

public class E3AliasingInMethodCall {
    private float f;

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public void aliasTest(E3AliasingInMethodCall testObject) {
        testObject.f = 1.234f;
    }

    public static void main(String[] args) {
        E3AliasingInMethodCall testObject = new E3AliasingInMethodCall();
        testObject.f = 5.678f;
        System.out.println("Original float value is: " + testObject.getF());

        testObject.aliasTest(testObject);
        System.out.println("float value after method call is: " + testObject.getF());
    }
}
