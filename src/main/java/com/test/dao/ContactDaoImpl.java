package com.test.dao;


import com.test.model.Contact;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactDaoImpl implements ContactDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public Contact getContact(Integer id) {
        return (Contact) sessionFactory.getCurrentSession().byId(Contact.class).load(id);
    }

    @Override
    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().save(contact);
    }

    @Override
    public void updateContact(Contact contact) {
        sessionFactory.getCurrentSession().merge(contact);
    }

    @Override
    public List<Contact> getListOfContacts() {

        return sessionFactory.getCurrentSession().createQuery("from Contact")
                .list();
    }

    @Override
    public void removeContact(Integer... ids) {
        Session currentSession = sessionFactory.getCurrentSession();
        for (Integer id : ids) {
            Contact contact = (Contact) currentSession.load(Contact.class, id);
            if (null != contact) {
                currentSession.delete(contact);
            }
        }
    }
}