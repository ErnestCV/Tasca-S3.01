package org.n2ex1;

import org.n2ex1.factories.AbstractFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOUtils {

    private static final List<Contact> agenda = new ArrayList<>();

    private static final Scanner scanner = new Scanner(System.in);

    public static String readString() {
        return scanner.nextLine();
    }

    public static void addToAgenda() {
        System.out.println("Input a valid country from the list: USA - Germany");
        String country = scanner.nextLine();
        AbstractFactory provider = FactoryProvider.getFactory(country);
        agenda.add(new Contact(provider));
    }

    public static void showAgenda() {
        agenda.forEach(System.out::println);
    }

}
