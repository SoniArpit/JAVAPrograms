import java.util.Scanner;

class RevTenNum {
    static void revNum(int arr[]) {
        int brr[] = new int[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            brr[j - 1] = arr[i];
            j--;
        }

        System.out.println("\nReverse number");
        for (int i : brr)
            System.out.println(i);
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 number: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        revNum(arr);
        sc.close();
    }
}