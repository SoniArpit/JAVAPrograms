import java.util.Scanner;

class BMICalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in KG: ");
        double kg = sc.nextDouble();
        double lbs = kg / 0.45359237;
        System.out.print("Enter your height in Meter: ");
        double height = sc.nextDouble();
        height = height/0.0257 ; 
        System.out.println("BMI = " + (lbs / (height * height)) * 703);
        sc.close();
    }
}