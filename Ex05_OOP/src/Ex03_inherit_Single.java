class Tv{
	boolean power;
	int ch;
	
	void Power(){
		this.power = !this.power;
	}
	void Chup(){
		ch++;
	}
	void Chdown(){
		ch--;
	}
}
class Vcr{ //���� �÷��̾�
	boolean power;
	int counter = 0;
	
	void Power(){
		this.power = !this.power;
	}
	void Play(){System.out.println("�缺");}
	void Stop(){System.out.println("����");}
	void Rew(){}
	void Ff(){}
}
//vcr ����� ������ Tv ����� �ʹ�
//class Tv , class Vcr 
//��(TvVcr) : Tv , Vcr (������)

//���߻�� : TvVcr extends Tv, Vcr{} (�Ұ�)
//������ ����� ����������

//class TvVcr { Tv t , Vcr v } //has~a
//class TvVcr extends Tv { Vcr v} //is~a , has~a

//Tv ��� (�ٰ� : ������ ���� Ŭ����)
//TvVcr (Tv �� �����µ� Vcr �ؼ�)

class TvVcr extends Tv{
	//Vcr vcr = new Vcr();
	//�и�
	Vcr vcr;
	
	void VConnect(Vcr vcr){
		this.vcr = vcr;
	}
}

public class Ex03_inherit_Single {

	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		Vcr v = new Vcr();
		t.VConnect(v);
		
		
		t.Power();
		System.out.println("���� : " + t.power);
		t.Chup();
		System.out.println("Tvä��: " + t.ch);
		
		//����
		t.vcr.Power();
		System.out.println("�������� : " + t.vcr.power);
		t.vcr.Play();
		t.vcr.Stop();
		t.vcr.Power(); //vcr ��������
		t.Power(); //Tv ��������
		
		System.out.println("TV���� : " + t.power);
		System.out.println("�������� : " + t.vcr.power);
	}

}
