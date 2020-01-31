class Pyramid2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine("Enter number: "));
        int a = 1;
        for (int i = 0; i < n; i++) {
            // for (int j = i; j <= n; j++) {
            // System.out.print(" ");
            // }
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
        }
    }
}