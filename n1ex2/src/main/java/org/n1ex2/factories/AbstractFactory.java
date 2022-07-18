package org.n1ex2.factories;

import org.n1ex2.address.Address;
import org.n1ex2.phone.Phone;

public interface AbstractFactory {

    Phone createPhone();
    Address createAddress();
}
