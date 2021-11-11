package com.fourth;

/**
 * @author Volodia Sachenko
 * @version 0.1
 * @since 10.11.21
 */

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    /*
    Конструкторы
    */
    public Car() {
        this(1954, 200.1123, 1800, "Red");
    }

    public Car(int year) {
        this(year, 196.77765);
    }

    public Car(int year, double speed) {
        this(year, speed, 2100);
    }

    public Car(int year, double speed, int weight) {
        this();
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    /*
    Геттеры
    */
    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    /*
    Сеттеры
    */
    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
