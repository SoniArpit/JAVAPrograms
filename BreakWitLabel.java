class BreakWitLabel {
    public static void main(String[] args) {

        label: for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print("i = " + i + "  ");
                if (i == 3)
                    break label;
            }
            System.out.println();
        }
    }
}