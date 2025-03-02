package dsa;

import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack<String> stack  = new Stack<String>();
		
		//this is push method
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		
		
		
		//stack.pop(); this is pop method
		
		String fav = stack.pop();
		
		System.out.println(stack);
		System.out.println(fav);
		
		//to check the top most element we use peek method
		System.out.println(stack.peek());
		
		//to search we use search method
		System.out.println(stack.search("c "));
	}
}
