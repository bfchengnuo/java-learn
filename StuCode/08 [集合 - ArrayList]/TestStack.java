import java.util.*;
//����Vector������  ջ (LIFO = Last In First Out = ����ȳ�)
public class TestStack{
	public static void main(String[] args){
		Stack<Integer> stk = new Stack<>();
		stk.push(111);
		stk.push(333);
		stk.push(555);
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
	}
}