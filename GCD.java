
//       _                   _   _       _                      _     _       _                              _        
//       | |                 ( ) | |     | |                    | |   | |     (_)                            | |       
//     __| |   ___    _ __   |/  | |_    | |_   _ __   _   _    | |_  | |__    _   ___      ___    ___     __| |   ___ 
//    / _` |  / _ \  | '_ \      | __|   | __| | '__| | | | |   | __| | '_ \  | | / __|    / __|  / _ \   / _` |  / _ \
//   | (_| | | (_) | | | | |     | |_    | |_  | |    | |_| |   | |_  | | | | | | \__ \   | (__  | (_) | | (_| | |  __/
//    \__,_|  \___/  |_| |_|      \__|    \__| |_|     \__, |    \__| |_| |_| |_| |___/    \___|  \___/   \__,_|  \___|
//                                                      __/ |                                                          
//                                                     |___/                                                           
import java.util.Scanner;

class GCD {
    public static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
            // System.out.println(num1 + " " + num2);
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        if (n2 > n1) {
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }
        System.out.println("GCD: " + gcd(n1, n2));

        sc.close();
    }
}