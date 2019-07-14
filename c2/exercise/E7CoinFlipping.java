package c2.exercise;

import java.util.Random;

public class E7CoinFlipping {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextBoolean() ? "Head" : "Tail");
    }
}
