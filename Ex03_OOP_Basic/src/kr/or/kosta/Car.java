package kr.or.kosta;
/*
class , member field , method 앞에는
접근자 , 한정자 , 수정자
1. default [폴더(package)]
class Car{  //A 폴더 안에서 생성 (B 폴더 에서 사용(x)
 int window;
 String color;
 int speed;
} 
*주의사항 : 클래스 안에서는 public , private 의미 없다
2. public (공유 : 폴더 구분없이 모든 자원에 공유)
3. private(개인 : 클래스내부에서만 서로 사용 , 
                   참조변수가 접근 할수 없어요 )

객체지향언어 : private (캡슐화, 은닉화)                   
 
  1. 클래스 내부에만 활용
  2. window 변수에 직접할당을 막고 간접할당(함수) 

  자원의 보호 : 설계자가 원하는 값만 제어 ...
*/

public class Car {
	private int window;
	public String color;
	private int speed;
	
	//window (함수) 를 통해서 간접 제어
	//read , write : 함수 1개 기능 1개
	
	public void writeWindow(int data){
		if(data > 0){
			window = data;
		}else{
			window = 0;
		}
		
	}
	
	public int readWindow(){
		return window + 10;
	}

	//getter
	public int getSpeed() {
		return speed;
	}

	//setter
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//java 캡슐화된 자원을 read ,write 함수
	//통칭하여 setter(쓰기 전용) , getter (읽기 전용)
	
	
	//함수 (기능 , 행위)
	//speed 5씩 증가하는 함수
	public void speedUp(){
		speed+=5;
	}
	//speed 5씩 감소하는 함수
	public void speedDown(){
		if(speed > 0){
			speed -=5;
		}else{
			speed = 0;
		}
	}
	
	private int data(){
		return 100;
	}
	//함수의 접근자 private (내부에서 다른 함수의 사용을
	//돕는 함수
}






