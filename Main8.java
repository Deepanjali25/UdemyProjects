package Udemy;

public class Main8 {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("Modern",4,3,2,1);
        Lamp lamp = new Lamp("Classic",false,75);
        Bedroom bedroom = new Bedroom("Tims",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

        //Udemy.Dimensions dimensions = new Udemy.Dimensions(20,20,5);
        //Udemy.Case theCase = new Udemy.Case("220B", "Dell", "240", dimensions);
        //Udemy.Monitor theMonitor = new Udemy.Monitor("27 inch Beast", "Acer", 27, new Udemy.Resolution(2540,1440));
        //Udemy.Motherboard theMotherboard = new Udemy.Motherboard("BJ-200", "Asus",4,6,"v2.44");
        //Udemy.PC thePC =new Udemy.PC(theCase, theMonitor, theMotherboard);
        //thePC.powerUp();


        //Udemy.Outlander outlander = new Udemy.Outlander(36);
        //outlander.steer(45);
        //outlander.accelerate(30);
        //outlander.accelerate(20);
        //outlander.accelerate(-42);

        //Udemy.Animal animal = new Udemy.Animal("Udemy.Animal", 1, 1, 5, 5);
        //Udemy.Dog dog = new Udemy.Dog("Yorkie", 8,20,2,4,1,20,"long silky");
        //dog.eat();
        // dog.walk();
        //dog.run();

       // Udemy.Account bobsAccount = new Udemy.Account();
       // System.out.println(bobsAccount.getNumber());
       // System.out.println(bobsAccount.getBalance());
       // bobsAccount.withdrawal(100.0);
       // bobsAccount.deposit(50.0);
       // bobsAccount.withdrawal(100.0);
       // bobsAccount.deposit(51.0);
       // bobsAccount.withdrawal(100.0);
        // Udemy.vipPerson person1 = new Udemy.vipPerson();
        // System.out.println(person1.getName());
        // Udemy.vipPerson person2 = new Udemy.vipPerson("Bob", 25000.00);
        // System.out.println(person2.getName());
        // Udemy.vipPerson person3 = new Udemy.vipPerson("Tim", 100.00, "tim@email.com");
        // System.out.println(person3.getName());
    }
}
