package hw0324_Wed_ch7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P01_4_Queue {

	public static void main(String[] args) {
		Queue<String> name = new LinkedList<String>();

		name.offer("kim");
		System.out.println(name);
		name.offer("lee");
		System.out.println(name);
		name.offer("choi");
		System.out.println(name);
		System.out.println(name.poll());
		System.out.println(name.poll());
		System.out.println(name);
		System.out.println();
		
		Queue<Integer> num = new LinkedList<Integer>();
		
		num.offer(123);
		System.out.println(num);
		num.offer(345);
		System.out.println(num);
		System.out.println(num.poll());
		num.offer(1234);
		System.out.println(num);
		num.offer(725);
		System.out.println(num);
		//Collections.sort(num); Queue´Â CollectionsÀº ¾ÈµÊ.
		
	}
}
