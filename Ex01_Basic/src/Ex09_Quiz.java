import java.util.Scanner;

public class Ex09_Quiz {

	public static void main(String[] args) {
		/*
			간단한 사칙 연산기 (+ , - , * , /)
			입력값 3개
			처음입력값 : 숫자 (ex:10)
			두번째 입력값 : 연산기호 (ex: + )
			세번째 입력값 : 숫자 
			연산의 결과는 prinf() 사용해서 출력
            
           *입력값은 : nextline() 문자 > 필요시 변환 
            숫자입력:10 enter
            기호입력: + enter  > String opr ="+"
            숫자입력:100 enter
            결과:10+100=110 출력
            
           hint) if문 사용 else if() 
           hint) (x) if(opr == "+"){ 더하기 연산 }
           hint) (x) if(opr.equals("+")){ 더하기 연산 }  
		
		
		*/
		  String op=""; //초기화
		  int input_1=0;
		  int input_2=0;
		  
		  Scanner sc = new Scanner(System.in);
		  
		  	  
		  System.out.print("입력값_1(숫자) : ");
		  input_1 = Integer.parseInt(sc.nextLine());
		  
		  System.out.print("연산자(+,-,*,/) : ");
		  op = sc.nextLine();
		  
		  System.out.print("입력값_2(숫자) : ");
		  input_2 = Integer.parseInt(sc.nextLine());
		  
		  //System.out.printf("%d , %s , %d",input_1,op,input_2);
		  
		  //key point : 문자열의 비교 (== 안되요 : 값비교)
		  //            문자열을 비교(equals 사용)
		  int result = 0;
		  if(op.equals("+")){
			  result = input_1 + input_2;
		  }else if(op.equals("-")){
  		      result = input_1 - input_2;
		  }else if(op.equals("*")){
  		      result = input_1 * input_2;
		  }else if(op.equals("/")){
		     result = input_1 / input_2;
		  }else{
		    System.out.println("지원하지 않는 연산자입니다");
		    //key point
		    //**[함수단위의 적용 : 종결자(main 블럭 빠져 나가라) > 프로그램 종료
		    return; 
		  }
		  System.out.printf("[%d].....[%s][%d]=[%d]",input_1,op,input_2,result);
	}

 }
