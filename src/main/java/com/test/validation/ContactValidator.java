package com.test.validation;


import com.test.model.Contact;


public class ContactValidator {

    public static boolean check(Contact contact) {
        if (contact == null)
            return false;
        return checkName(contact.getFirstname()) &&
                checkName(contact.getLastname()) &&
                checkEmail(contact.getEmail()) &&
                checkTelephone(contact.getTelephone());
    }

    private static boolean checkName(String name) {
        return name.matches("^[a-zA-Z]{1,30}$");
    }

    private static boolean checkEmail(String name) {
        return name.matches("^[\\w\\+]+(\\.\\w-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }

    private static boolean checkTelephone(long tel) {
        return ("" + tel).matches("^\\d{6,15}$");
    }
}
