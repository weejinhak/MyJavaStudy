

class Car5{
	int door;
	String color;
}


public class Ex06_Array2 {

	public static void main(String[] args) {
		// 2���� �迭
		// [��,��] > ������
		int[][] score = new int[3][2];
		System.out.println(score[0][0]);
		System.out.println(score[2][1]);
		score[0][0] = 100;
		score[0][1] = 200;

		score[1][0] = 300;
		score[1][1] = 400;

		score[2][0] = 500;
		score[2][1] = 600;

		// length (����) for�� �ٰ�
		// ���� ���� : �迭�̸�.length > score.length
		// ���� ���� : �迭�̸�[i].length > score[0].length

		for (int i = 0; i < score.length; i++) {

			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d\n", i, j, score[i][j]);
			}
		}

		// int[] arr = new int[]{1,2,3}
		// ���� �ڵ� ó�� 3�� 3�� ¥�� �迭�� ���弼��
		int[][] arr = new int[][] { { 1, 2 }, 
			                        { 4 }, 
			                        { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d]=%d\n", i, j, arr[i][j]);
			}
		}
		//Today point (�迭 , �÷��� ����)
		//for�� (������ for��)
		//c#   : for(Type������ in �迭 �Ǵ� �÷���) { ��� }
		//java : for(Type������ : �迭 �Ǵ� �÷���) { ��� } 
		
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
		
		//���� ���� (����)
		int[][] score3 = new int[][]{
								      {11,12},
								      {13,14},
								      {15,16},
		                            };
		//2���� �迭�� [������ for��]
		for(int[] rows : score3){
			for(int value : rows){
				System.out.println("�� : " + value);
			}
		}
		
		//��ü �迭
		Car5[] cararr = new Car5[2];
		cararr[0] = new Car5();
		cararr[0].door = 5;
		cararr[0].color = "Red";
		
		cararr[1] = new Car5();
		cararr[1].door = 3;
		cararr[1].color = "Blue";
		//�Ϲ� for������ �迭�� ������ ��ü�� door , color
		//����ϼ���
		for(int i = 0; i < cararr.length ; i++){
			System.out.println(cararr[i].color + "/" +
					           cararr[i].door);
		}
		
		//�� for�� ������ for������ ����ϼ���
		for(Car5 obj : cararr){ //obj �� CarŸ���� �ּҰ�
			System.out.println(obj.door + "/" + obj.color);
		}
		
	}

}
