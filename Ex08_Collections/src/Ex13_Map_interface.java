import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//Map �������̽�
//Map(Ű,��) �ֹ迭
//ex) ������ȣ : 02-���� , ....
//Ű(�ߺ�(x)) ��(�ߺ�(0))

//�����ϴ� Ŭ����
//HashTable(��) : ����ȭ ����
//HashMap(��) : ����ȭ ����(x) , ���ɰ��  , ����ȭ �Ҽ� �� �ִ�
//����ȭ (Thread ���� ...: �����ڿ�)
//Generic ����

//1. ArrayList , 2. HashMap  , 3. HashSet(TreeSet)
//      60%            30%            10%

//HashMap 
//Entry[] table;
//Entry { Object key; Object value; }
public class Ex13_Map_interface {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Tiger", "1004");
		map.put("scott", "1004");
		map.put("superman", "1004");
		
	
		//�Լ�
		System.out.println(map.containsKey("tiger")); //��ҹ��� ���� (false)
		System.out.println(map.containsKey("scott"));
		System.out.println(map.containsValue("1004"));
		
		//(key , value) pair(�ֹ迭)
		System.out.println(map.get("Tiger"));
		System.out.println(map.get("kglim")); //Ű ����(x) null return
		
		map.put("Tiger",1007); //value overwrite
		System.out.println(map.get("Tiger"));
		
		Object returnvalue =  map.remove("scott");
		System.out.println(returnvalue);
		System.out.println(map.size());
		System.out.println(map.toString()); //Object toString ������
		
		//Map key ���� ����
		Set keyset = map.keySet(); //key �ߺ�(x) , ����(x)
		Iterator it = keyset.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		Collection vlist = map.values();
		System.out.println(vlist.toString());
		
		
		//key point
		//HashMap 
		//Entry[] table;
		//Entry { Object key; Object value; }
	 	Set set = map.entrySet(); //�ϳ��� ��� ("king=1007")
	 	Iterator it2 = set.iterator();
	 	while(it2.hasNext()){
	 		System.out.println(it2.next());
	 	}

	 	
	 	
	 	
	}

}
