import java.util.Scanner;

// e2.25
class MatrixTranspose {

    public static void transposeMat(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
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
        System.out.println("Matrix Element");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        transposeMat(mat);

        System.out.println("Transpose of the Matrix Element");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}