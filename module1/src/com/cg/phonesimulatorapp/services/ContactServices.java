package com.cg.phonesimulatorapp.services;

import java.util.List;

import com.cg.phonesimulatorapp.bean.Contact;

public interface ContactServices {
	public boolean getAllContacts();
	public boolean addContact(Contact contact);
	public boolean deleteContact(Contact contact);
	public boolean editContact(Contact contact);
}
