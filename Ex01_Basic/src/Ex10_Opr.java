
public class Ex10_Opr {
	public static void main(String[] args) {
		//if  ���� : 3���� 
		int count=0;
		if(count < 1){
			System.out.println("True �氡");
		}
		
		if(count < 1)System.out.println("����ǥ��"); //��� {}����

		//��� (�ݺ��� : for�� , while�� , do~ while��)
		
		//1~100������ ���� ���ϼ���
		int sum=0;
		for(int i = 1 ; i <= 100; i++){
			//System.out.println(i);
			//int sum =0;
			//sum = sum + i;
			//System.out.println(sum);
			//sum = sum+i;
			sum+=i;
		}
		System.out.println("1~100������ �� : " + sum);
		
		int sum2 = 0;
		for(int i = 1 ; i <= 100 ; i+=2){ //i = i + 2;(��)
			//System.out.println(i);
			sum2+=i; //sum2 = sum2 + i
		}
		System.out.println("1~100������ Ȧ���� �� :" + sum2);
		
		//1~100������ ¦���� �� 
		//for �ȿ��� if Ȱ���ؼ� 
		int sum3 = 0;
		//int i = 0;
		for(int i=1; i <= 100 ;i++){
			if(i % 2 == 0){
				sum3+=i;
			}
		}
		System.out.println("¦���� ��: " + sum3);
		//System.out.println(i);
		
		//key point (��ø for�� : ������) �ϱ����� ~~~~~~~******
		//������� ��
		//2�� ~ 9��
		//2�� (1~9)
		for(int i =2 ; i <= 9 ; i++){
			for(int j=1 ; j <= 9 ; j++){
				//System.out.println(i + "*" + j + "=" + i*j);
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		//key point (for  ��ģ : continue , break)
		//continue (���� ���� skip �ؼ� ���� ��� for�� ����)
		//break (Ż���ض� for����)
		System.out.println();
		for(int i=2; i<=9 ; i++){
			for(int j=1 ; j<=9 ;j++){
				if(i==j){ //if(i==j)break;
					break;
				}
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		for(int i=2; i<=9 ; i++){
			for(int j=1 ; j<=9 ;j++){
				if(i==j){ //if(i==j)break;
					continue;
				}
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=2; i<=9 ; i++){
			for(int j=1 ; j<=9 ;j++){
				if(i==j)break;
				System.out.print("*");
			}
			System.out.println();
		}
		//ī�� ���� ���� (����� ���� : ���� 3��)
		//�ڵ� ����
		
		//key point for(����)
		for(int i =2 ; i <= 9 ; i++){
			for(int j =1 ; j<i ; j++){ //���ǽ� : j<=9 => j<i
				System.out.print("*");
			}
			System.out.println();
		}
		
		//�ʱⰪ�� �ִ밪����
		for(int i =100 ; i >=0 ; i--){
			System.out.println(i);
		}
		
		//���߿� (�Ǻ���ġ ����)
		int a=0 , b=1 , c=0;
		for(int i = 0; i < 10 ;i++){
			a = b;
			b = c;
			c = a + b;
			System.out.println(" " + c);
		}
		
	}

}
