import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex12_HashSet_TreeSet {

	public static void main(String[] args) {
		//중복(x) , 순서(x)
		HashSet<String> hs = new HashSet<>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		System.out.println(hs.toString());
		
		//HashSet 확장 > LinkedHashSet (순서유지)
		Set<String> hs2 = new LinkedHashSet<>();
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("D");
		System.out.println(hs2.toString());

		//TreeSet (자료구조)
		//이진트리 (검색)
		//중복(x) , 순서(x) , 정렬(0)
		//트리형태로 정렬이 되고 많은 양의 데이터를 저장하는데 효율적
		//검색속도가 빠르다
		//중복 , 정렬 (TreeSet)
		Set<String> hs3 = new TreeSet<>();
		hs3.add("B");
		hs3.add("A");
		hs3.add("F");
		hs3.add("K");
		hs3.add("G");
		hs3.add("D");
		
		System.out.println(hs3.toString());
		
		//TreeSet 로또 만드세요
		Set<Integer> lotto = new TreeSet<>();
		for(int i=0; lotto.size() < 6 ; i++){
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println(lotto.toString());
	}

}
