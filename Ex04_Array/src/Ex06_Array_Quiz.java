
public class Ex06_Array_Quiz {

	public static void main(String[] args) {
		int[][] score = {
							{50,60,40},    //0�� ö�� ��,��,��
							{55,40,80},   //1�� ���� ��,��,��
							{90,80,50},    //2�� ���� ��,��,��
		                 };
	  //����
      //1. �� ���� ���� ,����� ���ϼ���

	  //2. �� �л��� ���� , ���� , ���� ������ ���� , ���	
		
		int Stuent_Sum = 0; // �л� ������ ����
		int kor_Sum = 0; // ���� ������ ����
		int eng_Sum = 0; // ���� ������ ����
		int math_Sum = 0; // ���� ������ ����
 
		float Stuent_Avg = 0f; // �л� ������ ���
		float ko_Avg = 0f; // ���� ������ ���
		float en_Avg = 0f; // ���� ������ ���
		float matn_Avg = 0f; // ���� ������ ���
 
		for (int[] rows : score) {
			kor_Sum += rows[0]; // ���� ���� �޾� ���ϱ� , ���� ���� �ϼ� ����
			eng_Sum += rows[1]; // ���� ���� �޾� ���ϱ� , ���� ���� �ϼ� ����
			math_Sum += rows[2]; // ���� ���� �޾� ���ϱ� , ���� ���� �ϼ� ����
		}
 
		// ����, ���� , ���� ���� ���� ���
		System.out.print("���� ���� : " + kor_Sum + "\t\t");
		System.out.print("���� ���� : " + eng_Sum + "\t\t");
		System.out.print("���� ���� : " + math_Sum + "\n");
 
		ko_Avg = kor_Sum / (float) score.length; // ���� ������ ��� ���ϱ�
		en_Avg = eng_Sum / (float) score.length; // ���� ������ ��� ���ϱ�
		matn_Avg = math_Sum / (float) score.length; // ���� ������ ��� ���ϱ�
 
		System.out.print("���� ��� : " + ko_Avg + "\t\t");
		System.out.print("���� ��� : " + en_Avg + "\t\t");
		System.out.print("���� ��� : " + matn_Avg + "\t\t\n");
 
		// 2. �� �л��� ���� , ���� , ���� ������ ���� , ���
		System.out.println("------------------------------------------");
		System.out.println("����\t����\t����\t����\t���");
		for (int[] rows : score) {
			for (int col : rows) {
				System.out.print(col + "\t"); // �л��� �� ���� ���� ���
				Stuent_Sum += col; // �л��� ���� ���ϱ�
			}
			Stuent_Avg = Stuent_Sum / (float) score.length; // �л� ������ ��� ���ϱ�
			System.out.print(Stuent_Sum + "\t" + Stuent_Avg + "\n");
			Stuent_Sum = 0;
			Stuent_Avg = 0;
		}
		System.out.println("------------------------------------------");
		
		
		
		
		
		
		
		///////////////////�Ϲ�for��////////////////////////////
		
		/*int kortotal = 0; 
		int engtotal = 0;
		int mathtotal = 0;
		for(int i = 0 ; i < score.length ; i++){
			kortotal += score[i][0];
			engtotal += score[i][1];
			mathtotal += score[i][2];
			
		}
		System.out.printf("korsum:[%d] engsum:[%d] mathsum:[%d]\n",kortotal,engtotal,mathtotal);
		System.out.printf("koravg:[%f] engavg:[%f] mathavg:[%f]\n",kortotal/(float)3,engtotal/(float)3,mathtotal/(float)3);
	
				
		System.out.print("����\t ����\t ����\t ����\t ���\n");
		for(int i = 0 ; i < score.length ; i++){
			int sum = 0;
			for(int j =0 ; j < score[i].length ; j++){
				sum += score[i][j];
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(sum+"\t" + sum/(float)score[i].length);
		}*/
	}

}
