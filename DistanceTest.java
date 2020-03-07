class Distance {
    private int meter;
    private int km;

    Distance() {
        meter = 0;
        km = 0;
    }

    Distance(int km, int meter) {
        this.meter = meter;
        this.km = km;
    }

    Distance(Distance d) {
        meter = d.meter;
        km = d.km;
    }

    public void getdata() {
        meter = Integer.parseInt(System.console().readLine("Enter meter :"));
        km = Integer.parseInt(System.console().readLine("Enter Km :"));
    }

    public void printdata() {
        System.out.println("Data is : " + meter + " and " + km);
    }

    public Distance Add(Distance d1) {
        Distance resd = new Distance();
        resd.meter = meter + d1.meter;
        resd.km = km + d1.km;
        while (resd.meter >= 1000) {
            resd.km++;
            resd.meter -= 1000;
        }
        return resd;
    }

    // public void Add(Distance d1, Distance d2) {
    // meter = d1.meter + d2.meter;
    // km = d1.km + d2.km;
    // while (meter >= 1000) {
    // km++;
    // meter -= 1000;
    // }
    // }
}

class DistanceTest {
    public static void main(String ar[]) {
        Distance d1 = new Distance();
        Distance d2 = new Distance(3, 4200);
        // d1 = d2;
        d1.getdata();
        Distance d3 = d1.Add(d2);
        // Distance d4 = new Distance();
        // d4.Add(d1, d3);

        d3.printdata();
        // d4.printdata();

    }
}