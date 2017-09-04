package kr.or.kosta;
//������ ����
//�̱��� ���� 

//�ϳ��� ��ü�� �����ؼ� [���� static]�ϰ� �ʹٸ�

//1.�������� ��ü�� �����ϴ��� �ϳ��� �ּ� ���� (new ������(x))
//2.�ϳ��� ��ü�� ���� ���
//3.�ᱹ ��ü�ϳ��� ������
//4.�������� ��ü �ϳ��� �����ϸ� �Ǵϱ�
//5.�� ���� �ּ�

//�ǻ�Ȱ
//ȸ�� �����ͱ� (����) PC�����

public class Singleton {
	private static Singleton p = new Singleton(); //Ŭ���� �ȿ��� private �ǹ� �����
	//��������.p > ��ü�������� static 		
	private Singleton(){}
	
	public static Singleton getInstance(){
		//return p;
		if(p==null){
			p = new Singleton();
		}
		return p;
	}
}








