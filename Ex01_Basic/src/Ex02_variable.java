import javax.sound.midi.Synthesizer;

//���赵 (main �Լ�)
//���α׷��� ������ , �������� ������ �ִ�
//Tip) java > main() , C# > Main()

//�ּ�ó�� (����ó��)
/*  ....  ���ּ� */

/*
������ : ȫ�浿
������ : 2017
���ϸ� : Test.java
ctrl + shift + / �ּ�
ctrl + shift + \ �ּ� Ǯ��

�ڵ� ����(������ , ���� : javac  , java ) ctrl + F11

����(�ǹ��ִ� �ܾ� , �ҹ���)
String _name = ""; MS ������
String name = "";  Java 

��ҹ��� ����
String s = "";
String S = "";

����� , Ű���� ������ �ȵǿ�
String while = "";
*/
class Test{
	public int i; //instance variable 
	              //i ���� memory ������ ����
	              //Test t = new Test();
				  //i ��� ������ [�ʱ�ȭ ���� �ʴ� ����]
		          //�����Ǵ� ��ü���� �ٸ� ���� ���� ���̴�
	
	public void print(){
		int j = 10; //local variable
		System.out.println("instance variable :" + i);
		
	}
	public void write(){
		int j=555; //��밡�� (����)
		System.out.println(j);
	}
}


public class Ex02_variable {
	public static void main(String[] args) {
		int i; //����
		i = 1000; //�ʱ�ȭ (ó�� ���� ���� �ϴ� ��)
		System.out.println(i);
		int j; //The local variable j may not have been initialized
		j= 500;
		System.out.println(j);
		//�Լ� �ȿ� ����� ���� scope: local variable (���� ����)
		//�������� �ݵ�� �ʱⰪ�� ������ �Ѵ�.
		
		int k = 1000; //����� �Ҵ� ���ÿ�
		
	}

}
