package org.n1ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Inicialitzar
        Scanner scanner = new Scanner(System.in);
        Undo instance = Undo.getInstance();

        int select;

        do {

            printMenu();

            select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                //Introduir una comanda
                case 1 -> {System.out.println("Introdueix la següent comanda:");
                    instance.add(scanner.nextLine());
                }

                //Eliminar la darrera comanda introduïda
                case 2 -> instance.undo();

                //Mostrar totes les comandes
                case 3 -> instance.show();

                //Sortir del programa
                case 0 -> System.out.println("Sortint del programa");

            }

        } while (select != 0);
    }

    public static void printMenu() {

        System.out.println("""
                -------------------
                Escolliu una opció:
                1: Introduir una comanda
                2: Eliminar la darrera comanda introduïda
                3: Mostrar totes les comandes
                0: Sortir
                ------------------
                """);

    }
}