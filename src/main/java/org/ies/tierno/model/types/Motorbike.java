package org.ies.tierno.model.types;

import org.ies.tierno.model.Vehicule;

public class Motorbike extends Vehicule {
    private int displacement;

    public Motorbike(int kmDone, String registration, int displacement) {
        super(kmDone, registration);
        this.displacement = displacement;
    }
    @Override
    public void showInfo() {
        System.out.println("Vehiculo: Camión");
        System.out.println("KM Realizados: " + kmDone);
        System.out.println("Matricula: " + registration);
        System.out.println("Cilindrada " + displacement);
    }
}
