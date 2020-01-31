class CelToFeh {
    public static void main(String[] args) {
        float cel = 10.0f, feh;
        for (int i = 0; i < 10; i++) {
            feh = (9.0f / 5.0f) * cel + 32;
            cel++;
            System.out.println(feh);
        }
    }
}