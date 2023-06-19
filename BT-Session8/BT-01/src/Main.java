import Animal.Animal;
import  Animal.Cat;
import  Animal.Dog;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Bird");
        Dog dog1 = new Dog("chó đen","black");
        Dog dog2 = new Dog("chó vàng","white");
        Cat cat = new Cat("Mèo meo");

        System.out.println("animal1's name is "+animal1.getName());
        animal1.setName("Bird");
        System.out.println("animal1's name is "+animal1.getName());
        dog1.setName("Corgi");
        System.out.println("Name : "+dog1.getName());
        System.out.println("Sousd : "+dog1.Sound());
        System.out.println("Color : "+dog2.getColor());
        System.out.println("Sound : "+dog2.Sound());
        System.out.println("Name : "+cat.getName());
        System.out.println("Sound : "+cat.Sound());
    }
}