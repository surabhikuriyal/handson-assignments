package com.hsbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializationDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fileDb.ser");
			// allows you to read the object from the input stream
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<User> list = (List<User>)ois.readObject();
			for(User user : list) {
				System.out.println(user);
			}
			ois.close();
			fis.close();
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
