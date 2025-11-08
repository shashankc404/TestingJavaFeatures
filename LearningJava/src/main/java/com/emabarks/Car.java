package com.emabarks;

import java.math.BigDecimal;

public class Car {
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    private String model;
    private BigDecimal price;

    public Car(String model, BigDecimal price) {
        this.model = model;
        this.price = price;
    }

    public static void main(String[] args) {
        System.out.println("Hello word");

        Car c1= new Car("BMW",BigDecimal.valueOf(678));

        Car c2= new Car("Suzuri",BigDecimal.valueOf(899));

        System.out.println(c1);
        System.out.println(c2);
    }
}
