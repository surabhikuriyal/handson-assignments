package com.hsbc.collection;

import java.util.HashSet;
import java.util.Set;

public class StudentMain {
	public static void main(String[] args) {
		Set<Student> set1 =new HashSet<Student>();
		set1.add(new Student("abc","A",11));
		set1.add(new Student("pqr","B",1));
		set1.add(new Student("xyz","A",21));
		set1.add(new Student("aaa","D",18));
		set1.add(new Student("bbb","C",31));
		
		for(Student student : set1)
			System.out.println(student);
	}

}
