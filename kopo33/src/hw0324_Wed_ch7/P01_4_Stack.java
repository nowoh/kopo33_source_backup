package hw0324_Wed_ch7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class P01_4_Stack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); //stack이라는 stack 선언
		
		stack.add("kim");
		System.out.println(stack);
		stack.add("lee");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println();
		
		Stack<Integer> num = new Stack<Integer>(); //num이라는 stack 선언
		
		num.add(123);
		System.out.println(num);
		num.add(345);
		System.out.println(num);
		
		Collections.reverse(num);
		System.out.println(num);
		
		System.out.println(num.pop());
		System.out.println(num);
		
	}
}
