import kr.or.kosta.FClass;
import kr.or.kosta.Tv;

public class Ex03_Method {
	public static void main(String[] args) {
		FClass f = new FClass();
		f.m(); //ȣ��  { �ڵ� ���� }
		f.m2(1000);
		int result = f.m3();
		System.out.println("m3 �Լ� : " + result);
		
		int result2 = f.m4(10);
		System.out.println("m4 �Լ� : " + result2);
		
		int result3 = f.sum(10,50);
		System.out.println("sum �Լ� : " + result3);
	
		int result4 = f.max(-10, 10);
		System.out.println("max �� : " + result4);
		
		String result5 = f.concat("A", "B", "C");
		System.out.println(result5);
		
		Tv tv = f.ObjMethod();
		System.out.println(tv.brandname);
		
		f.ObjMethod2(tv);
		
		
	}

}
