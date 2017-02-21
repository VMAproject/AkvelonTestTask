package com.test.dao;


import com.test.model.Contact;

import java.util.List;

public interface ContactDAO {

    void addContact(Contact contact);

    Contact getContact(Integer id);

    void updateContact(Contact contact);

    List<Contact> getListOfContacts();

    void removeContact(Integer... ids);
}