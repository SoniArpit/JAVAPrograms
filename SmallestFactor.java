import java.util.Scanner;

class SmallestFactor {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                System.out.print(i + ",");
                n /= i;
            } else {
                i++;
            }
        }
        sc.close();
    }

}