
class StaticClass{
	int iv;
	static int cv;
	
	//�Ϲ��Լ�
	void m(){
		//static �ڿ��� ��ü ���� ���� memory 
		//�Ϲ��Լ��� static �ڿ����� ���� �����
		cv = 1000;
		System.out.println("static cv : " + cv);
	}
	static void sm(){
		//�Ϲ��ڿ� 
		//iv ������ ��� ������
		//�Ϲ��ڿ� ���� �Ұ� (memory ����)
		//iv = 100; �����ϵ� �ȵǿ�
		System.out.println("static cv�� : " + cv);
		
		//�������� ��ƶ� (static )
	}
}

public class Ex08_Static_Method {

	public static void main(String[] args) {
		System.out.println(StaticClass.cv);
		StaticClass sc = new StaticClass();
		sc.m();
		System.out.println(StaticClass.cv);
	}

}
