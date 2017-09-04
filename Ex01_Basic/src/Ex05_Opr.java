//연산자
public class Ex05_Opr {
	public static void main(String[] args) {
		//산술(  % 나머지)
		int result = 100/100;
		System.out.println(result);
		result = 13/2;
		System.out.println(result);
		result = 13%2;
		System.out.println(result);
		
		//증가감(++ , --) 1씩 증가감
		int i = 10;
		++i; //전치 증가
		System.out.println("++i : " + i);
		i++; //후치 증가
		System.out.println("i++ : " + i);
		--i;
		System.out.println("--i : " + i);
		
		//전치 후치 연산자 다른 식과 같이 사용
		int i2 = 5;
		int j2 = 6;
		
		int result2 = i2 + ++j2;
		System.out.println(result2); //j2=>7
		
		result2 = i2 + j2++;
		System.out.println("result2 :" + result2);
		System.out.println("j2 :" + j2);
		
		result2 = ++i2 + j2++;
		System.out.println("result2 :" + result2);
		System.out.println("j2 :" + j2);
		
		//Today point
		//자바에서 연산 규칙
		//정수의 모든 [연산]은 int 변환수 처리
		//byte + byte => int + int
		
		byte b = 100;
		byte c = 1;
		//byte result3 = b + c;
		//1. 결과 int
		//2. (b+c) 결과 int > (byte)(b+c)
		byte result3 = (byte)(b + c);
		System.out.println("result3 : " + result3);
		
		//byte + short => int + int
		//char + char  => int + int
		
		//실수(정수 와 실수 연산 : 실수)
		//float + int = float + float
		//float + long = float + float
		//float + double = double + double
		
		float num2 = 10.3f;
		int num3 =20;
		//int num4 = num2 + num3;
		//1. num4 > float
		//2. 결과 casting 
		int num4 = (int)(num2 + num3); //데이터 손실
		System.out.println("num4 : " + num4);
		
		char c2 = 'A'; //char 아스키 코드표 10진수 65
		char c3 = 'A';
		//char result5 = c2 + c3;
		int result5 = c2 + c3;
		System.out.println(result5);
		char result6 = (char)result5;
		System.out.println(result6);
		
		//중소기업 (구구단)
		//1-10까지의 수에서 짝수의 합만 출력하세요
		int sum = 0; //지역변수 초기화
		for(int j = 1 ; j <= 10 ; j++){
			//int sum = 0; //scope (for 안쪽)
			//sum = sum + j;
			if(j%2==0){
				//sum = sum + j;
				sum+=j;
			}
		}
		System.out.println("1~10까지 짝수 합 : " + sum);
		
		//== 값을 비교 
		if(10 == 10.0f){
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE");
		}
		
		//! 부정 연산자
		if('A' != 65){ //같지 않니
			System.out.println("같지 않아요");
		}else{
			System.out.println("같아요");
		}
		
		//Point 암기(삼항 연산자)
		int p = 10;
		int k = -10;
		int result7= (p==10) ? p : k;
		// ? 앞에 조건식이 True 면  : 앞에 것을 취하고
		// ? 앞에 조건식이 Flase 면 : 뒤에 것을 취한다
		System.out.println(result7);
		
		/*
		 if(p == 10){
		 	result7 = p;
		 }else{
		 	result7 = k;
		 }
		  
		  
		 진리표
		          OR     ,    AND
		 0  0      0           0 
		 0  1      1           0
		 1  0      1           0
		 1  1      1           1  
		 
		//0 : false
		//1 : true 
		
		select *
		from emp
		where empno=1000 and sal > 100  두개의 모두 만족
		  
		select *
		from emp
		where empno=1000 or sal > 100  둘중에 하나만 만족
		  
		*/
		int x = 3;
		int y = 5;
		
		//연산자
		// | or 연산자
		// & and  연산자
		// bit
		System.out.println(x|y);
		//십진수
		// 256  128  64  32  16  8  4  2  1
		//                       0  0  1  1 3의 이진수
		//                       0  1  0  1
		//OR                     0  1  1  1  (1 + 2 + 4)
		//AND                    0  0  0  1  (1)
		System.out.println(x&y);
		
		
		//암기 (Point) && (and) , || (or) > 논리연산
		//조건문 ....
		//if(10 > 0 && -1 > 1 && 100 > 2 && 1 >-1 && ....)
		//-1 > 1 두번째 조건이 false  && > 전체 false
		//if(10 > 0 || -1 > 1 || 100 > 2 || 1 >-1 || ....)
		
	}

}
