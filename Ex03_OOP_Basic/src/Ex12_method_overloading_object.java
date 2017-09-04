class Human{
	String name;
	int age;
}

class Test{
	Human add(Human h){
		h.name = "ȫ�浿";
		h.age = 100;
		return h;
	}
	Human add(Human h , Human h2){
		h2.age = h.age;
		h2.name = h.name;
		return h2;
	}
	
	void add(Human[] harray){
		System.out.println(harray.length);
	}
}
public class Ex12_method_overloading_object {
	public static void main(String[] args) {
		Test t = new Test();
		Human man = new Human();
		//Human h =  t.add(man);
		//System.out.println(h.name + "/" + h.age);
		Human woman = t.add(man);
		System.out.println(woman.name + "/" + woman.age);

		Human[] arr = {new Human(),new Human()};
		t.add(arr);
		
	}

}
