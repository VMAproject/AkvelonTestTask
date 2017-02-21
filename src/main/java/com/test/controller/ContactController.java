package com.test.controller;


import com.test.model.Contact;
import com.test.service.ContactService;
import org.hibernate.metamodel.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/index")
    public String listContacts() {
        return "contact";
    }

    @RequestMapping("/datagrid")
    public String datagrid(Map<String, Object> map) {

        map.put("contactList", contactService.getListOfContacts());

        return "datagrid";
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact") Contact contact) {
        try {
            contactService.addContact(contact);
        } catch (ValidationException e) {
            return "redirect:/err";
        }
        return "redirect:/index";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String deleteContact(@RequestParam(value = "checkboxGroup", required = false) Integer[] contactsId) {
        contactService.removeContact(contactsId);

        return "redirect:/index";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateContact(@ModelAttribute("contact") Contact contact) {
        try {
            contactService.updateContact(contact);
        } catch (ValidationException e) {
            return "redirect:/err";
        }
        return "redirect:/index";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveContact(@ModelAttribute("contact") Contact contact) {

        contactService.addContact(contact);

        return "redirect:/index";
    }

    @RequestMapping("/edit")
    public ModelAndView editContact(@RequestParam(value = "checkboxGroup", required = false) Integer contactId, @ModelAttribute Contact contact) {
        contact = new Contact();
        boolean add = true;
        if (null != contactId) {
            contact = contactService.getContact(contactId);
            add = false;
        }
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("contact", contact);
        modelAndView.addObject("add", add);

        return modelAndView;
    }
}