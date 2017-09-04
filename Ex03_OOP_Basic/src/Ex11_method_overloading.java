//객체지향언어
//캡슐화(은닉화) > private

//개념 : method overloading
//하나의 이름으로 여러가지 기능
//여러가지 기능
//함수의 paramter 의 개수와 타입을 달리해서 사용
//1.함수의 이름은 같아야 한다
//2.[parameter] 개수 or [Type] 달라야 한다
//3.return type 은 오버로딩의 판단기준[x]
//4.paramter 순서가 다름을 인정

//why 사용:편해서=> 개발자 
//성능 전혀 무관 (0%)

class Overtest{
	int add(int i){
		return i + 100;
	}
	//int addtwo(int i , int j){
	//	return i + j;
	//}
	int add(int i , int j){
		return i+j;
	}
	
	//void add(int number){} 충돌
	
	void add(String s , int i){
		
	}
	//순서에 것은 인정
	void add(int i , String s){
		
	}
	
	//이제 배열 (Array)를 배웠으니 ....
	//key point
	int[] add(int[] param){ //param 배열 객체 주소값
		int[] target = new int[param.length];
		for(int i=0; i< param.length;i++){
			target[i] = param[i]+1;
		}
		
		return target;
	}
	
	int[] add(int[] so , int[] so2){
	 //함수가 error 없이 동작되게 	
	 int length = so.length > so2.length ? so.length : so2.length;
	 int[] result = new int[length];
	     for(int i = 0; i < result.length; i++){
	            result[i] = so[i] + so2[i];
	        }
	     return result;
	}
}
public class Ex11_method_overloading {

	public static void main(String[] args) {
		Overtest test = new Overtest();
		test.add(100);
		test.add(100,300);
		
		System.out.println(); //overloading
		
		int[] soruce = {10,11,12,13,14,15}; //new
		
		int[] array = test.add(soruce);
		System.out.println(soruce == array);
		
		//만든 함수 호출 사용
		int[] s = {10,20,30};
		int[] t = {11,21,31};
		int[] target3 = test.add(s, t);
		        
		  for(int value : target3){
		            System.out.print(value+" ");
		}
	}

}
