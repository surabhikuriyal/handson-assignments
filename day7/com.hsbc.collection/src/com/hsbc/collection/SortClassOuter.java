package com.hsbc.collection;

import java.util.Comparator;

public class SortClassOuter {
	public class SortItemIdAscending implements Comparator<ItemClass>{

		@Override
		public int compare(ItemClass o1, ItemClass o2) {
			// TODO Auto-generated method stub
			return (o1.getItemId()-o2.getItemId());
		}
	}
	public class SortItemIdDescending implements Comparator<ItemClass>{

		@Override
		public int compare(ItemClass o1, ItemClass o2) {
			// TODO Auto-generated method stub
			return (o2.getItemId()-o1.getItemId());
		}
		
	}
	public class SortItemNameAscending implements Comparator<ItemClass>{

		@Override
		public int compare(ItemClass o1, ItemClass o2) {
			// TODO Auto-generated method stub
			return (o1.getName().compareTo(o2.getName()));
		}
		
	}
	public class SortItemNameDescending implements Comparator<ItemClass>{

		@Override
		public int compare(ItemClass o1, ItemClass o2) {
			// TODO Auto-generated method stub
			return (o2.getName().compareTo(o1.getName()));
		}
		
	}
	
	public class SortItemPriceAscending implements Comparator<ItemClass>{

		@Override
		public int compare(ItemClass o1, ItemClass o2) {
			// TODO Auto-generated method stub
			if (o1.getPrice() < o2.getPrice()) return -1;
	        if (o1.getPrice() > o2.getPrice()) return 1;
	        return 0;
		}
		
	}
	public class SortItemPriceDescending implements Comparator<ItemClass>{

		@Override
		public int compare(ItemClass o1, ItemClass o2) {
			// TODO Auto-generated method stub
			if (o2.getPrice() < o1.getPrice()) return -1;
	        if (o2.getPrice() > o1.getPrice()) return 1;
			return 0;
		}
		
	}
	public class SortRatingsAscending implements Comparator<ItemClass>{

		@Override
		public int compare(ItemClass o1, ItemClass o2) {
			// TODO Auto-generated method stub
			if (o1.getRatings() < o2.getRatings()) return -1;
	        if (o1.getRatings() > o2.getRatings()) return 1;
	        return 0;
		}
		
	}
	public class SortRatingsDescending implements Comparator<ItemClass>{

		@Override
		public int compare(ItemClass o1, ItemClass o2) {
			// TODO Auto-generated method stub
			if (o2.getRatings() < o1.getRatings()) return -1;
	        if (o2.getRatings() > o1.getRatings()) return 1;
			return 0;
		}
		
	}

}
