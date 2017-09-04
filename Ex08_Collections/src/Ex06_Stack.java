import java.util.Stack;

import kr.or.kosta.MyStack;

public class Ex06_Stack {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push("A");
		st.push("B");
		System.out.println(st.pop());
		System.out.println(st.pop());
		//System.out.println(st.pop());
		
		
		MyStack my = new MyStack(5);
		my.push(100);
		my.push(200);
		my.push(300);
		my.push(400);
		my.push(500);
		//my.push(600);
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		
	}

}
