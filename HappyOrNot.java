import java.util.Scanner;

class HappyOrNot {
    public static int sumOfDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        while (n != 1 && n != 4) {
            n = sumOfDigit(n);
        }
        if (n == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not Happy Number");
        }

        sc.close();
    }
}