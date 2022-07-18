package org.n1ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //https://refactoring.guru/design-patterns/abstract-factory/java/example

        Scanner scanner = new Scanner(System.in);
        int select;

        do {
            printMenu();

            select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                //Introduce a new contact
                case 1 -> IOUtils.addToAgenda();

                //Caldria implementar funcionalitat d'esborrar

//                //Delete a contact
//                case 2 -> IOUtils().deleteFromAgenda();

                //Show contacts list
                case 3 -> IOUtils.showAgenda();

                //Caldria implementar funcionalitat d'actualitzar

//                //Update contact
//                case 4 -> IOUtils.updateContact();

                //Sortir del programa
                case 0 -> System.out.println("Exiting programme");
            }

        } while (select != 0);
    }

    public static void printMenu() {

        System.out.println("""
                -------------------
                Escolliu una opció:
                1: Introduce a new contact
                3: Show contact list
                0: Exit
                ------------------
                """);

    }
}