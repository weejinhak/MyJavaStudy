//���� <-> ���
//��� : �ѹ� ���� �������� ���� �Ұ�
//PI , ������, �ý��� ȯ�溯�� 
//��� : ���������� �빮�� 

//java : final int NUM=100;
//c#   : const int NUM=100;

//final Ű����
//Ŭ���� �տ� : final class TT{} : ��Ӿ��� Ŭ����
//�Լ� �տ� : final method() : ��Ӱ��迡�� ������ ����


//��� (final)
class Vcard{
	final String KIND="heart"; //���
	final int NUM=100;
	public void method(){
		System.out.println(Math.PI);//�ý��� ���
	}
}
//���� : Vcard Ÿ������ ��� ��ü KIND , NUM
//��ü���� �ٸ� ������� ���� �� ������
class Vcard2{
	final String KIND;
	final int NUM;
	//��ü���� �ٸ� ������� ���强 �ڵ�
	
	//Vcard2(){
	//	this.KIND = "";
	//	this.NUM = 0;
	//}
	//����� �ʱ�ȭ ��ü���� �ٸ�
	
	//Vcard2(){ }
	Vcard2(String kind , int num){
		this.KIND = kind;
		this.NUM = num;
	}
	//�������� �ǵ� �ľ� 
}
public class Ex07_final {
	public static void main(String[] args) {
		Vcard v = new Vcard();
		//v.KIND = "aaa";
	
		Vcard2 v2 = new Vcard2("A", 10);
		Vcard2 v3 = new Vcard2("B", 20);
		Vcard2 v4 = new Vcard2("C", 30);
		
		//v2.KIND = "D";

	}

}
