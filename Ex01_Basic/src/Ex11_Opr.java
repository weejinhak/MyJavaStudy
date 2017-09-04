import java.util.Scanner;

//제어문 : while , do~while()
public class Ex11_Opr {
	public static void main(String[] args) {
		
		int i = 10;
		while(i>=10){ //조건식 true 실행 , false 탈출
			System.out.println("i :" + i);
			//안쪽에 증가감 명식적 구현
			i--;
		}
		//1~100까지의 합 출력
		int sum=0;
		int j = 0;
		while(j <= 100){
			sum+=j;
			j++;
			//System.out.println(j);
		}
		System.out.println("while sum : " + sum);
		
		//while 문 사용해서 구구단 출력
		int k = 2;
		int p = 1;
		while(k <= 9){
			p = 1; //p변수 1로 초기화
			//int p = 1;
			while(p <=9){
				System.out.printf("[%d]*[%d]=[%d]\n",k,p,k*p);
				p++;
			}
			k++;
		}
		
		//do{ 실행문 }while(조건식) : 강제적 실행구문
		//메뉴구성
		//1. 인사
		//2. 급여
		
		Scanner sc = new Scanner(System.in);
		int inputdata=0;
		do{
			System.out.print("숫자입력:");
			inputdata = Integer.parseInt(sc.nextLine());
		}while(inputdata > 10); //10보다 큰 값이 오면 do문실행
		                        //while 조건식 true do 강제 실행
		System.out.println("당신이 입력한 숫자는 :" + inputdata);
	}

}
