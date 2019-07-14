package c2.exercise;

public class E8HexOctalLong {
    public static void main(String[] args) {
        long longNum1 = 0x2F;
        long longNum2 = 0177;

        System.out.println(Long.toBinaryString(longNum1));
        System.out.println(Long.toBinaryString(longNum2));
    }
}
