package org.example;

public class Main {
    public static void main(String[] args) {

        // inheritance = 	the process where one class acquires,
        //					the attributes and methods of another.
        // Vehicle is the super class (parent class)
        // Car and bicycle are the subclasses of the Vehicle class (child classes)

        Car car = new Car();

        car.go();

        Bicycle bike = new Bicycle();

        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);
        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}