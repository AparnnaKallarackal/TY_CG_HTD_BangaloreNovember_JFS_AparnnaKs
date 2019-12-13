package com.cg.phonesimulatorapp.services;

import java.util.List;

import com.cg.phonesimulatorapp.bean.Contact;
import com.cg.phonesimulatorapp.dao.ContactDao;
import com.cg.phonesimulatorapp.factory.ContactFactory;

public class ContactServicesImpl implements ContactServices{
	ContactDao dao=ContactFactory.instanceOfContactDaoImpl();

	@Override
	public boolean getAllContacts() {
		return ((ContactDao) dao).getAllContacts();
		
	}

	@Override
	public boolean addContact(Contact contact) {
		
		return dao.addContact(contact);
	}

	@Override
	public boolean deleteContact(Contact contact) {
		
		return dao.deleteContact(contact);
	}

	@Override
	public boolean editContact(Contact contact) {
		
		return dao.editContact(contact);
	}

}
