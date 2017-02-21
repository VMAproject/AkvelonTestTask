package com.test.service;


import com.test.dao.ContactDAO;
import com.test.model.Contact;
import com.test.validation.ContactValidator;
import org.hibernate.metamodel.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDAO contactDAO;


    public Contact getContact(Integer id) {
        return contactDAO.getContact(id);
    }


    public void addContact(Contact contact) throws ValidationException {
        if (ContactValidator.check(contact)) {
            contactDAO.addContact(contact);
        } else throw new ValidationException("bad contact");
    }


    public void updateContact(Contact contact) throws ValidationException {
        if (ContactValidator.check(contact)) {
            contactDAO.updateContact(contact);
        } else throw new ValidationException("bad contact");
    }


    public List<Contact> getListOfContacts() {

        return contactDAO.getListOfContacts();
    }

    public void removeContact(Integer... ids) {
        contactDAO.removeContact(ids);
    }
}