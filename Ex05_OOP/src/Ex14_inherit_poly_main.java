/*
�ó�����
����� ������ǰ ���� �ַ�� ���� ����� �Դϴ�
A��� ������ǰ ������ ���µǸ� ..
Ŭ���̾�Ʈ  �䱸����
������ǰ�� ��������� ��ǰ�� �������� , ��ǰ�� ����Ʈ ������ ������
�� ���� ��ǰ�� ��ǰ�� Ư¡�� ������ �ִ� 
�� ��ǰ�� �̸��� ������(ex :  Tv , Audio , Computer)
�� ��ǰ�� ��ǰ���� �ٸ� ������ ������(Tv : 5000 , Audio : 6000)
��ǰ�� ����Ʈ�� ������ 10%�� ������ 

�ùķ��̼� �ó�����
������ : ��ǰ�� �����ϱ� ���� �ݾ����� , ����Ʈ ������ ������ �ִ�
�����ڴ� ��ǰ�� �����Ҽ� �ִ� ���������� �ϰ� �Ǹ� �ݾ��� �����ϰ�
����Ʈ�� �ö󰣴�
�����ڴ� ó�� �⺻ �ݾ��� ������
 
*/
class Product{
	int price;
	int bonuspoint;
	
	Product(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
	
}
class KtTv extends Product{
	KtTv(){
		super(500);
	}
	@Override
	public String toString(){ //Object ������
		return "KtTv";
	}
}
class Audio extends Product{
	Audio(){
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}
	
}
class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
}

class Buyer{ //������
	int money = 1000;
	int bonuspoint=0;
	
	//��������
	//�������� (������ �������� > �ܾ� , ����Ʈ ����)
	//���� ��ǰ��ü �Լ�parameter 
	
	
	//1��
	//������ ��簡 �ߵǼ� 100���� �ٸ� ��ǰ�� �߰� (POS ���)
	//�߼� ���� ���� > ���� û�ұ� , �ڵ��� ���� �ȵǿ�
	//�Ͽ��� �������� > 100���� �ű� ��ǰ�� �����Ҽ� �ִ� �Լ�
	//�� ����� �־�� �մϴ�
	/*void KtTvBuy(KtTv n){
		if(this.money < n.price){
			System.out.println("���� �ܾ��� �����մϴ�");
			return; //�Լ��� exit 
		}
		//�Ǳ��� ����
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ����:" + n.toString());
	}
	void AudioBuy(Audio n){
		if(this.money < n.price){
			System.out.println("���� �ܾ��� �����մϴ�");
			return; //�Լ��� exit 
		}
		//�Ǳ��� ����
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ����:" + n.toString());
	}
	void NoteBookBuy(NoteBook n){
		if(this.money < n.price){
			System.out.println("���� �ܾ��� �����մϴ�");
			return; //�Լ��� exit 
		}
		//�Ǳ��� ����
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ����:" + n.toString());
	}*/
	
	
	//2�� ���� 
	//100���� ������ 100���� ������ �����ϴ� �Լ��̸��� �� �ٸ���
	//�Լ��� �̸��� �����ϰ� ���ּ��� 
	//overloading ���� (�Լ�)
/*	void Buy(KtTv n){
		if(this.money < n.price){
			System.out.println("���� �ܾ��� �����մϴ�");
			return; //�Լ��� exit 
		}
		//�Ǳ��� ����
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ����:" + n.toString());
	}
	void Buy(Audio n){
		if(this.money < n.price){
			System.out.println("���� �ܾ��� �����մϴ�");
			return; //�Լ��� exit 
		}
		//�Ǳ��� ����
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ����:" + n.toString());
	}
	void Buy(NoteBook n){
		if(this.money < n.price){
			System.out.println("���� �ܾ��� �����մϴ�");
			return; //�Լ��� exit 
		}
		//�Ǳ��� ����
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ����:" + n.toString());
	}*/
	
	//3�� ����
	//������ �ƹ��� �߰��Ǿ ���������� �̷������ �Ѵ�
	//Why : ��ſ� �ް��� ���ؼ�
	//*�ݺ����� �ڵ带 ���� 
	//*�ϳ��� �Լ��� ���� ���� ó��
	//�������� : ��� ��ǰ�� Product ����ϰ� �ִٸ�
	//Product ��� ��ü �θ�Ÿ��
    // �ϳ��� [��������]�� [�������� Ÿ��]�� ���� �� �ִ� 
	//**���ǻ��� : �θ�Ÿ������ ���� �ϴ��� �ڽ� ������ �� �ڿ��� 
	//�ִٸ� ������ �ڿ��� ȣ�� (super)
	
	//** 
	void Buy(Product n){ //������
		if(this.money < n.price){
			System.out.println("���� �ܾ��� �����մϴ�");
			return; //�Լ��� exit 
		}
		//�Ǳ��� ����
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ����:" + n.toString());
	}
	
}

public class Ex14_inherit_poly_main {

	public static void main(String[] args) {
		
		NoteBook notebook = new NoteBook();
		Audio audio = new Audio();
		KtTv kttv = new KtTv();
		
		/*
		1�� TEST
		Buyer buyer = new Buyer();
		buyer.NoteBookBuy(notebook);//��Ʈ�� ����
		buyer.KtTvBuy(kttv);
		buyer.KtTvBuy(kttv);
		*/
		Buyer buyer = new Buyer();
		buyer.Buy(notebook);//��Ʈ�� ����
		buyer.Buy(kttv);
		buyer.Buy(kttv);
	}

}
