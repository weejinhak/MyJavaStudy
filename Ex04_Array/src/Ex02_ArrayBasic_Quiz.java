
public class Ex02_ArrayBasic_Quiz {
	public static void main(String[] args) {
		//수학과 학생들 기말고사 시험 점수
		int[] score = new int[]{79,88,97,54,56,95};
		int max = score[0]; //79
		int min = score[0]; //79
		
		//문제 (for ,if)을 활용해서
		//max 변수에 최대값 : 97
		//min 변수에 최소값 : 54 제어문을 완성하세요
		for(int i = 0 ; i < score.length ; i++){
			//if(score[i] > max){max = score[i];} 
			//if(score[i] < min){min = score[i];}
			//처음 하시는 분
			
			max = (score[i] > max) ? score[i] : max;
			min = (score[i] < min) ? score[i] : min;
		}
		System.out.println("max value : " + max);
		System.out.println("min value : " + min);

		int[] number = new int[10];
		//for문 사용해서 10개의값을 1~10까지의 값으로 초기화
		//[0]=1 , [9]=10
		for(int i = 0 ; i < number.length ; i++){
			number[i] = i+1;
		}
		for(int i = 0 ; i < number.length ; i++){
			System.out.println(number[i]);
		}
		//Quiz (학생의 국어 점수)
		int sum =0;
		float average = 0f;
		int[] jumsu = {100,55,90,60,78};
		//1.총학생수
		//2.국어점수의 합
		//3.국어점수의 평균을 구하세요  (2,3번 하나의 for에서)
		for(int i = 0 ; i < jumsu.length ; i++){
			sum+=jumsu[i];
			if(i == jumsu.length-1){
				average = sum / (float)jumsu.length;
			}
		}
		System.out.printf("총인원:%d, 총점:%d ,평균:%f"
				         ,jumsu.length , sum , average);
		
		
	}

}
