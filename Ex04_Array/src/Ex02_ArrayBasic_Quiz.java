
public class Ex02_ArrayBasic_Quiz {
	public static void main(String[] args) {
		//���а� �л��� �⸻��� ���� ����
		int[] score = new int[]{79,88,97,54,56,95};
		int max = score[0]; //79
		int min = score[0]; //79
		
		//���� (for ,if)�� Ȱ���ؼ�
		//max ������ �ִ밪 : 97
		//min ������ �ּҰ� : 54 ����� �ϼ��ϼ���
		for(int i = 0 ; i < score.length ; i++){
			//if(score[i] > max){max = score[i];} 
			//if(score[i] < min){min = score[i];}
			//ó�� �Ͻô� ��
			
			max = (score[i] > max) ? score[i] : max;
			min = (score[i] < min) ? score[i] : min;
		}
		System.out.println("max value : " + max);
		System.out.println("min value : " + min);

		int[] number = new int[10];
		//for�� ����ؼ� 10���ǰ��� 1~10������ ������ �ʱ�ȭ
		//[0]=1 , [9]=10
		for(int i = 0 ; i < number.length ; i++){
			number[i] = i+1;
		}
		for(int i = 0 ; i < number.length ; i++){
			System.out.println(number[i]);
		}
		//Quiz (�л��� ���� ����)
		int sum =0;
		float average = 0f;
		int[] jumsu = {100,55,90,60,78};
		//1.���л���
		//2.���������� ��
		//3.���������� ����� ���ϼ���  (2,3�� �ϳ��� for����)
		for(int i = 0 ; i < jumsu.length ; i++){
			sum+=jumsu[i];
			if(i == jumsu.length-1){
				average = sum / (float)jumsu.length;
			}
		}
		System.out.printf("���ο�:%d, ����:%d ,���:%f"
				         ,jumsu.length , sum , average);
		
		
	}

}
