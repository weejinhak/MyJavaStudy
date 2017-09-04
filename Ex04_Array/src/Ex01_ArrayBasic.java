import java.util.Arrays;

//*배열(Array) 은 객체다 ( new 연산자 memory)


class Car{
	String brandname;
}

public class Ex01_ArrayBasic {
	public static void main(String[] args) {
		int[] score = new int[3];
		System.out.println(score); //주소값
		
		//배열은 각각의 방을 가지고 있다 (타입 크기)
		//각각의 방은 index[첨자] 접근 설계 > 시작값 : 0
		//배열은 개수(length)는 배열의 마지막 첨자(index)  1이 크다
		
		//배열에 대한 접근
		System.out.println(score[0]); //read
		System.out.println(score[1]);
		
		score[2] = 555;
		System.out.println(score[2]);
		
		//System.out.println(score[3]);
		//java.lang.ArrayIndexOutOfBoundsException
		
		//배열 궁합 (제어문: for)
		for(int i = 0 ; i < 3 ; i++){
			System.out.printf("score[%d]=%d\n",i,score[i]);
		}
		
		for(int i = 0 ; i < score.length ; i++){
			System.out.printf("score[%d]=%d\n",i,score[i]);
		}
		
		//Arrays.sort() 보조클래스 (help성)
		
		//배열 종류
		//class 타입도 배열
		//Car c = new Car();  Car c2 = new Car();
		//Car[] cars = new Car[3];
		
		
		//3가지
		int[] arr = new int[5];
		int[] arr2 = new int[]{100,200,300};
		int[] arr3 = {1,2,3,4,5}; //컴파일러 new arr3[]
		
		for(int i = 0 ; i < arr3.length ; i++){
			System.out.printf("arr3[%d]=%d\n",i,arr3[i]);
		}
		
		//배열도 선언 과 할당
		int[] arr4; //선언
		arr4 = new int[]{1,2,3,4,5}; //할당
		
		int[] arr5 = {11,12,13,14,15};
		int[] arr6 = arr5;
		
		arr6[0] =6666;
		System.out.println(arr5[0]);
		System.out.println(arr5 == arr6);
		
		//배열은 8가지 타입 + 사용자가 만든 클래스
		char[] ch = new char[10];
		for(int i = 0 ; i < ch.length ; i++){
			System.out.println(">"+ch[i]+"<"); //\u0000 기본값
		}
		
		
	}

}
