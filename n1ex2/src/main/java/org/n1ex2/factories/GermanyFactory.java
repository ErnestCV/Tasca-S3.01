package org.n1ex2.factories;

import org.n1ex2.address.Address;
import org.n1ex2.address.AddressGermany;
import org.n1ex2.phone.Phone;
import org.n1ex2.phone.PhoneGermany;

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
