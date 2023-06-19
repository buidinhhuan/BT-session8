import RA.Circle;
import RA.Rectangle;
import RA.Shape;
import RA.Square;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Black",true);
        System.out.println(shape);

        Circle circle = new Circle("Red", false, 5.0);
        System.out.println(circle);
        System.out.println("Area " +circle.getArea());
        System.out.println("Perimeter " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle("Blue",true,3.0,4.0);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Square square = new Square(5.0, "purple", false);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

    }
}