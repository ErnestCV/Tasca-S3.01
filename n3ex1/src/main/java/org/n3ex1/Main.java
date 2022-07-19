package org.n3ex1;

import org.n3ex1.Commands.AcceleraCommand;
import org.n3ex1.Commands.ArrencaCommand;
import org.n3ex1.Commands.Command;
import org.n3ex1.Commands.FrenaCommand;
import org.n3ex1.Vehicles.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Demostració amb un vehicle concret:

        //Instanciem l'objecte que sap executar les comandes en concret que li demanarem
        Vehicle receiver = new Cotxe();
        //Definim les comandes que volem executar
        List<Command> commands = new ArrayList<>();
        Command arrencaCotxe = new ArrencaCommand(receiver);
        commands.add(arrencaCotxe);
        Command acceleraCotxe = new AcceleraCommand(receiver, 120);
        commands.add(acceleraCotxe);
        //Creem l'invocador que conté la comanda a invocar
        Invoker invoker = new Invoker(commands);
        //Invoquem la comanda en qüestió
        invoker.execute();


        //Demostració amb el pàrquing:

        //Creem un nou pàrquing
        Parking parking = new Parking(new Avio(), new Bicicleta(), new Cotxe(), new Vaixell());

        //Creem la llista de comandes que volem executar
        List<Command> commandsParking = new ArrayList<>();
        Command arrencaAvio = new ArrencaCommand(parking.getAvio());
        Command acceleraAvio = new AcceleraCommand(parking.getAvio(), 300);
        Command arrencaVaixell = new ArrencaCommand(parking.getVaixell());
        Command acceleraVaixell = new AcceleraCommand(parking.getVaixell(), 50);
        Command frenaVaixell = new FrenaCommand(parking.getVaixell());
        Collections.addAll(commandsParking, arrencaAvio, acceleraAvio, arrencaVaixell, acceleraVaixell, frenaVaixell);

        //Creem l'invocador
        Invoker invokerParking = new Invoker(commandsParking);

        //Invoquem les comandes
        invokerParking.execute();

    }

    //https://riptutorial.com/design-patterns/example/8933/command-pattern-example-in-java
    //https://www.tutorialspoint.com/design_pattern/command_pattern.htm#
}