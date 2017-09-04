import java.util.ArrayList;
import java.util.Iterator;

import kr.or.kosta.CopyEmp;
import kr.or.kosta.Emp;

public class Ex09_Generic_Quiz {

	public static void main(String[] args) {
	
		
		//1. Emp 클래스를 사용해서 사원 3명을 생성
		//생성은 ArrayList<T> 기능 사용하세요
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		emplist.add(new Emp(1000,"김씨","대리"));
		emplist.add(new Emp(2000,"박씨","과장"));
		emplist.add(new Emp(3000,"홍씨","부장"));
		
		
		//2.사원의 정보(사번 , 이름 , 직종) 개선된 for문 출력
		//단 toString 은 사용하지 마세요
		for(Emp e : emplist){
			System.out.println(e.getEmpno() + "/" + e.getEname() + "/" +e.getJob());
		}
		
		//2.1 일반 for문으로 출력
		for(int i = 0 ; i < emplist.size() ; i++){
			 Emp e = emplist.get(i); 
			 System.out.println(e.getEmpno() +"-"+ e.getEname() +"-" + e.getJob());
		}
		
		
		
		
		//3.Emp 클래스와 같은 구조를 갖는 CopyEmp 클래스
		//를 kr.or.kosta 안에서 생성하세요
		//sal 급여 (int) 급여 member field 추가 setter , getter
		//생성자에서도 값을 입력받도록 수정
		
		//100,"김",1000
		//200,"이",2000
		//300,"박",3000
		ArrayList<CopyEmp> copylist = new ArrayList<CopyEmp>();
		copylist.add(new CopyEmp(100, "김", 1000));
		copylist.add(new CopyEmp(200, "박", 2000));
		copylist.add(new CopyEmp(300, "이", 3000));
		
		//데이터 입력
		//3.1 200번 사원의 급여를 5000 으로 인상해서 출력
		System.out.println("----------------------------------");
		for(CopyEmp e : copylist){
			if(e.getEmpno() == 200){
				e.setSal(5000);
				System.out.println(e.toString());
				//System.out.println(e.getEmpno() + " : " + (e.getSal() + 3000));
			}
		}
		//3.2 300번 사원의 이름을 "궁금해" 로 수정해서 출력
		for(CopyEmp e : copylist){
			if(e.getEname().equals("이")){
				e.setEname("궁금해");
				System.out.println(e.toString());
			}
		}
		
       //4.사원정보를 Iterator 를 사용해서 출력하세요
		System.out.println("****************************");
		Iterator<Emp> elist = emplist.iterator();
		while(elist.hasNext()){
			//System.out.println(elist.next().getEmpno());
			//System.out.println(elist.next().getEname());
			//System.out.println(elist.next().getJob());
			
			
			//1. Emp e = elist.next();
			//   e.getEmpno .....
			System.out.println(elist.next().toString());
		}
		
	}

}
