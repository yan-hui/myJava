package hch.lone.wolf.base.data;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @Description 栈测试
 * @Author hechunhui
 * @CreatedBy 2018/11/26 10:40
 */
public class StackTest {
	public static void showpush(Stack<Integer> st, int a) {
		st.push(a);
		System.out.println("push(" + a + ")");
		System.out.println("stack: " + st);
	}
	public static void showpop(Stack<Integer> st){
		System.out.print("pop -> ");
		//删除栈顶，并返回该对象
		Integer pop = st.pop();
		//查看栈顶元素而不删除
		//Integer pop = st.peek();
		System.out.println(pop);
		System.out.println("stack: "+st);
	}


	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		System.out.println("stack: "+stack);
		showpush(stack,12);
		showpush(stack,22);
		showpush(stack,32);
		showpop(stack);
		showpop(stack);
		showpop(stack);
		try {

			showpop(stack);
		}catch (EmptyStackException e){
			System.out.println("empty stack");
			System.exit(0);
		}

	}
}
