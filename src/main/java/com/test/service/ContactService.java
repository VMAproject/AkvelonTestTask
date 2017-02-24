package com.test.service;


import com.test.model.Contact;
import org.hibernate.metamodel.ValidationException;

import java.util.List;

public interface ContactService {

    void addContact(Contact contact) throws ValidationException;

    Contact getContact(Integer id);

    void updateContact(Contact contact) throws ValidationException;

    List<Contact> getListOfContacts();

    void removeContact(Integer... ids);
}