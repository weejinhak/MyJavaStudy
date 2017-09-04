import java.util.ArrayList;
import java.util.Stack;

//���ʸ�(Generic)
//JDK1.5 
//C# , Java �ʼ� ���

//1. Object Ÿ�� ���� > Object Ÿ�� Ż�� 
//2. Ÿ�� ������ (Ÿ�� ����)
//3. ����ȯ ó�� ������ �ذ�

class Person{
	int age = 100;
}

//Generic Ŭ���� ���� �ϱ�
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
		list.add("ȫ�浿");
		
		//���
		//������  for ��
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
