package com.hsbc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationDemo {

	public static void main(String[] args) {
		try {
			User u1 = new User("Alexandar", 35);
			User u2 = new User("Bruce", 36);
			User u3 = new User("Charles", 46);
			
			// add all these objects to the collection & serialize the collection, because
			// collection classes are also serializable type
			List<User> list = new ArrayList<User>();
			list.add(u1);
			list.add(u2);
			list.add(u3);
			
			FileOutputStream fos = new FileOutputStream("fileDb.ser");
			// creates an instance that can store complex object into the output stream
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list); // checks whether the object is Serializable type
			System.out.println("Object Serialized");
			fos.flush(); // flushes the output stream
			oos.close();
			fos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
