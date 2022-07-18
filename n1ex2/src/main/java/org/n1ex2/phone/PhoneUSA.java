package org.n1ex2.phone;

import org.n1ex2.IOUtils;

public class PhoneUSA implements Phone {

    private String phoneNumber;

    public PhoneUSA() {
        this.phoneNumber = providePhoneNumber();
    }

    @Override
    public String providePhoneNumber() {
        System.out.println("Input a US phone number:");
        String number = IOUtils.readString();
        return "+1 " + number;
    }

    @Override
    public String toString() {
        return "Phone number: " + phoneNumber;
    }
}
