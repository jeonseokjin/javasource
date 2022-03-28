package collection;

import java.util.Stack;

/*
 * Stack
 * 마지막에 저장한 데이터를 가장 먼저 꺼냄 => LIFO(Last In First Out)
 * 
 * push() : 삽입
 * pop() : 인출
 * 
 * Queue : 처음에 저장한 데이터를 가장 먼저 꺼냄 => FIFO(First In First Out)
 * offer() : 삽입
 * poll(): 인출
 * 
 * 
 */
public class StackEx1 {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
