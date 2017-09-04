import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HashMap  Generic Ȱ���ϱ�
//HashMap<String,String>
//HashMap<String,Integer>
//HashMap<String,Emp> //value ��ü ��� ...

//Network => ArrayList<Emp> , IO(���������) , Thread , HashMap 

class Student{
	//int kor;
	//int eng;
	String name;
	Student(String name){
		this.name = name;
	}
}

public class Ex15_HashMap_Generic_point {
	public static void main(String[] args) {
		
		HashMap<String, Student> students = new HashMap<>();
		students.put("hong", new Student("ȫ�浿"));
		students.put("kim", new Student("������"));
		
		Student std = students.get("hong");
		System.out.println(std.name);

		
		//���������� ���ð� ...
		//Map �ȿ� �ִ� key , value ��� ���  
		//Set set = students.entrySet(); //Entry ����
		for(Map.Entry m : students.entrySet()){
			System.out.println(m.getKey() + "/ "+ ((Student)m.getValue()).name);
		}
		
	}

}
