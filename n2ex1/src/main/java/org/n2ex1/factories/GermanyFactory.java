package org.n2ex1.factories;

import org.n2ex1.address.Address;
import org.n2ex1.address.AddressGermany;
import org.n2ex1.phone.Phone;
import org.n2ex1.phone.PhoneGermany;

public class GermanyFactory implements AbstractFactory{

    @Override
    public Phone createPhone() {
        return new PhoneGermany();
    }

    @Override
    public Address createAddress() {
        return new AddressGermany();
    }

}
