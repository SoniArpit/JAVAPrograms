import java.util.Scanner;

class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start Number: ");
        int sNo = sc.nextInt();
        System.out.print("Enter End Number: ");
        int eNo = sc.nextInt();
        boolean flag = true;
        for (int i = sNo; i <= eNo; i++) {
            flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag == true)
                System.out.println("Prime is " + i);
        }

        sc.close();
    }
}