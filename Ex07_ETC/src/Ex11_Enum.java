import java.awt.Color;

//������ (Ÿ��)
//�ǹ��ִ� ������ ���� 
//class Cla { public static final int NUM=0; 
//            public static final int MONDAY=1;
//           }

//���� : ����ڰ� ������ ����� �������� ������� ���� �� �ִ� Ÿ��

//enum ������ �̸� {��� ��� ����Ʈ}
//public enum Season {SRPING, SUMMER , FALL ,WINTER}
//{�ڿ��� ��� ���������� 0 ���� 1������ ������ }

//�������� �ƴ϶� ����� �־�� > Interface ��� ���� 

//�������� ������ �ڵ��� ������ 
//����Ÿ�� (Ŭ���� , Ŭ���� �ȿ���)
//��������  Ÿ�Դϴ� 

enum Season {SPRING ,SUMMER , FALL , WINTER} //static final
//interface season{public static final SPRING =0;}

public class Ex11_Enum {
	public static void main(String[] args) {
		Season s  = Season.SPRING;
		System.out.println(s);
		for(Season s2 : Season.values()){
			System.out.println(s2.name() + " /" + s2.ordinal());
		}
		
		//Color.blue  �ý��� ���� Ÿ��
	}

}
