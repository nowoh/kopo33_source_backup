package hw0324_Wed_ch7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class P01_3_Iterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("kim");
		list.add("lee");
		list.add("park");
		
		Iterator<String> iterator = list.iterator();
		//System.out.println(iterator.get());
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-------------------");
		
		for (String name : list ) {
			System.out.println(name);
		}
		
		System.out.println("-----------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		Collections.reverse(list);
		System.out.println(list);
	}
	

}
