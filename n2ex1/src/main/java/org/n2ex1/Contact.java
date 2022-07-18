package org.n2ex1;

import org.n2ex1.address.Address;
import org.n2ex1.factories.AbstractFactory;
import org.n2ex1.phone.Phone;

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
