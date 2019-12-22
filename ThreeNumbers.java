import java.util.Scanner;

class ThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int temp;
        if (n1 < n2) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if (n1 < n3) {
            temp = n1;
            n1 = n3;
            n3 = temp;
        }
        if (n2 < n3) {
            temp = n2;
            n2 = n3;
            n3 = temp;
        }
        System.out.println(n1 + " " + n2 + " " + n3);

        sc.close();
    }
}