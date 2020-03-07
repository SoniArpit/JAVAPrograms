class KDist {
    int k;

    KDist() {
        k = 0;
    }

    KDist(int k) {
        this.k = k;
    }

    void getData() {
        k = Integer.parseInt(System.console().readLine("Ente k: "));
    }

    void putData() {
        System.out.println("K is " + k);
    }

    public MDist addDistance(MDist md) {
        KDist 
        return 
    }
}

class MDist {
    private int m;

    MDist() {
        m = 0;
    }

    MDist(int m) {
        this.m = m;
    }

    int getM() {
        return m;
    }

    void getData() {
        m = Integer.parseInt(System.console().readLine("Ente m: "));
    }

    void putData() {
        System.out.println("m is " + m);
    }
}

class DistanceTest {
    public static void main(String[] args) {
        KDist k1 = new KDist();
        MDist m1 = new MDist();

        k1.getData();
        m1.getData();

        KDist resm = new KDist();
        resm.addDistance(k1, m1);

        resm.putData();
    }
}