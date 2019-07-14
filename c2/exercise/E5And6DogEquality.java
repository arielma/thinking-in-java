package c2.exercise;

public class E5And6DogEquality {
    private String dogName;
    private String dogSays;

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogSays() {
        return dogSays;
    }

    public void setDogSays(String dogSays) {
        this.dogSays = dogSays;
    }

    public E5And6DogEquality(String name, String says) {
        this.dogName = name;
        this.dogSays = says;
    }

    public static void main (String[] args) {
        E5And6DogEquality dog1 = new E5And6DogEquality("spot", "Ruff!");
        E5And6DogEquality dog2 = new E5And6DogEquality("scruff", "Wurf!");

        System.out.println(dog1.getDogName() + " says " + dog1.getDogSays());
        System.out.println(dog2.getDogName() + " says " + dog2.getDogSays());

        E5And6DogEquality dog3 = new E5And6DogEquality("scrumbble", "Meow!");

        dog1 = dog3;

        System.out.println(dog1 == dog3);
        System.out.println(dog1.equals(dog3));

        E5And6DogEquality dog4 = new E5And6DogEquality("scruff", "Wurf!");
        System.out.println(dog2 == dog4);
        //This will return false as the equals here didn't override the Object's
        // equals to compare the content of Dog class
        System.out.println(dog2.equals(dog4));

        //This will return true as the equals here for Integer overrides the Object's
        // equals to compare the int
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1.equals(n2));

    }
}
