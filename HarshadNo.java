import java.util.Scanner;

class HarshadNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), s = 0;
        int temp = n;
        while (n > 0) {

            int d = (n % 10);
            s += d;
            n = n / 10;

        }
        int num = s;
        int rev = 0;
        while (num > 0) {
            rev = (num % 10) + rev * 10;
            num /= 10;
        }

        System.out.println(s);
        System.out.println(rev);
        if (temp == s * rev) {
            System.out.println(temp + " is harshad number");
        } else {
            System.out.println(temp + " is not harshad number");
        }
        sc.close();
    }
}