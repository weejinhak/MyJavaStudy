import java.util.ArrayList;

//ArrayList 함수 활용하기

//교집합
//합집합
//차집합

public class Ex03_ArrayList_Function {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();

		ArrayList kyo = new ArrayList();
		ArrayList cha = new ArrayList();
		ArrayList hap = new ArrayList();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		System.out.println("list1 : " + list1.toString());
		System.out.println("list2 : " + list2.toString());

		//1.list1 모든 요소 를 kyo list 에 저장하세요
		System.out.println("before kyo : " + kyo.toString());
		kyo.addAll(list1);
		System.out.println("after  kyo : " + kyo.toString());
		kyo.retainAll(list2); //같은 값은 남기고 모두 삭제해라
		System.out.println("교집합 : " + kyo);
		
		//2 차집합
		cha.addAll(list1);
		System.out.println("before cha : " + cha.toString());
		cha.removeAll(list2); //같은 값 삭제해라
		System.out.println("after cha : " + cha.toString());
		
		//3.합집합
		hap.addAll(list1);
		System.out.println("1 addAll list1 : " + hap.toString());
		hap.removeAll(kyo);
		System.out.println("2 removeAll kyo : " + hap.toString());
		hap.addAll(list2);
		System.out.println("3 addAll list2 : " + hap.toString());
		
		
		// ** add() , remove()
		// 이런 놈들도 있다 : addAll(), retainAll() , removeAll() 함수
		// parameter 가 다형성을 기반으로 설계되어 있다
		
	}

}
