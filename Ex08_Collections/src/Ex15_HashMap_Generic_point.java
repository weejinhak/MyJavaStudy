import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HashMap  Generic 활용하기
//HashMap<String,String>
//HashMap<String,Integer>
//HashMap<String,Emp> //value 객체 사용 ...

//Network => ArrayList<Emp> , IO(파일입출력) , Thread , HashMap 

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
		students.put("hong", new Student("홍길동"));
		students.put("kim", new Student("김유신"));
		
		Student std = students.get("hong");
		System.out.println(std.name);

		
		//예외적으로 보시고 ...
		//Map 안에 있는 key , value 모두 출력  
		//Set set = students.entrySet(); //Entry 집합
		for(Map.Entry m : students.entrySet()){
			System.out.println(m.getKey() + "/ "+ ((Student)m.getValue()).name);
		}
		
	}

}
