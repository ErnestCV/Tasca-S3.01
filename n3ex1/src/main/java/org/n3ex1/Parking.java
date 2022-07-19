package org.n3ex1;

import org.n3ex1.Vehicles.*;

import java.util.HashMap;

public class Parking {

    private final Avio avio;
    private final Bicicleta bicicleta;
    private final Cotxe cotxe;
    private final Vaixell vaixell;

    private final HashMap<String, Vehicle> vehicles = new HashMap<>();

    public Parking(Avio avio, Bicicleta bicicleta, Cotxe cotxe, Vaixell vaixell) {
        this.avio = avio;
        this.bicicleta = bicicleta;
        this.cotxe = cotxe;
        this.vaixell = vaixell;
        vehicles.put("Avió", avio);
        vehicles.put("Bicicleta", bicicleta);
        vehicles.put("Cotxe", cotxe);
        vehicles.put("Vaixell", vaixell);
    }

    public HashMap<String, Vehicle> getVehicles() {
        return vehicles;
    }

    public Avio getAvio() {
        return avio;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public Cotxe getCotxe() {
        return cotxe;
    }

    public Vaixell getVaixell() {
        return vaixell;
    }
}
