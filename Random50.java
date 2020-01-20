import java.util.Random;

class Random50 {
    public static void main(String[] args) {
        Random randNo = new Random(1000);
        for (int i = 0; i < 100; i++) {
            System.out.println(randNo.nextInt(49));
        }
    }
}