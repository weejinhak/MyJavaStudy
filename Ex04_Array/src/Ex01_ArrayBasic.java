import java.util.Arrays;

//*�迭(Array) �� ��ü�� ( new ������ memory)


class Car{
	String brandname;
}

public class Ex01_ArrayBasic {
	public static void main(String[] args) {
		int[] score = new int[3];
		System.out.println(score); //�ּҰ�
		
		//�迭�� ������ ���� ������ �ִ� (Ÿ�� ũ��)
		//������ ���� index[÷��] ���� ���� > ���۰� : 0
		//�迭�� ����(length)�� �迭�� ������ ÷��(index)  1�� ũ��
		
		//�迭�� ���� ����
		System.out.println(score[0]); //read
		System.out.println(score[1]);
		
		score[2] = 555;
		System.out.println(score[2]);
		
		//System.out.println(score[3]);
		//java.lang.ArrayIndexOutOfBoundsException
		
		//�迭 ���� (���: for)
		for(int i = 0 ; i < 3 ; i++){
			System.out.printf("score[%d]=%d\n",i,score[i]);
		}
		
		for(int i = 0 ; i < score.length ; i++){
			System.out.printf("score[%d]=%d\n",i,score[i]);
		}
		
		//Arrays.sort() ����Ŭ���� (help��)
		
		//�迭 ����
		//class Ÿ�Ե� �迭
		//Car c = new Car();  Car c2 = new Car();
		//Car[] cars = new Car[3];
		
		
		//3����
		int[] arr = new int[5];
		int[] arr2 = new int[]{100,200,300};
		int[] arr3 = {1,2,3,4,5}; //�����Ϸ� new arr3[]
		
		for(int i = 0 ; i < arr3.length ; i++){
			System.out.printf("arr3[%d]=%d\n",i,arr3[i]);
		}
		
		//�迭�� ���� �� �Ҵ�
		int[] arr4; //����
		arr4 = new int[]{1,2,3,4,5}; //�Ҵ�
		
		int[] arr5 = {11,12,13,14,15};
		int[] arr6 = arr5;
		
		arr6[0] =6666;
		System.out.println(arr5[0]);
		System.out.println(arr5 == arr6);
		
		//�迭�� 8���� Ÿ�� + ����ڰ� ���� Ŭ����
		char[] ch = new char[10];
		for(int i = 0 ; i < ch.length ; i++){
			System.out.println(">"+ch[i]+"<"); //\u0000 �⺻��
		}
		
		
	}

}
