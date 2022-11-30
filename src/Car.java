public abstract class Car {
    private String brand;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    void makeNoise(){
        System.out.println("Ziuuuum");
    }
}

class SportCar extends Car{

    public SportCar(String brand, String color) {
        super(brand, color);
    }

}

class SuperCar extends Car{
    public SuperCar(String brand) {
        super(brand, "Red");
    }
}
