package c2.exercise;

import java.util.Random;

public class E4Velocity {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int s = rand.nextInt(100) + 1;
        System.out.println("s : " + s);
        float h = rand.nextFloat() * 10;
        System.out.println("h : " + h);

        System.out.println("v is s/h = " + s/h);
    }
}
