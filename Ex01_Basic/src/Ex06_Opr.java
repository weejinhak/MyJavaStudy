
public class Ex06_Opr {

	public static void main(String[] args) {
		int sum=0; //local variable (�ʱ�ȭ)
		//sum = sum + 1;
		//���� : += , -= , *= ,/=
		sum+=1; //sum = sum + 1
		sum-=1; //sum = sum - 1
		
		//�̻� , ���� (= ����)
		//�ʰ� , �̸� 
		
		//������ ���� ����
		//������ 90 �� �̻��̸� A ������ ���� �ο��ϰ�
		//�ο��� ������ 95�̻��̸� A+
		//�׳������� A-�� �ο��ϼ���
		
		//������ 80 �� �̻��̸� B������ ���� �ο��ϰ�
		//�ο��� ������ 85�̻��̸� B+
		//�׳������� B-�� �ο��ϼ���
		
		int score = 83; //��������
		String grade=""; //���ڿ� �ʱ�ȭ
		System.out.println("����� ������:" + score);
		
		if(score >= 90){
			grade="A";
			if(score >= 95){
				//grade = grade + "+";
				grade+="+";
			}else{
				grade+="-";
			}
		}else if(score >= 80){
			grade="B";
			if(score >= 85){
				grade += "+";
			}else{
				grade += "-";
			}
		}else{
			grade="F";
		}
		
		System.out.println("����� ������ "  + grade) ;

	
	
	}

}
