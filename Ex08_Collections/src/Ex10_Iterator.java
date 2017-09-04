import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Collection Framework
//표준화(약속)
//순차적인 데이터 read , remove 표준을 만들자
//Iterator (약속)
//Enumeration (구버전)
//Iterator(신버전) : 순방향 (boolean hasNext() , Object Next() , Remove())
//ArrayList 구현 (List , Collection 구현)
//ListIterator (신버전) > 순방향 + 역방향
public class Ex10_Iterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i));
		}
		//표준화된 인터페이스 통한 출력
		//Iterator 인터페이스
		//Collection { public Iterator iterator(); }
		//ArrayList iterator() 구현
		
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
		
		//역방향
		//for문 (600,500,400)
		for(int i = intlist.size() -1 ; i >= 0 ; i--){
			System.out.println(intlist.get(i));
		}

		//순방향 , 역방향 ListIterator
		ListIterator<Integer> init3 = intlist.listIterator();
		while(init3.hasNext()){
			System.out.println(init3.next());
		}
		while(init3.hasPrevious()){
			System.out.println("[" + init3.previous() + "]");
		}
	}

}







