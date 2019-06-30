/***************************** Exercise 11 ***********************************
 * Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.
 *******************************************************************************/

package c1.exercise;

public class E11AllTheColorsOfTheRainbow {
    private int anIntegerRepresentingColors;

    public int getAnIntegerRepresentingColors() {
        return anIntegerRepresentingColors;
    }

    public void setAnIntegerRepresentingColors(int anIntegerRepresentingColors) {
        this.anIntegerRepresentingColors = anIntegerRepresentingColors;
    }

    public static void main(String[] args) {
        E11AllTheColorsOfTheRainbow colors = new E11AllTheColorsOfTheRainbow();
        colors.setAnIntegerRepresentingColors(28);
        System.out.println(colors.getAnIntegerRepresentingColors());

    }
}
