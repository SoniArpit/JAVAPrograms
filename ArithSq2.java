import java.util.Scanner;

class ArithSq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter value of d: ");
        int r = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(a * Math.pow(r, i));
        }

        sc.close();
    }
}
