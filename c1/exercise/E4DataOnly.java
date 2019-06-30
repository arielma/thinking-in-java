package c1.exercise;

public class E4DataOnly {
    private static int i = 100;
    private double d;
    private boolean b;

    public static void main(String[] args) {
        E4DataOnly object1 = new E4DataOnly();
        E4DataOnly object2 = new E4DataOnly();
        E4DataOnly.i++;
        object1.d = 8.25;
        object1.b = true;
        System.out.println("The values of members in onject 1 are:\n" + object1.i + "\n " + object1.d + "\n" + object1.b);
        System.out.println("The values of members in onject 2 are:\n" + object2.i + "\n " + object2.d + "\n" + object2.b);
    }
}


