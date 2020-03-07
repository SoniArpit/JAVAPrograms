import java.util.Scanner;

// e2.15
class OccurrenceChar {
    static public int count(String str, char a) {
        int charCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                charCount++;
            }
        }
        return charCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to count: ");
        char a = sc.nextLine().charAt(0);

        System.out.println("Occurrence of your letter is " + count(str, a) + " time");
        sc.close();
    }
}