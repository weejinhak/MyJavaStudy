import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//Set �������̽� ���� Ŭ����
//�ߺ�(x) , ����(x)
public class Ex11_HashSet {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(100);
		hs.add(55);
		System.out.println(hs.toString());
		//�ߺ� ������ (x)
		boolean bo = hs.add(1);
		System.out.println("bo : " + bo);
		System.out.println(hs.toString());
		
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("Z"); 
		System.out.println(hs2); //�ִ� ������ ����� ���� JDK8 ���
	
		//1.�ߺ� ������� �ʾƿ�
		String[] obj ={"A","B","A","C","D","B"};
		HashSet<String> hs3 = new HashSet<>();
		for(int i = 0 ; i < obj.length ; i++){
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString());
		
		//������
		Set set = new HashSet();
		System.out.println(set.size());
		
		//Quiz : (Hashset �� ����ؼ� 1~45���� ���� 6���� ��������
		//�� �ߺ����� �ȵǿ�
		int index =0;
		for(int i = 0 ; set.size() < 6 ; i++){
			System.out.println(++index);
			int num = (int)(Math.random()*45) + 1;
			set.add(num); //size ���� ���� (add true)
		}
		System.out.println("for Ƚ�� : " + index);
		System.out.println("�ߺ��� ���� : " + set.toString());
		
		
		HashSet<String> set3 = new HashSet<>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFFF");
		
		Iterator<String> it = set3.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(set3.toString());
		
		//Collections.sort(list);
		//Collections.sort(); �迭 [0][1][2][3]
		//Set Ÿ��
		List list = new ArrayList(set3);
		System.out.println("before : " + list);
		Collections.sort(list);
		System.out.println("after : " + list);
		
		
		
		
		
	}

}
