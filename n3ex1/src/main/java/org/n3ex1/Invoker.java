package org.n3ex1;

import org.n3ex1.Commands.Command;

import java.util.List;

public class Invoker {

    //Conté una llista de comandes concretes, que s'han d'executar
    private final List<Command> commands;

    public Invoker(List<Command> commands) {
        this.commands = commands;
    }

    //Executa el llistat de comandes
    public void execute() {
        this.commands.forEach(Command::execute);
    }


}
