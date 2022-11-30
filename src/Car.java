
//task 3
/*
    abstraction - implementation of classes is hidden, it is not nessesery to show user
    whole description

    inheritance - SportCar inherit from Car, SuperCar inherit from Car

    SportCar has access to every method from Car plus makeSportNoise(),
    SuperCar has access to every method from SportCar plus makeSuperNoise(),


     encapsulation - what is said above plus getters&setters for private states of object
        */
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
    void makeSportNoise(){
        System.out.println("ZIUUUUMMMMMMMM");
    }

}

class SuperCar extends SportCar{
    public SuperCar(String brand) {
        super(brand, "Red");
    }

    void makeSuperNoise(){
        System.out.println("UUUUUUUUUUUUUUUUUUUUU");
    }

}
