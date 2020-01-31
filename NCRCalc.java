import java.util.Scanner;

class NCRCalc {
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter number: ");
        int r = sc.nextInt();
        int ncr = fact(n) / (fact(r) * fact(n - r));
        System.out.println("nCr: " + ncr);
        sc.close();
    }

}