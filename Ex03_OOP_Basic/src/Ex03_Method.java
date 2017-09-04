import kr.or.kosta.FClass;
import kr.or.kosta.Tv;

public class Ex03_Method {
	public static void main(String[] args) {
		FClass f = new FClass();
		f.m(); //호출  { 코드 실행 }
		f.m2(1000);
		int result = f.m3();
		System.out.println("m3 함수 : " + result);
		
		int result2 = f.m4(10);
		System.out.println("m4 함수 : " + result2);
		
		int result3 = f.sum(10,50);
		System.out.println("sum 함수 : " + result3);
	
		int result4 = f.max(-10, 10);
		System.out.println("max 값 : " + result4);
		
		String result5 = f.concat("A", "B", "C");
		System.out.println(result5);
		
		Tv tv = f.ObjMethod();
		System.out.println(tv.brandname);
		
		f.ObjMethod2(tv);
		
		
	}

}
