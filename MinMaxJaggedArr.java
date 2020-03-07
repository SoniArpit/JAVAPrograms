
// e2.23
import java.util.Scanner;

class MinMaxJaggedArr {

    public static int[] findMin(int a[][]) {
        int[] minList = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int min = a[i][0];
            for (int j = 0; j < a[i].length; j++) {
                if (min > a[i][j]) {
                    min = a[i][j];
                }
            }
            minList[i] = min;
            System.out.println();
        }
        return minList;
    }

    public static int[] findMax(int a[][]) {
        int[] maxList = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int max = a[i][0];
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
            maxList[i] = max;
            System.out.println();
        }
        return maxList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements your array will hold: ");
        int sizeOfArray = sc.nextInt();
        int[][] jaggedArray = new int[sizeOfArray][];

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("How many element in " + (i + 1) + " row: ");
            int count = sc.nextInt();
            jaggedArray[i] = new int[count];
            for (int j = 0; j < count; j++) {
                System.out.print("Enter element " + (j + 1) + " : ");
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < jaggedArray.length; i++) {
            // System.out.println("Elements stored in position " + i);
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(" " + jaggedArray[i][j]);
            }
            System.out.println();
        }

        int minList[] = findMin(jaggedArray);
        System.out.println("Minimum number from row: ");
        for (int i = 0; i < minList.length; i++)
            System.out.println(minList[i] + " in row " + (i + 1));

        int maxList[] = findMax(jaggedArray);
        System.out.println("Maximum number from row: ");
        for (int i = 0; i < maxList.length; i++)
            System.out.println(maxList[i] + " in row " + (i + 1));

        sc.close();
    }
}