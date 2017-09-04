import java.util.Scanner;

public class Ex08_Print_format {
	public static void main(String[] args) {
		//C# (MS)
		//Console.WriteLine()
		//Console.Write()
		//Console.ReadLine()
		
		//Cmd 창 출력
		System.out.println("A");//ln(줄바꿈)\
		System.out.print("B");
		System.out.print("C");
		System.out.println();
		System.out.print("이름 입력:");
		
		int num=100;
		System.out.printf("현재 num 값은 %d 입니다",num);
		//format 형식 문자
		//%d (10진수 형식 정수 출력)
		//%f (10진수 형식 실수 출력)
		//%s (문자열 출력)
		//%c (한문자 출력)
		int age = 400;
		String name ="홍길동";
		//printf() 사용해서 
		//홍길동의 나이는 400살 입니다 출력하세요
		System.out.printf("\n%s의 나이\t는 %d살 입니다\n",name,age);
	
		float f = 3.14f;
		System.out.println(f);
		
		System.out.printf("f값은 %f 입니다",f);
		
		//Cmd 창에 값 읽어오기
		System.out.println();
		//Ctrl + shift + O //import 구문 자동 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		//int result = sc.nextInt();
		//System.out.println(result);
		
		//sc.nextLine(); console 에 입력한 값을 타입을 구분하지
	    //않고 문자열로 ....
		//Today Key point 
		//문자를 -> 숫자로 (일상다반사)  > 타입클래스.parseInt()
		int result = Integer.parseInt(sc.nextLine());
		//Float.parseFloat(s)
		//Double.parseDouble(s)
		
		System.out.println(result);
		
		System.out.print("당신의 이름은:");
		String youname = sc.nextLine();
		System.out.println(youname);
		
		//Quiz
		//숫자를  문자로 바꾸는 것은 : String.valueof()
		//숫자형[문자] -> [숫자]  > "123456"
		String str = "10000";
		int value = Integer.parseInt(str);
		
		String str2 = String.valueOf(value); //문자열 변환
		System.out.println(str2);
		
		
	}

}
