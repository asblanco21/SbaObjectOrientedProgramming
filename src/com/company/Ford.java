package com.company;

//Create a subclass of the Car class and name it Ford
//From the sale price computed from Car class, subtract the manufacturer Discount.
public class Ford extends Car {
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }

    int year;
    int manufacturerDiscount;

    @Override
    double getSalePrice() {
        return super.getSalePrice();
    }
}
