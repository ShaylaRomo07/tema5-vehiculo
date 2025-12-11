package org.ies.tierno.model.types;

import org.ies.tierno.model.Vehicule;

public class Truck extends Vehicule {
    private int numberAxles;

    public Truck(int kmDone, String registration, int numberAxles) {
        super(kmDone, registration);
        this.numberAxles = numberAxles;
    }

    @Override
    public void showInfo() {
        System.out.println("Vehiculo: Camión");
        System.out.println("KM Realizados: " + kmDone);
        System.out.println("Matricula: " + registration);
        System.out.println("Numero de ejes: " + numberAxles);
    }
}
