package com.company;

//Create a subclass of the Car class and name it Truck. The Truck class has the following fields and methods....
// for double getSalePrice implement if weight >2000, then 10%discount, otherwise, 20% discount.
public class Truck extends Car {
    public Truck(String blue, int weight, int regularPrice) {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    int weight;
    public Truck(){
        this("blue", 2500, 25000);
    }
     @Override
     public double getSalePrice(){
        if(weight > 2000)
            return (regularPrice * .1);
        else {
            return  (regularPrice *.2);
        }
    }
}
