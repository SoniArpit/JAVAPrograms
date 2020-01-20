class MatrixMul {

    public static int[][] matrixMul(int m1[][], int m2[][], int r1, int c1, int c2) {
        int mul[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return mul;
    }

    public static void main(String[] args) {
        // int r1 = Integer.parseInt(System.console().readLine("Enter row: "));
        // int c1 = Integer.parseInt(System.console().readLine("Enter column: "));
        // int m1[][] = new int[r1][c1];
        // System.out.println("Enter first matrix");
        // for (int i = 0; i < r1; i++) {
        // for (int j = 0; j < c1; j++) {
        // m1[i][j] = Integer.parseInt(System.console().readLine());
        // }
        // }

        // int r2 = Integer.parseInt(System.console().readLine("Enter row: "));
        // int c2 = Integer.parseInt(System.console().readLine("Enter column: "));
        // int m2[][] = new int[r2][c2];
        // System.out.println("Enter second matrix");
        // for (int i = 0; i < r2; i++) {
        // for (int j = 0; j < c2; j++) {
        // m2[i][j] = Integer.parseInt(System.console().readLine());
        // }
        // }

        int r1 = 2, c1 = 3;
        int c2 = 2;
        int[][] m1 = { { 3, -2, 5 }, { 3, 0, 4 } };
        int[][] m2 = { { 2, 3 }, { -9, 0 }, { 0, 4 } };

        int ans[][] = matrixMul(m1, m2, r1, c1, c2);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}