import java.util.Scanner;

class AutomorphicNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // if (n == Math.pow(n, 2) % 10)
        // System.out.println("Number is Automorphic number");
        // else
        // System.out.println("Number is not Automorphic number");

        int sq = n * n;
        boolean flag = true;
        // Start Comparing digits
        while (n > 0) {
            // Return false, if any digit of N doesn't
            // match with its square's digits from last
            if (n % 10 != sq % 10)
                flag = false;

            // Reduce N and square
            n /= 10;
            sq /= 10;
        }

        if (flag == true)
            System.out.println("Number is Automorphic number");
        else
            System.out.println("Number is not Automorphic number");

        sc.close();
    }
}