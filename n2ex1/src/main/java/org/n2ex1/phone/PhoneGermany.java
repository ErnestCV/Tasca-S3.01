package org.n2ex1.phone;

import org.n2ex1.IOUtils;

public class PhoneGermany implements Phone {

    private String phoneNumber;

    public PhoneGermany() {
        this.phoneNumber = providePhoneNumber();
    }

    @Override
    public String providePhoneNumber() {
        System.out.println("Input a German phone number:");
        String number = IOUtils.readString();
        return "+49 " + number;
    }

    @Override
    public String toString() {
        return "Phone number: " + phoneNumber;
    }
}
