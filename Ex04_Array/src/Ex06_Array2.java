

class Car5{
	int door;
	String color;
}


public class Ex06_Array2 {

	public static void main(String[] args) {
		// 2차원 배열
		// [행,열] > 구구단
		int[][] score = new int[3][2];
		System.out.println(score[0][0]);
		System.out.println(score[2][1]);
		score[0][0] = 100;
		score[0][1] = 200;

		score[1][0] = 300;
		score[1][1] = 400;

		score[2][0] = 500;
		score[2][1] = 600;

		// length (개수) for문 근거
		// 행의 개수 : 배열이름.length > score.length
		// 열의 개수 : 배열이름[i].length > score[0].length

		for (int i = 0; i < score.length; i++) {

			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d\n", i, j, score[i][j]);
			}
		}

		// int[] arr = new int[]{1,2,3}
		// 위의 코드 처럼 3행 3열 짜리 배열을 만드세요
		int[][] arr = new int[][] { { 1, 2 }, 
			                        { 4 }, 
			                        { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d]=%d\n", i, j, arr[i][j]);
			}
		}
		//Today point (배열 , 컬렉션 궁합)
		//for문 (개선된 for문)
		//c#   : for(Type변수명 in 배열 또는 컬렉션) { 출력 }
		//java : for(Type변수명 : 배열 또는 컬렉션) { 출력 } 
		
		int[] arr3 = {5,6,7,8,9,10};
		//for(int i=0 ; i < arr3.length ; i++){
		//	System.out.println(arr3[i]);
		//}
		for(int value : arr3){
			System.out.println(value);
		}
		
		String[] strarr = {"A","B","C","D"};
		for(String value : strarr){
			System.out.println(value);
		}
		
		//인형 퀴즈 (센스)
		int[][] score3 = new int[][]{
								      {11,12},
								      {13,14},
								      {15,16},
		                            };
		//2차원 배열을 [개선된 for문]
		for(int[] rows : score3){
			for(int value : rows){
				System.out.println("값 : " + value);
			}
		}
		
		//객체 배열
		Car5[] cararr = new Car5[2];
		cararr[0] = new Car5();
		cararr[0].door = 5;
		cararr[0].color = "Red";
		
		cararr[1] = new Car5();
		cararr[1].door = 3;
		cararr[1].color = "Blue";
		//일반 for문으로 배열이 가지는 객체의 door , color
		//출력하세요
		for(int i = 0; i < cararr.length ; i++){
			System.out.println(cararr[i].color + "/" +
					           cararr[i].door);
		}
		
		//위 for문 개선된 for문으로 출력하세요
		for(Car5 obj : cararr){ //obj 는 Car타입의 주소값
			System.out.println(obj.door + "/" + obj.color);
		}
		
	}

}
