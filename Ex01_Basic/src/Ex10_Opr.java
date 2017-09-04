
public class Ex10_Opr {
	public static void main(String[] args) {
		//if  종류 : 3가지 
		int count=0;
		if(count < 1){
			System.out.println("True 방가");
		}
		
		if(count < 1)System.out.println("단축표현"); //허용 {}생략

		//제어문 (반복문 : for문 , while문 , do~ while문)
		
		//1~100까지의 합을 구하세요
		int sum=0;
		for(int i = 1 ; i <= 100; i++){
			//System.out.println(i);
			//int sum =0;
			//sum = sum + i;
			//System.out.println(sum);
			//sum = sum+i;
			sum+=i;
		}
		System.out.println("1~100까지의 합 : " + sum);
		
		int sum2 = 0;
		for(int i = 1 ; i <= 100 ; i+=2){ //i = i + 2;(식)
			//System.out.println(i);
			sum2+=i; //sum2 = sum2 + i
		}
		System.out.println("1~100까지의 홀수의 합 :" + sum2);
		
		//1~100까지의 짝수의 합 
		//for 안에서 if 활용해서 
		int sum3 = 0;
		//int i = 0;
		for(int i=1; i <= 100 ;i++){
			if(i % 2 == 0){
				sum3+=i;
			}
		}
		System.out.println("짝수의 합: " + sum3);
		//System.out.println(i);
		
		//key point (중첩 for문 : 구구단) 암기하자 ~~~~~~~******
		//행과열의 논리
		//2단 ~ 9단
		//2단 (1~9)
		for(int i =2 ; i <= 9 ; i++){
			for(int j=1 ; j <= 9 ; j++){
				//System.out.println(i + "*" + j + "=" + i*j);
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		//key point (for  절친 : continue , break)
		//continue (이하 구문 skip 해서 진행 계속 for문 진행)
		//break (탈출해라 for문을)
		System.out.println();
		for(int i=2; i<=9 ; i++){
			for(int j=1 ; j<=9 ;j++){
				if(i==j){ //if(i==j)break;
					break;
				}
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		for(int i=2; i<=9 ; i++){
			for(int j=1 ; j<=9 ;j++){
				if(i==j){ //if(i==j)break;
					continue;
				}
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=2; i<=9 ; i++){
			for(int j=1 ; j<=9 ;j++){
				if(i==j)break;
				System.out.print("*");
			}
			System.out.println();
		}
		//카페 개설 과제 (별찍기 과제 : 개인 3개)
		//코드 설명
		
		//key point for(공식)
		for(int i =2 ; i <= 9 ; i++){
			for(int j =1 ; j<i ; j++){ //조건식 : j<=9 => j<i
				System.out.print("*");
			}
			System.out.println();
		}
		
		//초기값을 최대값으로
		for(int i =100 ; i >=0 ; i--){
			System.out.println(i);
		}
		
		//나중에 (피보나치 수열)
		int a=0 , b=1 , c=0;
		for(int i = 0; i < 10 ;i++){
			a = b;
			b = c;
			c = a + b;
			System.out.println(" " + c);
		}
		
	}

}
