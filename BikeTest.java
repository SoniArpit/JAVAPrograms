class Bicycle {
    int gear, speed;

    Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    void applyBreak(int decrement) {
        speed = speed - decrement;
    }

    void applySpeedUp(int increment) {
        speed = speed + increment;
    }

    void display() {
        System.out.println("Gear: " + gear + "\nSpeed: " + speed);
    }
}

class MountainBike extends Bicycle {
    int seatheight;

    MountainBike(int gear, int speed, int startheight) {
        super(gear, speed);
        seatheight = startheight;
    }

    void setHieght(int sh) {
        seatheight = sh;
    }

    void display() {
        super.display();
        System.out.println("Seatheight: " + seatheight);
    }

}

class BikeTest {
    public static void main(String[] args) {

        MountainBike mb[] = new MountainBike[5];
        System.out.println("First");
        mb[0] = new MountainBike(5, 20, 1);
        mb[0].setHieght(2);
        mb[0].applyBreak(1);
        mb[0].applySpeedUp(3);
        mb[0].display();

        System.out.println("\nSecond");
        mb[1] = new MountainBike(5, 21, 1);
        mb[1].setHieght(4);
        mb[1].applyBreak(3);
        mb[1].applySpeedUp(6);
        mb[1].display();

        // MountainBike m[] = new MountainBike[5];
        // m[0] = new MountainBike(7, 20, 1);
        // m[0].display();
    }
}