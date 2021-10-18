package com.company;



public class Main
{
    public static class MyOwnAutoShop extends Car{

    }

    public static void main(String[] args) {
	Car car1 = new Car("blue", 20000, 200);
        System.out.println(car1.getColor());
        System.out.println(car1.getRegularPrice());
        System.out.println(car1.getSpeed());

    }
}
