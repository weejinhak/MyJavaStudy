//String Ŭ������
//�� ������ ��� ���� ��￡�� ���켼��
//String ����� (int, float �����ϰ� ���)

//String str = "ȫ�浿"


//1.String Ŭ���� : ������ ���� ���� char[] �迭����
//2.String ename = "������" > [��][��][��] > �迭
//3.String s = new String("ABCD");
public class Ex05_String {

	public static void main(String[] args) {
		String str ="ABCD";
		System.out.println(str.length()); //�����͸� �迭����
		
		String str1 = "AAA";
		String str2 = "AAA";
		System.out.println(str1 + "/" + str2);
		System.out.println(str1 == str2); //�ּҰ�(true)
		
		//point
		//�� ���� equals()
		System.out.println(str1.equals(str2)); //
		
		//�׷��� ���� ���ڿ��̸鼭 �ٸ� �ּҸ� ����
		//String new ��� (���ο� �޸�)
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		System.out.println(str3 + " / " + str4);
		System.out.println(str3 == str4); //false
		System.out.println(str3.equals(str4)); 
		
		//String �ٽ� (���ڿ� �ٷ�� �Լ�)
		String t = "����� ������";
		//String Ŭ���� (�Լ��� ������ �ִ�)
		//Test t = new Test();
		//t.�Լ�

	}

}
