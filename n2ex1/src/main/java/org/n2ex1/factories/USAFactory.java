package org.n2ex1.factories;

import org.n2ex1.address.Address;
import org.n2ex1.address.AddressUSA;
import org.n2ex1.phone.Phone;
import org.n2ex1.phone.PhoneUSA;

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
