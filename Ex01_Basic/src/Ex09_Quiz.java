import java.util.Scanner;

public class Ex09_Quiz {

	public static void main(String[] args) {
		/*
			������ ��Ģ ����� (+ , - , * , /)
			�Է°� 3��
			ó���Է°� : ���� (ex:10)
			�ι�° �Է°� : �����ȣ (ex: + )
			����° �Է°� : ���� 
			������ ����� prinf() ����ؼ� ���
            
           *�Է°��� : nextline() ���� > �ʿ�� ��ȯ 
            �����Է�:10 enter
            ��ȣ�Է�: + enter  > String opr ="+"
            �����Է�:100 enter
            ���:10+100=110 ���
            
           hint) if�� ��� else if() 
           hint) (x) if(opr == "+"){ ���ϱ� ���� }
           hint) (x) if(opr.equals("+")){ ���ϱ� ���� }  
		
		
		*/
		  String op=""; //�ʱ�ȭ
		  int input_1=0;
		  int input_2=0;
		  
		  Scanner sc = new Scanner(System.in);
		  
		  	  
		  System.out.print("�Է°�_1(����) : ");
		  input_1 = Integer.parseInt(sc.nextLine());
		  
		  System.out.print("������(+,-,*,/) : ");
		  op = sc.nextLine();
		  
		  System.out.print("�Է°�_2(����) : ");
		  input_2 = Integer.parseInt(sc.nextLine());
		  
		  //System.out.printf("%d , %s , %d",input_1,op,input_2);
		  
		  //key point : ���ڿ��� �� (== �ȵǿ� : ����)
		  //            ���ڿ��� ��(equals ���)
		  int result = 0;
		  if(op.equals("+")){
			  result = input_1 + input_2;
		  }else if(op.equals("-")){
  		      result = input_1 - input_2;
		  }else if(op.equals("*")){
  		      result = input_1 * input_2;
		  }else if(op.equals("/")){
		     result = input_1 / input_2;
		  }else{
		    System.out.println("�������� �ʴ� �������Դϴ�");
		    //key point
		    //**[�Լ������� ���� : ������(main �� ���� ������) > ���α׷� ����
		    return; 
		  }
		  System.out.printf("[%d].....[%s][%d]=[%d]",input_1,op,input_2,result);
	}

 }
