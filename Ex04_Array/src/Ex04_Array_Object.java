//��ü �迭
//Ŭ������ Ÿ�Դϴ�
//�迭�� Ÿ�Դϴ�

class Person{
	String name;
	int age;
}

public class Ex04_Array_Object {
	public static void main(String[] args) {
		int[] intarr = new int[10];
		
		//Person p = new Person();
		Person[] objarr = new Person[3]; //new �迭���� 
		//������ �迭�濡 Person ��ü�� �ø��� �۾�
		System.out.println("before: " + objarr[0]);
		
		objarr[0] = new Person();
		objarr[1] = new Person();
		objarr[2] = new Person();
		System.out.println("after:" + objarr[0]);
	
		//���ٹ��
		objarr[0].name = "ȫ�浿";
		objarr[1].age = 100;
		
		System.out.println(objarr[0].name);
		System.out.println(objarr[1].name);
		//for���� ����ؼ� objarr �� �� �濡 ��ü�� age , name
		//�� ���� ����ϼ���
		
		
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
