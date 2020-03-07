class PowerRec {
    static int recPower(int b, int p) {
        if (p == 0) {
            return 1;
        } else {
            return (b * recPower(b, p - 1));
        }
    }

    public static void main(String[] args) {
        int base = 2, power = 3;
        System.out.println(base + "^" + power + " = " + recPower(base, power));
    }
}