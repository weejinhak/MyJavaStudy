import java.util.ArrayList;

import kr.or.kosta.Emp;

//객체지향 > 객체 (memory) 
public class Ex04_ArrayList_Object_keyPoint {

	public static void main(String[] args) {
		//Emp 라는 타입을 가지는 사원 1명을 만드세요
		Emp e = new Emp(1000,"홍길동","IT");
		System.out.println(e.toString());
		
		//배열(Array) 2명
		Emp[] elist = {new Emp(100,"김씨","SALES"),
					   new Emp(200,"박씨","IT")
		              };
		for(Emp emp : elist){
			System.out.println(emp.toString());
		}
		//elist[0]
		////////////////여기까지 복습///////////////
		//ArrayList 장점
		ArrayList emplist = new ArrayList();
		emplist.add(new Emp(500,"이씨","Manager"));
		emplist.add(new Emp(600,"홍씨","Sales"));
		emplist.add(new Emp(700,"윤씨","IT"));
		
		//for문을 통해서 (toString()) 사용하지 말고
		//사번 , 이름 , 직종 출력하세요
		
		//hint
		//[0] 배열에 있는 사원을 출력하세요 get함수
		//Emp m = (Emp)emplist.get(0);
		//System.out.println(m.toString());
		for(int i = 0 ; i < emplist.size() ; i++){
			System.out.println(((Emp)emplist.get(i)).getEmpno() + "/ " + 
								((Emp)emplist.get(i)).getEname() + "/ " +
								((Emp)emplist.get(i)).getJob()
					           ); //getter //emplist.get(i) return object
		}
		//개선된 for
		for(Object obj : emplist){
			Emp m = (Emp)obj;
			System.out.println(m.getEmpno() +":"+m.getEname() +":" + m.getJob() );
		}
		
		//불편해요 안쓰고 싶어요
		//generic 타입 강제 (100 %)
		ArrayList<Emp> emplist2 = new ArrayList<Emp>();
		emplist2.add(new Emp(1,"A","AA"));
		emplist2.add(new Emp(2,"B","BB"));
		emplist2.add(new Emp(3,"C","CC"));
		
		for(Emp obj : emplist2){
			System.out.println(obj.getEmpno() + "," + obj.getEname());
		}
	}

}




