package Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(7990, 96);
        Car car3 = new Car(car2);
        car1.printinfo();
        car1.checkSpeed();
        System.out.println();
        car2.printinfo();
        car2.checkSpeed();
        System.out.println();
        car3.printinfo();
        car3.checkSpeed();
    }
}
