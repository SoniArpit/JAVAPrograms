import java.util.Random;

class RandomeNumberPlate {
    public static void main(String[] args) {
        Random rnd = new Random();
        for (int i = 0; i < 3; i++) {
            char c = (char) (rnd.nextInt(26) + 'A');
            System.out.print(c);
        }
        for (int i = 0; i < 4; i++) {
            int n = rnd.nextInt(9);
            System.out.print(n);
        }

    }
}