import java.util.Vector;

/*
 * Collection Framework 
 * [표준화된 인터페이스를 구현하고 있는 클래스들의 집합]
 * Collection 인터페이스 -> List (상속) -> 구현 (ArrayList **)
 *                      -> Set  (상속) -> 구현 (HashSet , TreeSet)
 * Map 인터페이스 -> 구현 (HashMap **)                     
 * 
 * List interface (줄을 서시오)
 * 순서(0) , 중복(0) -> 내부적으로 데이터 관리 (배열) [0][1][2][3]
 * ex) 대기자 (번호표) 부여
 * Vector (구) -> 동기화(멀티쓰레드) -> 내부 lock 장치(default)
 * ArrayList(신) -> 동기화 보장(x) -> 동기화 지원 가능 -> 좀 더 빠른 성능 -> 활용도
 * 비교) 비빕밥 동시에 여러명이 같이 먹어요
 * 
 * Array(정적)  <->  (동적) Collection (배열의 재할당)
 * 
 * [정적 Array]
 * 1. 배열의 크기 고정 (int [] arr = new int[10] , int[] arr2 = {10,20})
 * 2. 배열의 접근 방법(index) > arr[index]
 * 3. 초기에 설정한 배열의 크기를 변경할 수 없다 (point)
 * 
 * [동적 Collection 집합 , 군]
 * List 인터페이스 구현
 * 1. 배열의 크기를 동적으로 확장 가능 (배열의 재할당)
 * 2. 순서를 유지(배열 내부에 index) , 중복값 허용
 * 3. 데이터 저장(자료) 공간 (배열) : Type (Object) > private Object[] data
 * 4. Object 단점 > 극복(제너릭) > 타입을  강제하는 방법
 * 5. 사용은 class > new > 객체 생성이후 (Vector v = new Vector())
 * */
public class Ex01_Vector {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기용량 : " + v.capacity()); //10개의 방
		v.add("AA");
		v.add("BB");
		v.add(100);
		
		System.out.println(v.toString()); //Object 의 toString 재정의(override)
		
		for(int i = 0 ; i < v.size() ; i++){ //size , get()
			System.out.println(v.get(i)); // 배열 int[] arr = {10 , 20} > arr[0]
		}
		//특정위치
		System.out.println(v.get(2));
		
		//개선된 for 문 출력
		for(Object s : v){
			System.out.println("object : " + s);
		}
		//그래서 개발자 ... 출력 Object 해결 제시
		//generic (객체를 만들때 타입 강제하면 ... 타입 설정)
		Vector<String> v2 = new Vector<String>();
		v2.add("PPP");
		v2.add("kkk");
		v2.add("yyy");
		for(String s : v2){
			System.out.println("String : " + s);
		}
		System.out.println(v2.toString());
		System.out.println("size : " + v2.size());
		System.out.println("capacity : " + v2.capacity());
		
		/////////////////////////////////////////////////////
		Vector v3 = new Vector(); //default 10 리터
		System.out.println(v3.capacity());
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println("size : " + v3.size());
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println("size 2 : " + v3.size());
		System.out.println("capacity : " + v3.capacity());
		
		
		//Key Point 순서가 있는 (배열)
		//중간에 데이터를 삽입 하거나 삭제시 성능 발생
		
	}

}
