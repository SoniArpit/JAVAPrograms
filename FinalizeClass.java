class Test {
    int count;

    Test() {
        System.out.println("Object Created" + (++count));
    }

    @Override
    public void finalize() {
        System.out.println("Object Distroyed" + (--count));

    }
}

class FinalizeClass {
    public static void main(String[] args) {
        Test t1;
        Test t2;
        t1 = new Test();
        t2 = new Test();
        t1 = t2;
        System.gc();
        System.out.println("Done.....");
    }
}