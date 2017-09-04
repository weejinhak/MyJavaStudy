//String 클래스다
//이 수업을 듣고 나서 기억에서 지우세요
//String 사용은 (int, float 동일하게 사용)

//String str = "홍길동"


//1.String 클래스 : 데이터 저장 구조 char[] 배열저장
//2.String ename = "김유신" > [김][유][신] > 배열
//3.String s = new String("ABCD");
public class Ex05_String {

	public static void main(String[] args) {
		String str ="ABCD";
		System.out.println(str.length()); //데이터를 배열관리
		
		String str1 = "AAA";
		String str2 = "AAA";
		System.out.println(str1 + "/" + str2);
		System.out.println(str1 == str2); //주소값(true)
		
		//point
		//값 으로 equals()
		System.out.println(str1.equals(str2)); //
		
		//그러면 같은 문자열이면서 다른 주소를 같게
		//String new 사용 (새로운 메모리)
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		System.out.println(str3 + " / " + str4);
		System.out.println(str3 == str4); //false
		System.out.println(str3.equals(str4)); 
		
		//String 핵심 (문자열 다루는 함수)
		String t = "서울시 강남구";
		//String 클래스 (함수를 가지고 있다)
		//Test t = new Test();
		//t.함수

	}

}
