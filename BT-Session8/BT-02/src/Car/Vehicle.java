package Car;

public class Vehicle {
    private  String Brand;
    private  String Color;

    public Vehicle() {
    }

    public Vehicle(String brand, String color) {
        Brand = brand;
        Color = color;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Brand='" + Brand + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}
