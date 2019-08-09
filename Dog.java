package Udemy;

import Udemy.Animal;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private  int tail;
    private  int teeth;
    private String coat;
    public Dog(String name,int size, int weight, int eyes,int legs,int tail,int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew() {
        System.out.println("Udemy.Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Udemy.Dog.eat() called");
        chew();
        super.eat();
    }
    public void walk() {
        System.out.println("Udemy.Dog.walk() called");
        super.move(5);
    }
    public void run() {
        System.out.println("Udemy.Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Udemy.Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Udemy.Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
