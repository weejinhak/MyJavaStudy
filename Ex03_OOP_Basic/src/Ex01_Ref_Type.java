import kr.or.kosta.Person;
import kr.or.kosta.Tv;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		Person p = new Person(); //선언과 할당을 동시에
		p.name = "홍길동"; 
		p.age = 100;
		p.Print();
		
		Person p2; //선언
		p2 = new Person(); //할당  p2가 메모리를 갖게 된다
		
		//값을 비교
		System.out.println(p==p2); //false
		System.out.println("주소값 p : " + p);
		System.out.println("주소값 p2 : " + p2);
		
		Person p3 = p2; //p2 가 가지고 있는 것 주소값
		//p2 , p3 같은 주소(메모리를 가진다)
		System.out.println(p3==p2); //false
		System.out.println("주소값 p2 : " + p2);
		System.out.println("주소값 p3 : " + p3);
		
		//Tv 객체 하나 생성 (채널 변경)
		Tv t = new Tv();
		t.ch_Up();
		t.ch_Up();
		System.out.println("현재 채널 정보 : " + t.ch );
		t.brandname ="samsung";
		System.out.println("브랜드명 : " + t.brandname );
		
		//검증
		//주소값 : 
		System.out.println("t주소값 : " + t);
		System.out.println("t주소값 : " + t.toString());
		//조합 : kr.or.kosta.Tv + "@" + 주소
		
		System.out.println("t hashcode :" + t.hashCode());
		//hashcode 주소값 : 2018699554 
		
		Tv t2 = t;
		System.out.println(t2.hashCode());
		System.out.println(t.hashCode());
		//hashcode 값이 같으면 같은 주소 .....
		
		//설계도 만들고 설계도를 기반으로 집을 짓는 행위(현실)
		//class 만들고 클래스를 기반으로 메모리에 올려서 객체생성
	}

}
