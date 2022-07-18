package org.n2ex1.address;

import org.n2ex1.IOUtils;

public class AddressUSA implements Address{

    private String address;

    public AddressUSA() {
        this.address = provideAddress();
    }

    @Override
    public String provideAddress() {
        System.out.println("Input a US address:");
        return IOUtils.readString();
    }

    @Override
    public String toString() {
        return "Address: " + address;
    }
}
