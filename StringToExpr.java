import java.util.Scanner;

class StringToExpr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char l[] = new char[st.length()];
        char r[] = new char[st.length()];

        // char main[] = new char[st.length()];
        int i, exPos = 0;
        for (i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '+')
                exPos = i;

        }

        for (i = 0; i < exPos; i++) {
            l[i] = st.charAt(i);
        }
        for (i = exPos + 1; i < st.length(); i++) {

            r[i] = st.charAt(i);
        }

        int lVal = Integer.parseInt(String.valueOf(l));
        int rVal = Integer.parseInt(String.valueOf(r));

        System.out.println(lVal + " " + st.charAt(exPos) + " " + rVal);

        sc.close();
    }
}