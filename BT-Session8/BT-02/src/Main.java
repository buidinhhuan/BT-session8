import Car.Car;
import Car.Moto;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW","Black");
        Car car2 = new Car("DUCATI","Red");
        System.out.println("Car " + car1.getBrand());
        car1.setColor("White");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        Moto motor1 = new Moto("Hd", "bl");
        Moto motor2 = new Moto("Ya", "ye");
        System.out.println(motor1.toString());
        System.out.println(motor2.toString());
    }
}