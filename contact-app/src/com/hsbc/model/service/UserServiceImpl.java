package com.hsbc.model.service;

import java.util.List;

import com.hsbc.controller.beans.Contacts;
import com.hsbc.controller.beans.User;
import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.dao.UserDao;
import com.hsbc.model.utility.*;

public class UserServiceImpl implements UserService {
	
	UserDao dao=(UserDao)FactoryPattern.getInstance(Type.DAO);

	@Override
	public User login(int userid,String password) throws UserNotFoundException {
	  User user= dao.validate(userid,password);
	  if(user==null)
	  {
		  throw new UserNotFoundException();
	  }
	  return user;
	}

	@Override
	public User register(User user) {
		return dao.store(user);
	}

	@Override
	public int addContacts(User u,String friend_name,long friend_phone) {
		return dao.addContacts(u, friend_name, friend_phone);
	}

	@Override
	public List< Contacts>contactDetails1(User user) {
		return dao.contactDetails(user);
	}

	@Override
	public int validateContactId(int contact_id) {
		return dao.validateContactId(contact_id);
	}

	@Override
	public int validateContactId(int contact_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Contacts> contactDetails(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
