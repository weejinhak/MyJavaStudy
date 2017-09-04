//객체 배열
//클래스는 타입니다
//배열도 타입니다

class Person{
	String name;
	int age;
}

public class Ex04_Array_Object {
	public static void main(String[] args) {
		int[] intarr = new int[10];
		
		//Person p = new Person();
		Person[] objarr = new Person[3]; //new 배열생성 
		//각각의 배열방에 Person 객체를 올리는 작업
		System.out.println("before: " + objarr[0]);
		
		objarr[0] = new Person();
		objarr[1] = new Person();
		objarr[2] = new Person();
		System.out.println("after:" + objarr[0]);
	
		//접근방법
		objarr[0].name = "홍길동";
		objarr[1].age = 100;
		
		System.out.println(objarr[0].name);
		System.out.println(objarr[1].name);
		//for문을 사용해서 objarr 의 각 방에 객체의 age , name
		//의 값을 출력하세요
		
		
		for(int i = 0 ; i < objarr.length ; i++){
			System.out.println(objarr[i].name + ":" +
		                       objarr[i].age);
		}
		
		/////////////////////////////////////
		Person[] array = new Person[]{new Person(),new Person()};
		Person[] array2 = {new Person(), new Person()};
		//////////////////////////////////////////////
		
		
		Person[] parray = new Person[3];
		for(int i=0; i < parray.length ; i++){
			parray[i] = new Person();
			System.out.println(parray[i].age);
		}
		
		
	}

}
