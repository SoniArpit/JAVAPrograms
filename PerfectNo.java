import java.util.Scanner;

class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (n == sum)
            System.out.println(n + " is perfect number");
        else
            System.out.println(n + " is not perfect number");
        sc.close();
    }
}