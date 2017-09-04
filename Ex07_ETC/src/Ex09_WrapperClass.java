import java.util.ArrayList;

//기본타입 : 8개 (값타입) > 객체 형태 > JAVA API > 클래스설계
//기본타입 자료형을  클래서로 만들어서 객체 단위로 처리 가능 하도록

//1.  타입 변환 : Integer.parseInt() 
//2.  parameter로 사용 :ArrayList<int> li = new ArrayList<>();
//2.1 설계 ref type
//3.  내부 상수 (값을 범위)
public class Ex09_WrapperClass {
	public static void main(String[] args) {
		int i = 100;
		Integer n = new Integer(500);
		//내부적으로 값을 : private int value 
		
		System.out.println(n); //값출력
		System.out.println(n.hashCode()); //값출력
		System.out.println(n.MIN_VALUE);
		System.out.println(n.MAX_VALUE);
		
		//활용 (제넉릭 parameter)
		ArrayList<Integer> li = new ArrayList<>();
		li.add(100);
		li.add(200);
		for(int r : li){
			System.out.println(r);
		}

		Integer t = new Integer(500);
		IntegerMethod(t); //주소값
		intMethod(t); //주소값에 있는 값을  
		
		
		//검증
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2 == i3); //다른 주소 > false
		
		//equals override (값)
		//정답
		System.out.println(i2.equals(i3)); // true
		
		
		
		
	}
	static void IntegerMethod(Integer i){
		System.out.println("param : " + i);
	
	}
	static void intMethod(int i){
		System.out.println("int param : " + i);
	}

}
