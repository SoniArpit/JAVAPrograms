class Fibbo {
    public static void main(String[] args) {
        int f0 = 0, f1 = 1, f2 = 1, i = 0;
        int n = Integer.parseInt(System.console().readLine("Enter number: "));
        while (i != n) {
            System.out.println(f2);
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
            i++;
        }
    }
}