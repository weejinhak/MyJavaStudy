import java.util.Scanner;

//��� : while , do~while()
public class Ex11_Opr {
	public static void main(String[] args) {
		
		int i = 10;
		while(i>=10){ //���ǽ� true ���� , false Ż��
			System.out.println("i :" + i);
			//���ʿ� ������ ����� ����
			i--;
		}
		//1~100������ �� ���
		int sum=0;
		int j = 0;
		while(j <= 100){
			sum+=j;
			j++;
			//System.out.println(j);
		}
		System.out.println("while sum : " + sum);
		
		//while �� ����ؼ� ������ ���
		int k = 2;
		int p = 1;
		while(k <= 9){
			p = 1; //p���� 1�� �ʱ�ȭ
			//int p = 1;
			while(p <=9){
				System.out.printf("[%d]*[%d]=[%d]\n",k,p,k*p);
				p++;
			}
			k++;
		}
		
		//do{ ���๮ }while(���ǽ�) : ������ ���౸��
		//�޴�����
		//1. �λ�
		//2. �޿�
		
		Scanner sc = new Scanner(System.in);
		int inputdata=0;
		do{
			System.out.print("�����Է�:");
			inputdata = Integer.parseInt(sc.nextLine());
		}while(inputdata > 10); //10���� ū ���� ���� do������
		                        //while ���ǽ� true do ���� ����
		System.out.println("����� �Է��� ���ڴ� :" + inputdata);
	}

}
