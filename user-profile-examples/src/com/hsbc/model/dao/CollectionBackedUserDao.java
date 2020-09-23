package com.hsbc.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.beans.User;

public class CollectionBackedUserDao implements UserDao {
	
	// create a ArrayList with List reference
	List<User> list = new ArrayList<User>();

	@Override
	public User store(User user) {
		// TODO Auto-generated method stub
		list.add(user);
		return user;
	}

	@Override
	public User[] fetchUsers() {
		// TODO Auto-generated method stub
		User[] userArray = new User[list.size()];
        userArray = list.toArray(userArray);
		return userArray;
	}

	@Override
	public User fetchUserById(int userId) {
		// TODO Auto-generated method stub
		User user = null;
		for(User user1 : list) {
			if(user1.getUserId() == userId) { 
				user = user1;
				return user;
			}
		}
		return null;
	}

	@Override
	public User updateUser(int userId, User user) {
		// TODO Auto-generated method stub
		for(User user1 : list) {
			if(user1.getUserId() == userId) {
				user1 = user;
				break;
			}
		}
		return user;
	}

}
