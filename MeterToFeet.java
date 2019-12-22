import java.util.Scanner;

class MeterToFeet {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter meter: ");
        float m = n.nextFloat();
        System.out.println(m + " in Feet = " + m / 0.3048 + " ft");
    }
}