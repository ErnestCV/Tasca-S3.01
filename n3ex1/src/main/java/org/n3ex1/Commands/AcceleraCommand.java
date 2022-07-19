package org.n3ex1.Commands;

import org.n3ex1.Vehicles.Vehicle;

public class AcceleraCommand implements Command{

    private final Vehicle receiver;
    private final int velocitat;

    public AcceleraCommand(Vehicle receiver, int velocitat) {
        this.receiver = receiver;
        this.velocitat = velocitat;
    }

    @Override
    public void execute() {
        receiver.accelerar(velocitat);
    }

}
