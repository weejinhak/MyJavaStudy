import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//Map 인터페이스
//Map(키,값) 쌍배열
//ex) 지역번호 : 02-서울 , ....
//키(중복(x)) 값(중복(0))

//구현하는 클래스
//HashTable(구) : 동기화 보장
//HashMap(신) : 동기화 보장(x) , 성능고려  , 동기화 할수 도 있다
//동기화 (Thread 에서 ...: 공유자원)
//Generic 지원

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
		
	
		//함수
		System.out.println(map.containsKey("tiger")); //대소문자 구별 (false)
		System.out.println(map.containsKey("scott"));
		System.out.println(map.containsValue("1004"));
		
		//(key , value) pair(쌍배열)
		System.out.println(map.get("Tiger"));
		System.out.println(map.get("kglim")); //키 존재(x) null return
		
		map.put("Tiger",1007); //value overwrite
		System.out.println(map.get("Tiger"));
		
		Object returnvalue =  map.remove("scott");
		System.out.println(returnvalue);
		System.out.println(map.size());
		System.out.println(map.toString()); //Object toString 재정의
		
		//Map key 집합 추출
		Set keyset = map.keySet(); //key 중복(x) , 순서(x)
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
	 	Set set = map.entrySet(); //하나로 묶어서 ("king=1007")
	 	Iterator it2 = set.iterator();
	 	while(it2.hasNext()){
	 		System.out.println(it2.next());
	 	}

	 	
	 	
	 	
	}

}
