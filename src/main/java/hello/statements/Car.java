package hello.statements;

public class Car {

    private String brand;
    private Color color;

    public Car(String brand, Color color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public static void main(String[] args) {
        Car car = new Car("Fiat", Color.GREEN);
        Car car2 = new Car("Volvo", Color.RED);

        System.out.println(car.getColor());
        System.out.println(car.getColor().getHungarianColour());
        System.out.println(car2.getColor());
        System.out.println(car2.getColor().getHungarianColour());
    }
}
