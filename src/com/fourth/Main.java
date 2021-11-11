package com.fourth;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(1967);
        Car car2 = new Car(1999, 180.30984);
        Car car3 = new Car(2000, 190.128674, 1800);
        Car car4 = new Car(2001, 185.1948372, 1950, "Grey");
        car.setYear(1995);
        car1.setSpeed(199.4445);
        car2.setWeight(1435);
        car2.setColor("Silver");
        System.out.println("Car. Рік: " + car.getYear() + " Швидкість: " + car.getSpeed() + " км/год Вага " +
                car.getWeight() + " кг Колір: " + car.getColor());
        System.out.println("Car1. Рік: " + car1.getYear() + " Швидкість: " + car1.getSpeed() + " км/год Вага "
                + car1.getWeight() + " кг Колір: " + car1.getColor());
        System.out.println("Car2. Рік: " + car2.getYear() + " Швидкість: " + car1.getSpeed() + " км/год Вага "
                + car2.getWeight() + " кг Колір: " + car2.getColor());
        System.out.println("Car3. Рік: " + car3.getYear() + " Швидкість: " + car3.getSpeed() + " км/год Вага "
                + car3.getWeight() + " кг Колір: " + car3.getColor());
        System.out.println("Car4. Рік: " + car4.getYear() + " Швидкість: " + car4.getSpeed() + " км/год Вага "
                + car4.getWeight() + " кг Колір: " + car4.getColor());
    }
}
