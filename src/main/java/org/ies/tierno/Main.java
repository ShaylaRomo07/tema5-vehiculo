package org.ies.tierno;

import org.ies.tierno.model.types.Car;

public class Main {
    public static void main(String[] args) {
        Car car=new Car(15000,"JKS858",5,150);
        car.move(10);
    }
}