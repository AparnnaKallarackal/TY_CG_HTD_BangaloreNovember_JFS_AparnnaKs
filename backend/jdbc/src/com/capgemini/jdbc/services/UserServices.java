package com.capgemini.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;

public interface UserServices {
	public List<UserBean>getAllUsers();
	public UserBean userLogin(String userName,String password);
	public boolean updateUser(UserBean user);
	public boolean insertUser(UserBean user);
	public boolean deleteUser(UserBean user);

}
