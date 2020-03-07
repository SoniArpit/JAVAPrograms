
// e2.26
import java.util.Scanner;

class MatrixSortedOrNot {
    public static int[] rowSortedOrNot(int a[][]) {
        int min = 0;
        int unSorted[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            min = a[i][0];
            for (int j = i + 1; j < a[i].length; j++) {
                if (min > a[i][j]) {

                }
            }

        }
        return unSorted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of row: ");
        int r = sc.nextInt();
        System.out.print("Enter size of column: ");
        int c = sc.nextInt();

        int mat[][] = new int[r][c];
        System.out.println("Enter Matrix Element");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int unSorted[] = rowSortedOrNot(mat);
        for (int i = 0; i < unSorted.length; i++) {
            System.out.println(unSorted[i]);
        }

        sc.close();
    }
}