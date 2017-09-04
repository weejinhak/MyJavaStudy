/*
��� 
1. ���ǹ� : if , if~else , if~else if ~else if
            switch(){case ...} (����� ���� ���� ���)
            Tip) C# > select case 
2. �ݺ��� : ...
 
 */
public class Ex07_Opr {
	public static void main(String[] args) {
		int score = 60;
		switch (score) { // ���ǽ� �Ǵ� ���ǰ�
		case 100:
			System.out.println("100 :" + score);
			break;
		case 90:
			System.out.println("90 :" + score);
			break;
		case 80:
			System.out.println("80 :" + score);
			break;
		case 70:
			System.out.println("70 :" + score);
			break;
		case 60:
			System.out.println("60 :" + score);
			break;
		default:
			System.out.println("����ġ");
		}
		//�ҽ�����
		//Ctrl + A (��ü ��)
		//Ctrl + shift + F (�ڵ� �鿩���� ����)
		//switch(){
		//case 1 : ���๮;
		//   break;
		//}
		int data = 80;
		switch(data){
			case 100:System.out.println("100");
			case 90:System.out.println("90");
			case 80:System.out.println("80");
			case 70:System.out.println("70");
			case 60:System.out.println("60");
				  break;
			default : System.out.println("default");
		}
		
		//���� (������ : ������ ���Ⱚ)
		//Math ( import java.lang.Math ��Ģ )
		//default : java.lang Open ���� 
		//random()
		//Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.random()*10 : " + Math.random()*10);
		
		//0~9 ������ ���� �� 
		System.out.println("(int)(Math.random()*10): " + (int)(Math.random()*10));
	
	    //1~10 ������ ���� 
		System.out.println("((int)(Math.random()*10) + 1): " + ((int)(Math.random()*10) + 1));
	
		//�ó�����
		//�� �ý����� ��ȭ�� ��ǰ ��÷ �ý����̴�
		//��ǰ ��÷�� 1000 ������ ������
		//��ǰ���� Tv, NoteBook , ����� , �ѿ� , ���� 
		//��ǰ ��÷�� 900 ������ ������
		//��ǰ���� NoteBook , ����� , �ѿ� , ����
		//��ǰ ��÷�� 800 ������ ������
		//��ǰ���� ����� , �ѿ� , ����
		//��ǰ ��÷�� 700 ������ ������
		//��ǰ���� �ѿ� , ����
		//��ǰ ��÷�� 600 ������ ������
		//��ǰ���� ����
		//�׿� ������ �縻
		
		//��� (switch~ , Math.Random() (100~1000))
		int jumsu = (int)(Math.random()*10) + 1;
		System.out.println("��÷��ȣ : " + jumsu);
		String msg=""; //�ʱ�ȭ
		jumsu*=100;
		msg="������ ������ :" + jumsu + "�̰� ��ǰ�� : ";
		switch (jumsu) {
			case 1000:msg+="Tv ";
			case 900:msg+="NoteBook ";
			case 800:msg+="����� ";
			case 700:msg+="�ѿ� ";
			case 600:msg+="���� ";
			 break;
			default :msg+="�縻";
		}
		System.out.println(msg);
	}

}
