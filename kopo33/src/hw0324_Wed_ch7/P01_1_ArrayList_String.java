package hw0324_Wed_ch7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class P01_1_ArrayList_String {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("kim");
		name.add("lee");
		name.add("john");
		name.add("kim");
		
		for (int i = 0; i < name.size(); i++) {
			System.out.print(name.get(i) + " "); //배열 안에 인자들 하나씩 출력
			
		}
		System.out.println();
		
		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.get(2));

		name.remove(1);
		System.out.println(name);
		
		name.set(1, "park");
		System.out.println(name);
		System.out.println(name.size());
		
		name.add("lee");
		System.out.println(name);
		
		Collections.sort(name);
		System.out.println(name);
		
		Collections.reverse(name);
		System.out.println(name);
		
		System.out.println(name.get(1));
		
		
		
	}

}
