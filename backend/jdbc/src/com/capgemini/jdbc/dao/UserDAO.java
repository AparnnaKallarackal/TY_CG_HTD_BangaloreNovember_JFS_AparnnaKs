package com.capgemini.jdbc.dao;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;

public interface UserDAO {
	public List<UserBean>getAllUsers();
	public UserBean userLogin(UserBean user);
	public boolean updateUser(UserBean user);
	public boolean insertUser(UserBean user);
	public boolean deleteUser(UserBean user);

}
