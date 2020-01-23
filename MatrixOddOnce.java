import java.util.Random;

class MatrixOddOnce {
    public static int[] rOddOnce(int mat[][]) {
        int rCount = 0;
        int rPos[] = new int[mat.length];
        // int cPos[] = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
                if (mat[i][j] == 1) {
                    rCount++;
                    if (rCount % 2 != 0) {
                        rPos[i] = rCount;
                    } else {
                        rPos[i] = 444;
                    }
                }
            }
            // System.out.print(rCount + " ");

            rCount = 0;
            System.out.println();
        }
        return rPos;
    }

    public static int[] cOddOnce(int mat[][]) {
        int cCount = 0;
        // int rPos[] = new int[mat.length];
        int cPos[] = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[j][i] == 1) {
                    cCount++;
                    if (cCount % 2 != 0) {
                        cPos[i] = cCount;
                    } else {
                        cPos[i] = 444;
                    }
                }
            }
            // System.out.print(cCount + " ");
            cCount = 0;
            // System.out.println();
        }
        return cPos;
    }

    public static void main(String[] args) {
        int arr[][] = new int[6][6];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(2);
            }
        }
        int rPos[] = rOddOnce(arr);
        for (int i = 0; i < rPos.length; i++)
            if (rPos[i] != 444)
                System.out.println("row " + i + " : " + rPos[i]);

        int cPos[] = cOddOnce(arr);
        for (int i = 0; i < cPos.length; i++)
            if (cPos[i] != 444)
                System.out.println("col " + i + " : " + cPos[i]);
    }
}