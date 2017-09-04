
class Variables{
	int iv; //member field , instance variable
	        //���� :��ü���� �ٸ� ���� ���� ���ؼ�
		    //�ʱ�ȭ �ص� �ǰ� , ���ϸ� default �� : ���� 0
	
	static int cv; 
	//class variable , static variable (�����ڿ�)
	// [��ü�� �����ڿ�]
	//�������� (memory ���� ����) : ���α׷��� ����ɶ� 
	//                           : ��ü ���� ������ 
	//����� Ŭ���� ���� �ε� �Ҷ� (method(class) area) ������ �ö󰣴�
	//���ٹ�� : class�̸�.static�ڿ�
	//          ��������.static�ڿ�

	void method(){
		int lv=0; //local variable
		          //����ϱ� ���ؼ� �ݵ�� �ʱ�ȭ
		          //�Լ� ȣ�� ����
		          //�Լ� ������ �Ҹ�
	}
	
	static void smethod(){
		System.out.println("�� static �̾�");
	}
}
public class Ex05_Variable_Scope {
	public static void main(String[] args) {
		//System.out.println(Variables.cv);
		
		//Variables v = new Variables();
		//v.iv = 100;
		//Variables v2 = new Variables();
		//System.out.println("iv :" + v2.iv);

		Variables.smethod();
		
		Variables v = new Variables();
		v.cv = 100;
		Variables v2 = new Variables();
		System.out.println("��ü�� ����:" + v2.cv);
		System.out.println("Ŭ���� ����: " + Variables.cv);
		 
		
	}

}
