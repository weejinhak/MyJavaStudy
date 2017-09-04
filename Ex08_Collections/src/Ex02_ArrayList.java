import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

//Key point (ArrayList)
public class Ex02_ArrayList {
	public static void main(String[] args) {
		
		ArrayList arraylist = new ArrayList();
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		System.out.println(arraylist.toString());
		for(int i = 0 ;i < arraylist.size() ; i++){
			System.out.println(arraylist.get(i));
		}
		System.out.println("���� [0] : " + arraylist.get(0));
		arraylist.add(0,111);
		System.out.println("��� [0] : " + arraylist.get(0));
		System.out.println(arraylist.toString());
		//������ ���� (add) > �������� �ڷ� �̵�
		//�߰��� ������ �߰� , ���� �۾��� ���ɰ�� 
		//��ó���� ������ �߰� , ���� ���ɻ� ����
		
		//ó�� (Ȱ�� : �Լ�)
		System.out.println(arraylist.contains(200));
		System.out.println(arraylist.contains(222));
		
		System.out.println(arraylist.isEmpty()); //�� ��� �ִ� >false 
		arraylist.clear(); //�� size=0
		System.out.println(arraylist.isEmpty()); //�� ��� �ִ� >true
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.toString());
		
		Object objvalue = arraylist.remove(0);
		System.out.println("objvalue : " + objvalue);
		System.out.println(arraylist.toString());
		
		ArrayList list = new ArrayList();
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��"); //�ߺ�������
		System.out.println(list.toString());
		list.remove("��");  //���� �� ó�� �� ����
		System.out.println(list.toString());
	
		
		//�������̽��� Type �̴�
		//ArrayList implements List ***************
		//List �������̽��� ArrayList �θ� Ÿ��
		//ArrayList �ּҰ��� List �������̽� Ÿ���� ������ ���� �� �ִ�
		//�� �θ�� �θ�͸� �� �� �ִ� 
		
		//ArrayList li = new ArrayList();
		//List list2 = li;
		//interface List { public abstract int size();}
		//List list2 = new ArrayList();
		//System.out.println(list2.size());
	
		//������ (�߻�Ŭ���� , �������̽� ����)
		//[�������̽� ������� ���� ���]
		//������ (��� , override)
		//List list = new Vector() ; 
		//list = new ArrayList();
		
		
		//������ : ��Ӱ��迡�� �θ�Ÿ���� ���������� �ڽ�Ÿ�� ������ü�� �ּ� ��������
		
		//���� (�����鿡��)
		//ArrayList li = new ArrayList();
		//List list2 = li;
		//list2 = new Vector();
		
		List list2 = list.subList(0, 2);
		System.out.println(list2.toString());
		
		//���� : List �ڿ��� ���� ����
		//������ ��밡�� 
		//Ȯ�强
		
		list2.add(333);
		list2.add(444);
		System.out.println(list2.toString());
		
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(10);
		alist.add(8);
		alist.add(45);
		System.out.println("before : " + alist.toString());
		Collections.sort(alist); //���� .... (�������� , ���� ������ )
		System.out.println("after : " + alist.toString());
		//�������� (����������)
		Collections.reverse(alist);
		System.out.println("reverse : " + alist.toString());
		//sort �ϰ� ���� reverse
		
		//sort �� reverse ������ ������� ��������, �������� ����
		
	}

}
