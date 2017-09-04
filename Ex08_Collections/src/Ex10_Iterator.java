import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Collection Framework
//ǥ��ȭ(���)
//�������� ������ read , remove ǥ���� ������
//Iterator (���)
//Enumeration (������)
//Iterator(�Ź���) : ������ (boolean hasNext() , Object Next() , Remove())
//ArrayList ���� (List , Collection ����)
//ListIterator (�Ź���) > ������ + ������
public class Ex10_Iterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i));
		}
		//ǥ��ȭ�� �������̽� ���� ���
		//Iterator �������̽�
		//Collection { public Iterator iterator(); }
		//ArrayList iterator() ����
		
		Iterator it= list.iterator();
		while(it.hasNext()){
			System.out.println("[" + it.next() + "]");
		}
		
		ArrayList<Integer> intlist = new ArrayList<>();
		intlist.add(400);
		intlist.add(500);
		intlist.add(600);
		
		//Iterator
		Iterator<Integer> list2 = intlist.iterator();
		while(list2.hasNext()){
			System.out.println(list2.next());
		}
		
		//������
		//for�� (600,500,400)
		for(int i = intlist.size() -1 ; i >= 0 ; i--){
			System.out.println(intlist.get(i));
		}

		//������ , ������ ListIterator
		ListIterator<Integer> init3 = intlist.listIterator();
		while(init3.hasNext()){
			System.out.println(init3.next());
		}
		while(init3.hasPrevious()){
			System.out.println("[" + init3.previous() + "]");
		}
	}

}







