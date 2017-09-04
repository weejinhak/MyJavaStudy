import java.util.Calendar;
import java.util.Date;

import kr.or.kosta.utils.Kosta_Date;

/*
 * Calendar �� ��ӹ޾� ������ ������ Ŭ������ 
 * GregorianCalendar
   buddhisCalendar �ִµ� getInstance()�� [�ý����� ������ ��������]�� [Ȯ��]�ؼ�
   �±��� ��� buddhisCalendar �� �ν��Ͻ��� ��ȯ�ϰ� �� �ܿ��� GregorianCalendar
   �� �ν��Ͻ��� ��ȯ�Ѵ�
   GregorianCalendar �� Calendar�� ��ӹ޾� ���ó� ������ �������� ����ϰ� �ִ� 
   �׷����¿� �°� ������ ������ �±��� ������ ������ ���������� GregorianCalendar ���
   �׷��� �ν��Ͻ��� ���� �����ؼ� ������� �ʰ� �޼��带 ���ؼ� �ν��Ͻ��� ��ȯ�ް��ϴ�
   ������ �ּ��� �������� ���α׷� ������ �ϵ��� �ϱ� ����
   class MyApp{
     static void main(){
      	Calendar cal = new GregorianCalendar();
      	�ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����......    }  }
  
   class MyApp{
     static void main(){
      Calendar cal = new getInstance();
        �ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����......   }  }
  API :������ Protected Calendar() 
 */
//JAva API
//��¥ : Date (��) -> Calendar(��)
public class Ex08_Calendar {
	public static void main(String[] args) {
	   
		Date dt = new Date();
		System.out.println(dt);
		
	    Calendar today =Calendar.getInstance();
	    System.out.println(today);
	    
	    //���(������)
	   System.out.println("�⵵ : " + today.get(Calendar.YEAR));
	   System.out.println("��(0~11) : " + (today.get(Calendar.MONTH)+1));
	   System.out.println("�� : " + today.get(Calendar.DATE));
	   /////////////////////////////////////////////////
	   System.out.println("�� ���� ��° �� : " + today.get(Calendar.WEEK_OF_MONTH));
	   System.out.println(today.get(Calendar.DAY_OF_MONTH));
	   System.out.println(today.get(Calendar.DAY_OF_WEEK)); 
	   
	   //�� , ��  , ��
	   //���� , ����
	   System.out.println("��: " + today.get(Calendar.HOUR)); 
	   System.out.println("��: " + today.get(Calendar.MINUTE)); 
	   System.out.println("��: " + today.get(Calendar.SECOND)); 
	   System.out.println("���� ����: " + today.get(Calendar.AM_PM)); 
	   //0 ���� , 1 ����
	   
	   //��� �ý��� ��¥
	   //�� �������� ��¥ 100�� 
	   //������ �ΰ� (��¥ , ���� ) �׳� ....
	   //2017��02��16�� -> 2017/02/16
	   //������ Ŭ�������� �Լ��� ���� 
	   //�� ���������� �Լ� ȣ��
	   
	   System.out.println(Kosta_Date.DateString(Calendar.getInstance()));
	   System.out.println(Kosta_Date.DateString(Calendar.getInstance(),"/"));
	   System.out.println(Kosta_Date.MonthFormat_DateString(Calendar.getInstance()));
	}

}
