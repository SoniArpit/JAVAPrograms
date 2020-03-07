import java.util.Scanner;

/**
 * Dinesh
 */
public class Dinesh {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value a");
        int a = input.nextInt();
        System.out.println("Enter the value b");
        int b = input.nextInt();
        System.out.println("Enter the value c");
        int c = input.nextInt();

        if (a > b) {
            if (a > c)

                System.out.println("a is gretest");

            else
                System.out.println("c is gretest");
        } else {
            if (b > c)
                System.out.println("b is gretest");
            else
                System.out.println("c is gretest");
        }
        input.close();
    }
}