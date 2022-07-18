package org.n1ex2.address;

import org.n1ex2.IOUtils;

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
