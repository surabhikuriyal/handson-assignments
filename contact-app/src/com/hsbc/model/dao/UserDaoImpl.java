package com.hsbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.controller.beans.Contacts;
import com.hsbc.controller.beans.User;
import com.hsbc.model.utility.Database;

public class UserDaoImpl implements UserDao {
	public User validate(int userid,String password) {
		User u=null;
		Connection con=Database.getConnection();
		String query="Select * from user_table where user_id=? and password=?";
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, userid);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				u=new User();
				u.setUserid(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setPhone(rs.getLong(4));
				u.setDob(rs.getString(5));
			}
			rs.close();
			ps.close();
			con.close();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return u;
	}

	public User store(User user) {
		int id = 0;
		Connection con=Database.getConnection();
		PreparedStatement ps;
		try
		{
			ps = con.prepareStatement("values(next value for user_seq)");
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				id=rs.getInt(1);
			}
			ps=con.prepareStatement("insert into user_table values(?,?,?,?,?)");
			user.setUserid(id);
			ps.setInt(1, id);
			ps.setString(2,user.getName());
			ps.setString(3,user.getPassword());
			ps.setLong(4, user.getPhone());
			ps.setString(5, user.getDob());
			ps.executeUpdate();
			ps.close();
			con.close();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return user;
	}

	public int addContacts(User u,String name,long phone) {
		Connection con=Database.getConnection();
		int id = 0;
		PreparedStatement ps;
		try
		{
			ps = con.prepareStatement("values(next value for contact_seq)");
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				id=rs.getInt(1);
			}
			ps=con.prepareStatement("insert into contacts values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setLong(3,phone);
			ps.setLong(4, u.getUserid());
			ps.executeUpdate();
			ps.close();
			con.close();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return id;
	}

	public List<Contacts> contactDetails(User user) {
		Connection con=Database.getConnection();
		String query="Select * from contacts where user_id=?";
		List<Contacts> l=new ArrayList<>();	
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,user.getUserid());
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				l.add(new Contacts(rs.getString(2),rs.getLong(3)));
			}
			rs.close();
			ps.close();
			con.close();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return l;
	}

	public int validateContactId(int id) {
		Connection con=Database.getConnection();
		String query="Select * from contacts where contact_id=?";
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				return(1);
			}
			rs.close();
			ps.close();
			con.close();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

}
