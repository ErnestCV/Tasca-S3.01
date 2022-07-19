package org.n3ex1.Commands;

import org.n3ex1.Vehicles.Vehicle;

public class FrenaCommand implements Command{

    private final Vehicle receiver;

    public FrenaCommand(Vehicle receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.frenar();
    }

}
