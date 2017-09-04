
public class Ex06_Array_Quiz {

	public static void main(String[] args) {
		int[][] score = {
							{50,60,40},    //0행 철이 국,영,수
							{55,40,80},   //1행 순이 국,영,수
							{90,80,50},    //2행 용이 국,영,수
		                 };
	  //문제
      //1. 각 과목별 총점 ,평균을 구하세요

	  //2. 각 학생의 국어 , 영어 , 수학 점수의 총점 , 평균	
		
		int Stuent_Sum = 0; // 학생 점수의 총점
		int kor_Sum = 0; // 국어 점수의 총점
		int eng_Sum = 0; // 영어 점수의 총점
		int math_Sum = 0; // 수학 점수의 총점
 
		float Stuent_Avg = 0f; // 학생 총점의 평균
		float ko_Avg = 0f; // 국어 총점의 평균
		float en_Avg = 0f; // 영어 총점의 평균
		float matn_Avg = 0f; // 수학 총점의 평균
 
		for (int[] rows : score) {
			kor_Sum += rows[0]; // 국어 점수 받아 더하기 , 국어 총점 완성 예정
			eng_Sum += rows[1]; // 영어 점수 받아 더하기 , 영어 총점 완성 예정
			math_Sum += rows[2]; // 수학 점수 받아 더하기 , 수학 총점 완성 예정
		}
 
		// 국어, 영어 , 수학 점수 총점 출력
		System.out.print("국어 총점 : " + kor_Sum + "\t\t");
		System.out.print("영어 총점 : " + eng_Sum + "\t\t");
		System.out.print("수학 총점 : " + math_Sum + "\n");
 
		ko_Avg = kor_Sum / (float) score.length; // 국어 총점의 평균 구하기
		en_Avg = eng_Sum / (float) score.length; // 영어 총점의 평균 구하기
		matn_Avg = math_Sum / (float) score.length; // 수학 총점의 평균 구하기
 
		System.out.print("국어 평균 : " + ko_Avg + "\t\t");
		System.out.print("영어 평균 : " + en_Avg + "\t\t");
		System.out.print("수학 평균 : " + matn_Avg + "\t\t\n");
 
		// 2. 각 학생의 국어 , 영어 , 수학 점수의 총점 , 평균
		System.out.println("------------------------------------------");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for (int[] rows : score) {
			for (int col : rows) {
				System.out.print(col + "\t"); // 학생의 각 과목 점수 출력
				Stuent_Sum += col; // 학생의 총점 구하기
			}
			Stuent_Avg = Stuent_Sum / (float) score.length; // 학생 총점의 평균 구하기
			System.out.print(Stuent_Sum + "\t" + Stuent_Avg + "\n");
			Stuent_Sum = 0;
			Stuent_Avg = 0;
		}
		System.out.println("------------------------------------------");
		
		
		
		
		
		
		
		///////////////////일반for문////////////////////////////
		
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
	
				
		System.out.print("국어\t 영어\t 수학\t 총점\t 평균\n");
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
