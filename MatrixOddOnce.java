class MatrixOddOnce {
    public static void main(String[] args) {
        int arr[][] = { { 0, 1, 0, 1, 1, 0 }, { 1, 1, 0, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1 }, { 0, 0, 1, 0, 1, 0 },
                { 1, 0, 1, 0, 0, 0 }, { 1, 0, 0, 0, 0, 1 } };

        int rCount = 0, cCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] == 1) {
                    rCount++;
                }
                if (arr[j][i] == 1) {
                    cCount++;
                }
            }
            System.out.println(rCount + " " + cCount);

            rCount = cCount = 0;
            System.out.println();
        }

    }
}