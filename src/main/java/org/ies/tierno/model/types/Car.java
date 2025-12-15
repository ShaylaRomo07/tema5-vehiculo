package org.ies.tierno.model.types;

import org.ies.tierno.model.Vehicle;

public class Car extends Vehicle {
    private int numberDoors;
    private int horsepower;

    public Car(int kmDone, String registration, int numberDoors, int horsepower) {
        super(kmDone, registration);
        this.numberDoors = numberDoors;
        this.horsepower = horsepower;
    }

    @Override
    public void showInfo() {
        System.out.println("Vehiculo: Coche");
        System.out.println("KM Realizados: " + kmDone);
        System.out.println("Matricula: " + registration);
        System.out.println("Numero de puertas: " + numberDoors);
        System.out.println("Caballos de potencia: " + horsepower);
    }
}
