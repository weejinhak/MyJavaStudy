
public class Ex09_Static_Method {
	public void method(){
		System.out.println("나 일반함수");
	}
	public static void smethod(){
		System.out.println("나 static 자원");
	}
	public static void main(String[] args) {
		
		//Ex09_Static_Method ex = new Ex09_Static_Method();
		//ex.method();
		
		Ex09_Static_Method.smethod();
		
		smethod();
	}

}
