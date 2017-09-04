/*
 클래스 == 설계도 == 타입 

 *클래스는 타입(Type)입니다******** 
 
*/

class Apt{
	int door=10;
	int window=2;
	
}
//기본적으로 메모리에 올려야 사용 가능
public class Ex04_Ref_Type {
	public static void main(String[] args) {
		Apt ssang = new Apt();
		//Apt 타입
		//ssang 변수(참조변수)
		System.out.println(ssang); 
		//Apt@15db9742
		//Apt 타입 + @ 문자 + 주소 > 조합
		
		Apt sam = new Apt();
		System.out.println(sam);
		
		Apt apt = sam; //참조타입 할당
		System.out.println(apt == sam); // == 같니
		System.out.println(apt == ssang);

		apt.door = 100;
		System.out.println("sam.door : " + sam.door);
		
		
		//참조 타입의 할당은 주소값 할당이다
		
		int num =1000;
		System.out.println(num);
		int num2 = num;
		System.out.println(num2);
		num2 = 5000;
		//이때 num 변수의 값은 변화가 있습니까 (값 할당)
		
		
	}

}
