package demo;

import java.util.Stack;

public class StringReverse {

	public static void main(String[] args) {
		
		String word = "Bridge Labz";
		reverseword(word);
		
	}

	public static void reverseword(String word) {
		
		Stack<Character> st = new Stack<Character>();
		char ch[] = word.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(word.charAt(i) != ' ') {
				st.push(word.charAt(i));
			}
			else {
				while(!st.empty()) {
				System.out.print(st.pop());
				}
				System.out.print(" ");
			}

		}
			while (!st.empty()) {
				System.out.print(st.pop());
			}
			
	}
}
