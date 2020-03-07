import java.util.Arrays;

class CopyArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        // approach 1
        System.err.println("approach 1");
        int b[] = new int[a.length];
        b = a;
        for (int i : b)
            System.out.println(i);

        // approach 2
        System.err.println("\napproach 2");
        int c[] = new int[a.length];
        for (int i = 0; i < c.length; i++)
            c[i] = a[i];
        for (int i : c)
            System.err.println(i);

        // approach 3
        System.err.println("\napproach 3");
        int d[] = a.clone();
        for (int i : d)
            System.out.println(i);

        // approach 4
        System.err.println("\napproach 4");
        int e[] = new int[a.length];
        System.arraycopy(a, 3, e, 1, 2);

        for (int i : e)
            System.out.println(i);

        // approach 5
        System.err.println("\napproach 5");
        int f[] = Arrays.copyOf(a, 3);
        for (int i : f)
            System.out.println(i);

        // approach 5
        System.err.println("\napproach 5");
        int g[] = Arrays.copyOfRange(a, 2, 4);
        for (int i : g)
            System.out.println(i);
    }
}