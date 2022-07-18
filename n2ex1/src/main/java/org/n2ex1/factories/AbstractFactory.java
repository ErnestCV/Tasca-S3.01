package org.n2ex1.factories;

import org.n2ex1.address.Address;
import org.n2ex1.phone.Phone;

public interface AbstractFactory {

    Phone createPhone();
    Address createAddress();
}
