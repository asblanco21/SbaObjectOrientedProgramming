package com.company;

//Create a superclass called Car. The car class has the following fields and methods...

public class Car {
   public int speed;
    double regularPrice;
   public String color;

    double getSalePrice() {
        double salePrice = getSalePrice();
        return salePrice;
    }


    public Car(){

        this("blue", 20000, 200);
    }
    public Car(String color, double regularPrice, int speed){
        this.setColor(color);
        this.regularPrice = regularPrice;
        this.speed = speed;
    }
    //getters and setters

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
