package com.hsbc.model.service;

import java.util.List;

import com.hsbc.controller.beans.Contacts;
import com.hsbc.controller.beans.User;
import com.hsbc.exception.UserNotFoundException;

public interface UserService {
	User login(int userid,String password) throws UserNotFoundException;
	User register(User user);
	int addContacts(User u,String friend_name,long friend_phone);
	int validateContactId(int contact_id);
	List<Contacts>contactDetails(User user);
	List<Contacts> contactDetails1(User user);

}
