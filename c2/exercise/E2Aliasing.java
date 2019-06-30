/****************************** Exercise 2 ***********************************
 * Create a class containing a float and use it to demonstrate aliasing.
 **************************************************************************/

package c2.exercise;

public class E2Aliasing {
    private float f;

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public static void main(String[] args) {
        E2Aliasing aliasObject1 = new E2Aliasing();
        aliasObject1.f = 1.234f;

        E2Aliasing aliasObject2 = new E2Aliasing();
        aliasObject2.f = 5.678f;

        System.out.println("Original value of object1.f is: " + aliasObject1.f);
        System.out.println("Original value of object2.f is: " + aliasObject2.f);

        aliasObject1 = aliasObject2;

        System.out.println("Value of object1.f after equality is: " + aliasObject1.f);
        System.out.println("Value of object2.f after equality is: " + aliasObject2.f);

        aliasObject1.f = 10.789f;

        System.out.println("Value of object1.f after assignment is: " + aliasObject1.f);
        System.out.println("Value of object2.f after assignment is: " + aliasObject2.f);

    }
}
