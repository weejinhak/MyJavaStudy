import java.util.ArrayList;

//ArrayList �Լ� Ȱ���ϱ�

//������
//������
//������

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

		//1.list1 ��� ��� �� kyo list �� �����ϼ���
		System.out.println("before kyo : " + kyo.toString());
		kyo.addAll(list1);
		System.out.println("after  kyo : " + kyo.toString());
		kyo.retainAll(list2); //���� ���� ����� ��� �����ض�
		System.out.println("������ : " + kyo);
		
		//2 ������
		cha.addAll(list1);
		System.out.println("before cha : " + cha.toString());
		cha.removeAll(list2); //���� �� �����ض�
		System.out.println("after cha : " + cha.toString());
		
		//3.������
		hap.addAll(list1);
		System.out.println("1 addAll list1 : " + hap.toString());
		hap.removeAll(kyo);
		System.out.println("2 removeAll kyo : " + hap.toString());
		hap.addAll(list2);
		System.out.println("3 addAll list2 : " + hap.toString());
		
		
		// ** add() , remove()
		// �̷� ��鵵 �ִ� : addAll(), retainAll() , removeAll() �Լ�
		// parameter �� �������� ������� ����Ǿ� �ִ�
		
	}

}
