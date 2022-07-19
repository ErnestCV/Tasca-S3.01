package org.n3ex1.Commands;

import org.n3ex1.Vehicles.Vehicle;

public class ArrencaCommand implements Command{

    private final Vehicle receiver;

    public ArrencaCommand(Vehicle receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.arrencar();
    }
}
