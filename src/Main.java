public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("@Hello world!");
//        task 2&3
        Shape circle = new Circle(4.44);
        Shape square = new Square(4.44);
        System.out.println(circle.field());
        System.out.println(square.field());
//        task 4
        Car sportCar = new SportCar("BMW", "Mint");
        Car superCar = new SuperCar("Ferrari");
//        task 5
        User user = new User(756453,"Marcel", "moron@gmail.com", "Samsung");
        System.out.println(user.hashCode());




    }
}