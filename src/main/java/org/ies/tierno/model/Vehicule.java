package org.ies.tierno.model;

public abstract class Vehicule {
    protected int kmDone;
    protected String registration;

    public Vehicule(int kmDone, String registration) {
        this.kmDone = kmDone;
        this.registration = registration;
    }
    public void move(int km){
        System.out.println("Se han recorrido "+km+"km mas.");
        kmDone=kmDone+km;
        showInfo();
    }
    public abstract void showInfo();

}
