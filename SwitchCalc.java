import java.util.Scanner;

class SwitchCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.println("5. Mod");

        System.out.print("\nEnter your choice: ");
        int ch = sc.nextInt();

        System.out.print("Enter first no: ");
        float n1 = sc.nextFloat();
        System.out.print("Enter Second no: ");
        float n2 = sc.nextFloat();

        switch (ch) {
        case 1:
            System.out.println("Add " + (n1 + n2));
            break;
        case 2:
            System.out.println("Sub " + (n1 - n2));
            break;
        case 3:
            System.out.println("Mul " + (n1 * n2));
            break;
        case 4:
            System.out.println("Div " + (n1 / n2));
            break;
        case 5:
            System.out.println("Mod " + (n1 % n2));
            break;
        default:
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}