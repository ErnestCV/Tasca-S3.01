package org.n3ex1.Vehicles;

public class Vehicle {

    //Vehicle és la classe que actua com a Receiver, que sap com executar una comanda en concret
    public void arrencar() {
        System.out.println("Arrencant el " + this.getClass().getSimpleName().toLowerCase());
    }

    public void accelerar(int velocitat) {
        System.out.println("Accelerant el " + this.getClass().getSimpleName().toLowerCase() + " fins a " + velocitat + " km/h");
    }

    public void frenar() {
        System.out.println("Frenant el " + this.getClass().getSimpleName().toLowerCase());
    }

}
