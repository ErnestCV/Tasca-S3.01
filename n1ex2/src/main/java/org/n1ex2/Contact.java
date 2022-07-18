package org.n1ex2;

import org.n1ex2.address.Address;
import org.n1ex2.factories.AbstractFactory;
import org.n1ex2.phone.Phone;

public class Contact {

    private AbstractFactory provider;
    private Phone phone;
    private Address address;

    public Contact(AbstractFactory provider) {
        this.provider = provider;
        this.phone = provider.createPhone();
        this.address = provider.createAddress();
    }

    @Override
    public String toString() {
        return phone + ", " + address;
    }
}
