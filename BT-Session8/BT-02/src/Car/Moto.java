package Car;

public class Moto  extends  Vehicle{
    public Moto() {
    }

    public Moto(String brand, String color) {
        super(brand, color);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + this.getBrand() + '\'' +
                ", color='" + this.getColor() + '\'' +
                '}';
    }
}
