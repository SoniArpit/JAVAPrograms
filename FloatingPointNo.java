import java.util.Scanner;

class FloatingPointNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter floating point number");
        float n = sc.nextFloat();
        System.out.println("Floating points: " + (n - (int) n));
        sc.close();
    }
}