import java.util.Scanner;

class PrimeOrNot {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to check prime or not: ");
        int n = sc.nextInt();

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not Prime");
                break;
            } else
                flag = true;
        }
        if (flag == true)
            System.out.println(n + " is Prime");

        sc.close();
    }
}