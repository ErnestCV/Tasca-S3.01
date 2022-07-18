package org.n1ex2;

import org.n1ex2.factories.AbstractFactory;
import org.n1ex2.factories.GermanyFactory;
import org.n1ex2.factories.USAFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String country) {

        switch (country) {
            case "USA" -> {
                return new USAFactory();
            }
            case "Germany" -> {
                return new GermanyFactory();
            }

        }
        return null;
    }

}
