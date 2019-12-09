package com.capgemini.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class UserServicesImpl implements UserServices{
	UserDAO dao=UserFactory.instanceOfUserDAOImpl();

	@Override
	public UserBean userLogin(String username, String password) {

		return null;
	}

	@Override
	public List<UserBean> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}

	@Override
	public boolean updateUser(UserBean user) {
		
		//return dao.updateUser(user);
		return false;
	}

	@Override
	public boolean insertUser(UserBean user) {
		
		return dao.insertUser(user);
	}

	@Override
	public boolean deleteUser(UserBean user) {
		
		return  dao.deleteUser(user);
	}

}
