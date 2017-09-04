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
		System.out.println("현재 [0] : " + arraylist.get(0));
		arraylist.add(0,111);
		System.out.println("결과 [0] : " + arraylist.get(0));
		System.out.println(arraylist.toString());
		//데이터 삽입 (add) > 나머지를 뒤로 이동
		//중간에 데이터 추가 , 삭제 작업은 성능고려 
		//순처적인 데이터 추가 , 삭제 성능상 좋다
		
		//처음 (활용 : 함수)
		System.out.println(arraylist.contains(200));
		System.out.println(arraylist.contains(222));
		
		System.out.println(arraylist.isEmpty()); //너 비어 있니 >false 
		arraylist.clear(); //값 size=0
		System.out.println(arraylist.isEmpty()); //너 비어 있니 >true
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.toString());
		
		Object objvalue = arraylist.remove(0);
		System.out.println("objvalue : " + objvalue);
		System.out.println(arraylist.toString());
		
		ArrayList list = new ArrayList();
		list.add("가");
		list.add("나");
		list.add("다");
		list.add("가"); //중복데이터
		System.out.println(list.toString());
		list.remove("가");  //같은 값 처음 값 삭제
		System.out.println(list.toString());
	
		
		//인터페이스도 Type 이다
		//ArrayList implements List ***************
		//List 인터페이스는 ArrayList 부모 타입
		//ArrayList 주소값을 List 인터페이스 타입의 변수가 가질 수 있다
		//단 부모는 부모것만 볼 수 있다 
		
		//ArrayList li = new ArrayList();
		//List list2 = li;
		//interface List { public abstract int size();}
		//List list2 = new ArrayList();
		//System.out.println(list2.size());
	
		//다형성 (추상클래스 , 인터페이스 구현)
		//[인터페이스 명시적인 접근 방법]
		//다형성 (상속 , override)
		//List list = new Vector() ; 
		//list = new ArrayList();
		
		
		//다형성 : 상속관계에서 부모타입의 참조변수가 자식타입 여러객체의 주소 참조가능
		
		//조장 (조원들에게)
		//ArrayList li = new ArrayList();
		//List list2 = li;
		//list2 = new Vector();
		
		List list2 = list.subList(0, 2);
		System.out.println(list2.toString());
		
		//장점 : List 자원만 접근 가능
		//재정의 사용가능 
		//확장성
		
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
		Collections.sort(alist); //독주 .... (오름차순 , 낮은 값부터 )
		System.out.println("after : " + alist.toString());
		//내림차순 (높은값부터)
		Collections.reverse(alist);
		System.out.println("reverse : " + alist.toString());
		//sort 하고 나서 reverse
		
		//sort 나 reverse 쓰지고 제어문으로 오름차순, 내림차순 정렬
		
	}

}
