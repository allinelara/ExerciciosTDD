package Pilha;

import java.util.Stack;

public class Pilha {
	
	public static Stack<Integer> stack = new Stack<Integer>();


	public static Integer[] adicionar(int i) {
		stack.push(i);
		stack.push(3);
		stack.push(6);
		return stack.toArray(new Integer[stack.size()]);
	}


	public static int remover() {
		stack.push(16);
		stack.push(3);
		stack.push(6);
		int elemento = stack.peek();
		stack.pop();
		return elemento;
	}


	public static int totalelementos() {
		stack.push(16);
		stack.push(3);
		stack.push(6);
		return stack.size();
	}


}
