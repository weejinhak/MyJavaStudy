package kr.or.kosta;

//�䱸����
//ī�� 53���� ����� �ּ���
//�� ī��� ���� , ��� ���� �ٸ��� 
//h , w ��� ī�尡 ���� ���� ������
//��û�� ����� �� �־�� �մϴ�
public class Card {
	public int number;
	public String kind;
	
	public static int h = 10;
	public static int w = 20;
	
	//ī�� ���� ���
	public void cardInfor(){
		System.out.printf("��ȣ:%d,���:%s,h:%d,w:%d\n",
				         number,kind,h,w);
		
	}
}
