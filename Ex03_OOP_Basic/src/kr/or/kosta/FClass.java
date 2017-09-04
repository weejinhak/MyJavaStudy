package kr.or.kosta;

//Java 함수(method) 4가지 종류
//void 리턴 타입이 없다 (돌려주는 값이 없다)
//1. void , parameter(0)
//2. void , parameter(x)
//3. return Type , paramter(0)
//4. return Type , paramter(x)

//return Type : [8가지 기본타입] + 참조 타입 + 배열 + Collection + Interface
//parameter : 들어오는 값 (동전구멍) [8가지 기본타입] + 참조 타입 + 배열 + Collection + Interface
//함수는 반드시 호출에 의해서 실행 
public class FClass {
	public void m(){ //실행블럭
		System.out.println("일반함수:(void,param(x))");
	}
	public void m2(int i){
		System.out.println("paramter value : " + i);
		System.out.println("일반함수:(void,param(0))");
	}
	public int m3(){
		//로직 제어 
		return -1000;
		
	}
	public int m4(int i){
		return i + 100; //정수 타입(int)
	}

	////////////////////////////////////////////////
	//method 확장하기 
	//2개의 정수값을 받아서 합한 값을 리턴하는 함수
	public int sum(int i , int j){
		//return i + j;
		int sum = i + j;
		return sum;
	}
	
	//Quiz
	//a 와 b 둘중에 큰 값을 return 하도록 하세요
	//로직을 구성( max(100, 200)  return 200 
	public int max(int a , int b){
		
		//1 (30점)
		//if(a > b){
		//	return a;
		//}else{
		//	return b;
		//}
		
		//2. 60점
		//int result = 0;
		//if(a > b){
		//	result = a;
		//}else{
		//	result = b;
		//}
		//return result;
		
		int max = (a > b) ? a : b;
		return max;
	}
	
	public String concat(String s , String s2 , String s3){
		//논리
		String result = s + "/" + s2 + "/" + s3;
		return result;
				
	}
	
	//Class 도 타입이다
	public Tv ObjMethod(){
		Tv t = new Tv();
		t.brandname="ss";
		return t;
		//return new Tv(); //주소값(Tv 타입을 가지는)
	}
	public void ObjMethod2(Tv t){ // (int i)
		System.out.println("ObjMethod2:" +t.brandname); 
	}
	
	/*
	   public List<Car> 
	   
	   public ... obj(Car[] c , String s , int s , int[] s )
	 
	 
	 */
}





