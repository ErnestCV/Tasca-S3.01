package org.n1ex1;

import java.util.Scanner;
import java.util.Stack;

public class Undo {

    //Singleton

    private static Undo instance;
    private static Stack<String> history;
    private static Scanner scanner;

    //Constructor privat
    private Undo() {

    }

    //Lazy initialiser (per evitar inicialitzar a startup si no s'empra el mètode)
    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
            history = new Stack<>();
        }
        return instance;
    }

    public void add(String str) {
        history.push(str);
        System.out.println("Comanda introduïda");
    }

    public void undo() {
        history.pop();
        System.out.println("Última comanda eliminada");
    }

    public void show() {
        System.out.println(history);
    }
}
