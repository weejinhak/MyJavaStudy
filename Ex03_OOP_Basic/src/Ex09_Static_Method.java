
public class Ex09_Static_Method {
	public void method(){
		System.out.println("�� �Ϲ��Լ�");
	}
	public static void smethod(){
		System.out.println("�� static �ڿ�");
	}
	public static void main(String[] args) {
		
		//Ex09_Static_Method ex = new Ex09_Static_Method();
		//ex.method();
		
		Ex09_Static_Method.smethod();
		
		smethod();
	}

}
