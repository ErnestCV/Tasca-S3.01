package org.n1ex2.address;

import org.n1ex2.IOUtils;

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
