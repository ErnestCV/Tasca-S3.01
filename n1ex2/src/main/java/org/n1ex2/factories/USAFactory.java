package org.n1ex2.factories;

import org.n1ex2.address.Address;
import org.n1ex2.address.AddressUSA;
import org.n1ex2.phone.Phone;
import org.n1ex2.phone.PhoneUSA;

public class USAFactory implements AbstractFactory {

    @Override
    public Phone createPhone() {
        return new PhoneUSA();
    }

    @Override
    public Address createAddress() {
        return new AddressUSA();
    }
}
