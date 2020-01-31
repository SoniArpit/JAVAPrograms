import java.util.Scanner;

class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle a: ");
        int a = sc.nextInt();
        System.out.print("Enter angle b: ");
        int b = sc.nextInt();
        System.out.print("Enter angle c: ");
        int c = sc.nextInt();

        if (((a * a) + (b * b)) == (c * c)) {
            System.out.println("Triangle is Right angled");
        } else {
            System.out.println("Triangle is Not angled");
        }
        sc.close();
    }
}