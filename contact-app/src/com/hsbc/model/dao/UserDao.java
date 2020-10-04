package com.hsbc.model.dao;

import java.util.List;

import com.hsbc.controller.beans.Contacts;
import com.hsbc.controller.beans.User;

public interface UserDao {
	
	User validate(int userid,String password);
	User store(User user);
	int addContacts(User u,String friendname,long friendphone);
	List<Contacts> contactDetails(User user);
	int validateContactId(int id);
}
