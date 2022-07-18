package org.n2ex1;

import org.n2ex1.factories.AbstractFactory;
import org.n2ex1.factories.GermanyFactory;
import org.n2ex1.factories.USAFactory;

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
