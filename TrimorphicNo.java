import java.util.Scanner;

class TrimorphicNo {
    static boolean isTrimorphic(int N) {

        int cube = N * N * N;
        while (N > 0) {
            if (N % 10 != cube % 10)
                return false;
            N /= 10;
            cube /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isTrimorphic(n) == true)
            System.out.println("trimorphic");
        else
            System.out.println("not trimorphic");

        sc.close();
    }

}