import java.util.Scanner;

class BMICalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in KG: ");
        float kg = sc.nextFloat();
        double lbs = kg / 0.45359237;

        System.out.print("Enter your height in Inches: ");
        float height = sc.nextFloat();

        System.out.println("BMI = " + (lbs / (height * height)) * 703);
        sc.close();
    }
}