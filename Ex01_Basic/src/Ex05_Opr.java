//������
public class Ex05_Opr {
	public static void main(String[] args) {
		//���(  % ������)
		int result = 100/100;
		System.out.println(result);
		result = 13/2;
		System.out.println(result);
		result = 13%2;
		System.out.println(result);
		
		//������(++ , --) 1�� ������
		int i = 10;
		++i; //��ġ ����
		System.out.println("++i : " + i);
		i++; //��ġ ����
		System.out.println("i++ : " + i);
		--i;
		System.out.println("--i : " + i);
		
		//��ġ ��ġ ������ �ٸ� �İ� ���� ���
		int i2 = 5;
		int j2 = 6;
		
		int result2 = i2 + ++j2;
		System.out.println(result2); //j2=>7
		
		result2 = i2 + j2++;
		System.out.println("result2 :" + result2);
		System.out.println("j2 :" + j2);
		
		result2 = ++i2 + j2++;
		System.out.println("result2 :" + result2);
		System.out.println("j2 :" + j2);
		
		//Today point
		//�ڹٿ��� ���� ��Ģ
		//������ ��� [����]�� int ��ȯ�� ó��
		//byte + byte => int + int
		
		byte b = 100;
		byte c = 1;
		//byte result3 = b + c;
		//1. ��� int
		//2. (b+c) ��� int > (byte)(b+c)
		byte result3 = (byte)(b + c);
		System.out.println("result3 : " + result3);
		
		//byte + short => int + int
		//char + char  => int + int
		
		//�Ǽ�(���� �� �Ǽ� ���� : �Ǽ�)
		//float + int = float + float
		//float + long = float + float
		//float + double = double + double
		
		float num2 = 10.3f;
		int num3 =20;
		//int num4 = num2 + num3;
		//1. num4 > float
		//2. ��� casting 
		int num4 = (int)(num2 + num3); //������ �ս�
		System.out.println("num4 : " + num4);
		
		char c2 = 'A'; //char �ƽ�Ű �ڵ�ǥ 10���� 65
		char c3 = 'A';
		//char result5 = c2 + c3;
		int result5 = c2 + c3;
		System.out.println(result5);
		char result6 = (char)result5;
		System.out.println(result6);
		
		//�߼ұ�� (������)
		//1-10������ ������ ¦���� �ո� ����ϼ���
		int sum = 0; //�������� �ʱ�ȭ
		for(int j = 1 ; j <= 10 ; j++){
			//int sum = 0; //scope (for ����)
			//sum = sum + j;
			if(j%2==0){
				//sum = sum + j;
				sum+=j;
			}
		}
		System.out.println("1~10���� ¦�� �� : " + sum);
		
		//== ���� �� 
		if(10 == 10.0f){
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE");
		}
		
		//! ���� ������
		if('A' != 65){ //���� �ʴ�
			System.out.println("���� �ʾƿ�");
		}else{
			System.out.println("���ƿ�");
		}
		
		//Point �ϱ�(���� ������)
		int p = 10;
		int k = -10;
		int result7= (p==10) ? p : k;
		// ? �տ� ���ǽ��� True ��  : �տ� ���� ���ϰ�
		// ? �տ� ���ǽ��� Flase �� : �ڿ� ���� ���Ѵ�
		System.out.println(result7);
		
		/*
		 if(p == 10){
		 	result7 = p;
		 }else{
		 	result7 = k;
		 }
		  
		  
		 ����ǥ
		          OR     ,    AND
		 0  0      0           0 
		 0  1      1           0
		 1  0      1           0
		 1  1      1           1  
		 
		//0 : false
		//1 : true 
		
		select *
		from emp
		where empno=1000 and sal > 100  �ΰ��� ��� ����
		  
		select *
		from emp
		where empno=1000 or sal > 100  ���߿� �ϳ��� ����
		  
		*/
		int x = 3;
		int y = 5;
		
		//������
		// | or ������
		// & and  ������
		// bit
		System.out.println(x|y);
		//������
		// 256  128  64  32  16  8  4  2  1
		//                       0  0  1  1 3�� ������
		//                       0  1  0  1
		//OR                     0  1  1  1  (1 + 2 + 4)
		//AND                    0  0  0  1  (1)
		System.out.println(x&y);
		
		
		//�ϱ� (Point) && (and) , || (or) > ������
		//���ǹ� ....
		//if(10 > 0 && -1 > 1 && 100 > 2 && 1 >-1 && ....)
		//-1 > 1 �ι�° ������ false  && > ��ü false
		//if(10 > 0 || -1 > 1 || 100 > 2 || 1 >-1 || ....)
		
	}

}
