class CompareArray {
    public static boolean compareArr(int a[], int b[]) {
        boolean flag = false;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int b[] = { 1, 2, 3, 4, 5, 6 };
        boolean flag = compareArr(a, b);

        if (flag == true) {
            System.out.println("Array are same");
        } else {
            System.out.println("Array are not same");
        }

    }
}