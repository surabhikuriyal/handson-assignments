package com.hsbc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MainItemClass {
	private static final String SortClassOuter = null;

	public static void main(String[] args) {
		List<ItemClass> list = new ArrayList<ItemClass>();
		list.add(new ItemClass(1,"raj",2000.0,5.0));
		list.add(new ItemClass(67,"abc",670.0,4.0));
		list.add(new ItemClass(10,"xyz",1000.0,3.0));
		list.add(new ItemClass(21,"mike",900.0,2.0));
		list.add(new ItemClass(34,"joey",500.0,2.0));
		System.out.println("----LIST----");
		for(ItemClass i : list) {
			System.out.println(i);
		}
		SortClassOuter outer=new SortClassOuter();
		System.out.println("---SORT BY ITEM ID IN ASCENDING ORDER----");
		Collections.sort(list,outer.new SortItemIdAscending());
		for(ItemClass i : list) {
			System.out.println(i);
		}
		System.out.println("---SORT BY ITEM ID IN DESCENDING ORDER----");
		Collections.sort(list,outer.new SortItemIdDescending());
		for(ItemClass i : list) {
			System.out.println(i);
		}
		System.out.println("---SORT BY ITEM NAME IN ASCENDING ORDER----");
		Collections.sort(list,outer.new SortItemNameAscending());
		for(ItemClass i : list) {
			System.out.println(i);
		}
		System.out.println("---SORT BY ITEM NAME IN DESCENDING ORDER----");
		Collections.sort(list,outer.new SortItemNameDescending());
		for(ItemClass i : list) {
			System.out.println(i);
		}
		System.out.println("---SORT BY ITEM PRICE IN ASCENDING ORDER----");
		Collections.sort(list,outer.new SortItemPriceAscending());
		for(ItemClass i : list) {
			System.out.println(i);
		}
		System.out.println("---SORT BY ITEM PRICE IN DESCENDING ORDER----");
		Collections.sort(list,outer.new SortItemPriceDescending());
		for(ItemClass i : list) {
			System.out.println(i);
		}
		System.out.println("---SORT BY ITEM RATINGS IN ASCENDING ORDER----");
		Collections.sort(list,outer.new SortRatingsAscending());
		for(ItemClass i : list) {
			System.out.println(i);
		}
		System.out.println("---SORT BY ITEM RATINGS IN DESCENDING ORDER----");
		Collections.sort(list,outer.new SortRatingsAscending());
		for(ItemClass i : list) {
			System.out.println(i);
		}
	}

}
