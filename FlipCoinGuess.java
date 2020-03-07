
// e2.2
import java.util.Scanner;

class FlipCoinGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coin = (int) (Math.random() * 2) + 1;
        System.out.print("Guest head(1) or tail(2): ");
        int userGuess = sc.nextInt();

        System.out.println(coin == userGuess ? "Guess is right" : "Guess is wrong");
        sc.close();
    }
}