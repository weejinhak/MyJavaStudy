import java.util.Vector;

/*
 * Collection Framework 
 * [ǥ��ȭ�� �������̽��� �����ϰ� �ִ� Ŭ�������� ����]
 * Collection �������̽� -> List (���) -> ���� (ArrayList **)
 *                      -> Set  (���) -> ���� (HashSet , TreeSet)
 * Map �������̽� -> ���� (HashMap **)                     
 * 
 * List interface (���� ���ÿ�)
 * ����(0) , �ߺ�(0) -> ���������� ������ ���� (�迭) [0][1][2][3]
 * ex) ����� (��ȣǥ) �ο�
 * Vector (��) -> ����ȭ(��Ƽ������) -> ���� lock ��ġ(default)
 * ArrayList(��) -> ����ȭ ����(x) -> ����ȭ ���� ���� -> �� �� ���� ���� -> Ȱ�뵵
 * ��) ����� ���ÿ� �������� ���� �Ծ��
 * 
 * Array(����)  <->  (����) Collection (�迭�� ���Ҵ�)
 * 
 * [���� Array]
 * 1. �迭�� ũ�� ���� (int [] arr = new int[10] , int[] arr2 = {10,20})
 * 2. �迭�� ���� ���(index) > arr[index]
 * 3. �ʱ⿡ ������ �迭�� ũ�⸦ ������ �� ���� (point)
 * 
 * [���� Collection ���� , ��]
 * List �������̽� ����
 * 1. �迭�� ũ�⸦ �������� Ȯ�� ���� (�迭�� ���Ҵ�)
 * 2. ������ ����(�迭 ���ο� index) , �ߺ��� ���
 * 3. ������ ����(�ڷ�) ���� (�迭) : Type (Object) > private Object[] data
 * 4. Object ���� > �غ�(���ʸ�) > Ÿ����  �����ϴ� ���
 * 5. ����� class > new > ��ü �������� (Vector v = new Vector())
 * */
public class Ex01_Vector {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("�ʱ�뷮 : " + v.capacity()); //10���� ��
		v.add("AA");
		v.add("BB");
		v.add(100);
		
		System.out.println(v.toString()); //Object �� toString ������(override)
		
		for(int i = 0 ; i < v.size() ; i++){ //size , get()
			System.out.println(v.get(i)); // �迭 int[] arr = {10 , 20} > arr[0]
		}
		//Ư����ġ
		System.out.println(v.get(2));
		
		//������ for �� ���
		for(Object s : v){
			System.out.println("object : " + s);
		}
		//�׷��� ������ ... ��� Object �ذ� ����
		//generic (��ü�� ���鶧 Ÿ�� �����ϸ� ... Ÿ�� ����)
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
		Vector v3 = new Vector(); //default 10 ����
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
		
		
		//Key Point ������ �ִ� (�迭)
		//�߰��� �����͸� ���� �ϰų� ������ ���� �߻�
		
	}

}
