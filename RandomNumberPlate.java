import java.util.Random;

class RandomNumberPlate {
    public static void main(String[] args) {
        System.out.print("GJ 12 ");
        Random rnd = new Random();
        for (int i = 0; i < 2; i++) {
            char c = (char) (rnd.nextInt(26) + 'A');
            System.out.print(c); 
        }
        for (int i = 0; i < 4; i++) {
            int n = rnd.nextInt(9);
            System.out.print(n);
        }

    }
}