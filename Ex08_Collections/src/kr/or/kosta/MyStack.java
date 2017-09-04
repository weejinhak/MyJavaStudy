package kr.or.kosta;

//Stack �ڷ� ������ ���� �����ؼ� ����� ���� 
//Line ����
public class MyStack {
	
	private int top;
	private int maxSize;
	private Object[] stackArr;
 
	public MyStack(int maxSize){ // stack ����� �Է¹޾� ����
	        this.maxSize = maxSize;
	        stackArr = new Object[maxSize];
	        top = -1;
	    }
 
	public boolean empty() { // ������ ������� Ȯ��
		return (top == -1);
	}
 
	public boolean full() { //
		return (top == maxSize - 1);
	}
 
	public void push(Object i) {
		if (full()) {
			System.out.println("������ ������");
		} else {
			stackArr[++top] = i;
		}
	}
 
	public Object pop() {
 
		if (empty()) {
			System.out.println("������ �������");
			return null;
		} else {
			Object outPut = stackArr[top];
			top--;
			return outPut;
		}
	}
}
