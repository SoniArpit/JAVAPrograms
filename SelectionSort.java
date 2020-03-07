
// e2.24
import java.util.Scanner;

class SelectionSort {
    public static int[] selectionSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter size of array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter element");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int sort[] = selectionSort(a);
        System.out.println("Sorted Array");
        for (int i : sort)
            System.out.println(i);
        sc.close();
    }
}