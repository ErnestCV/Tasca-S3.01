package org.n1ex1;

public class Main {
    public static void main(String[] args) {

        //https://stackoverflow.com/questions/11530276/how-do-i-implement-a-simple-undo-redo-for-actions-in-java


        //Undo -> aplicar command

        //Patró command
        //Patró memento


        //TODO per consola

        Undo.getInstance().add("Command 1");
        Undo.getInstance().add("Command 2");
        Undo.getInstance().add("Command 3");

        Undo.getInstance().undo();

        Undo.getInstance().add("Command 4");

        Undo.getInstance().show();

    }
}