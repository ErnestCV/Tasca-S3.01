package org.n2ex1.address;

import org.n2ex1.IOUtils;

public class AddressGermany implements Address{

    private String address;

    public AddressGermany() {
        this.address = provideAddress();
    }

    @Override
    public String provideAddress() {
        System.out.println("Input a German address:");
        return IOUtils.readString();
    }

    @Override
    public String toString() {
        return "Address: " + address;
    }

}
