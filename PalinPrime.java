
// e2.17
import java.util.Scanner;

class PalinPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check palindrome + prime: ");
        int n = sc.nextInt();
        int num = n, original = n, i = 0, rev = 0;
        while (n > 0) {
            rev = (n % 10) + rev * 10;
            n /= 10;
            i++;
        }

        boolean flag = false;
        for (i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            } else
                flag = true;
        }

        if (flag == true && rev == original)
            System.out.println(num + " is Palindrome Prime");
        else
            System.out.println(num + " is not Palindrome Prime");

        // System.out.println(rev);

        sc.close();
    }
}