/*
 * �䱸���� 
 * ��ٱ��� (Cart)
 * ��ٱ��� (���忡 �ִ� ��� ������ǰ�� ���� �� �ִ�)
 * ��ٱ��� ũ�Ⱑ �����Ǿ� �ִ�(10��)
 * 
 * 
 * ���� (summary()) ���
 * ����� ������ ���� : ���� ����
 * �Ѵ����ݾ� : �ѱ��űݾ�
 * 
 * hint) īƮ ���� ��� ������ (Buy())
 * hint) summary() �Լ� ȣ��Ǹ� 
 */

class Product2{
	int price;
	int bonuspoint;
	
	Product2(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
	
}
class KtTv2 extends Product2{
	KtTv2(){
		super(500);
	}
	@Override
	public String toString(){ //Object ������
		return "KtTv";
	}
}
class Audio2 extends Product2{
	Audio2(){
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}
	
}
class NoteBook2 extends Product2{
	NoteBook2(){
		super(150);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
}

class Buyer2{ //������
	int money = 0;
	int bonuspoint=0;
	//��ٱ��� ���� (������) ***********
	Product2[] Cart = new Product2[10]; 
	int index=0;
	///////////////////////////////////
	Buyer2(){
		this(10000,0);
	}
	Buyer2(int money , int bonuspoint){
		this.money = money;
		this.bonuspoint = bonuspoint;
	}
	
	
	void Buy(Product2 product){
		//īƮ�� ��� �� (���� �ڵ� ����)
		if(this.money < product.price){
			System.out.println(" [ ���� �ܾ��� �����մϴ� ]");
			return; //�Լ��� ����
		}
		if(this.index >= 10){
			System.out.println("[ ���� �� ���� ��̾�� ]");
			return;
		}
		//��ٱ��� ���
		//����ó�� : if ���ؼ� �迭 ���� üũ
		Cart[index++] = product; //++index ������ (1����)
		////////////////////////////////////////////////
		this.money -= product.price;
		this.bonuspoint += product.bonuspoint;
		System.out.println("[������ ���� :" + product.toString() + "]");
		System.out.println("[���� �ܾ� :" + this.money + "]");
		System.out.println("[���� ����Ʈ :" + this.bonuspoint + "]");
		
	}
	//���� (��ٱ���)
	//��ٱ��Ͽ� ��� ������ ���
	//������ �Ѿ�
	//������ ���  ���
	
	void Summary(){
		//ȭ�����
				//������ ��ǰ�� �ѱݾ� 
				//�� ����Ʈ
				//������ ������ ���
				int totalprice = 0;
				int totalbonuspoint = 0;
				String productList = "";
				for(int i=0 ; i < index ;i++){
				//for(int i=0 ; i < Cart.length ;i++){
				//	if(Cart[i] == null) break;
					totalprice += Cart[i].price;
					totalbonuspoint += Cart[i].bonuspoint;
					productList += Cart[i].toString() + "  ";
				}
				System.out.println("**************************************");
				System.out.println("������ ���� �Ѿ� : " + totalprice);
				System.out.println("����Ʈ �Ѿ� : " + totalbonuspoint);
				System.out.println("������ ���� ��� : " + productList + "");
				System.out.println("*************************************");
	}
}	
	
public class Ex15_inherit_poly_Array {

	public static void main(String[] args) {
		NoteBook2 notebook = new NoteBook2();
		Audio2 audio = new Audio2();
		KtTv2 kttv = new KtTv2();
		
		/*
		Buyer2 buyer = new Buyer2(10000,0);
		//����
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		
		buyer.Summary();
		*/
		Buyer2 buyer = new Buyer2(1000,0);
		//����
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		buyer.Buy(notebook);
		
		buyer.Summary();
	}

}
