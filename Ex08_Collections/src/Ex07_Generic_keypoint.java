import java.util.ArrayList;
import java.util.Stack;

//제너릭(Generic)
//JDK1.5 
//C# , Java 필수 기능

//1. Object 타입 저항 > Object 타입 탈피 
//2. 타입 안정성 (타입 강제)
//3. 형변환 처리 문제점 해결

class Person{
	int age = 100;
}

//Generic 클래스 설계 하기
class MyGen<T>{ //Type parameter
   T obj;
   void add(T obj){
	   this.obj = obj;
   }
   
   T get(){
	   return this.obj;
   }
}

class Car{
	String carname;
	Car(String carname){
		this.carname = carname;
	}
	String getCarname(){
		return this.carname;
	}
}



public class Ex07_Generic_keypoint {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(500);
		list.add(new Person());
		list.add("홍길동");
		
		//출력
		//개선된  for 문
		for(Object obj : list){
			//System.out.println(obj);
			if(obj instanceof Person){
				Person p = (Person)obj;
				System.out.println(p.age);
			}else{
				System.out.println(obj);
			}
		}

		
		MyGen<String> mygen = new MyGen<>();
		mygen.add("AA");
		System.out.println(mygen.get());
		
		MyGen<Car> mycar = new MyGen<>();
		
		mycar.add(new  Car("Pony"));
		
		Car c = mycar.get();
		System.out.println(c.getCarname());
		
		
		Stack<String> st = new Stack<>();
		st.push("AAA");
		
		ArrayList<Person> list2 = new ArrayList<>();
		list2.add(new Person());
		for(Person p : list2){
			System.out.println(p.age);
		}
		
		
		
		
	}

}
