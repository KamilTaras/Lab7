public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("@Hello world!");
//        state = ( name - Anomalia, race - kundel)
//        doge = identity
        Dog doge = new Dog("Anomalia", "kundel");
//      barking = behaviour
        doge.barking();
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

        Author author1 = new Author("Marysia", "ok@gmail.com", 'f');
        Author author2 = new Author("Andrzej", "git@wp.com", 'm');
        Author[] authors = {author1, author2};

        Book book1 = new Book("Heart Of Darkness",author1,69.99);
        Book book2 = new Book("Bible", authors, 6.51);


        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}