import java.util.ArrayList;
import java.util.Iterator;

import kr.or.kosta.CopyEmp;
import kr.or.kosta.Emp;

public class Ex09_Generic_Quiz {

	public static void main(String[] args) {
	
		
		//1. Emp Ŭ������ ����ؼ� ��� 3���� ����
		//������ ArrayList<T> ��� ����ϼ���
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		emplist.add(new Emp(1000,"�达","�븮"));
		emplist.add(new Emp(2000,"�ھ�","����"));
		emplist.add(new Emp(3000,"ȫ��","����"));
		
		
		//2.����� ����(��� , �̸� , ����) ������ for�� ���
		//�� toString �� ������� ������
		for(Emp e : emplist){
			System.out.println(e.getEmpno() + "/" + e.getEname() + "/" +e.getJob());
		}
		
		//2.1 �Ϲ� for������ ���
		for(int i = 0 ; i < emplist.size() ; i++){
			 Emp e = emplist.get(i); 
			 System.out.println(e.getEmpno() +"-"+ e.getEname() +"-" + e.getJob());
		}
		
		
		
		
		//3.Emp Ŭ������ ���� ������ ���� CopyEmp Ŭ����
		//�� kr.or.kosta �ȿ��� �����ϼ���
		//sal �޿� (int) �޿� member field �߰� setter , getter
		//�����ڿ����� ���� �Է¹޵��� ����
		
		//100,"��",1000
		//200,"��",2000
		//300,"��",3000
		ArrayList<CopyEmp> copylist = new ArrayList<CopyEmp>();
		copylist.add(new CopyEmp(100, "��", 1000));
		copylist.add(new CopyEmp(200, "��", 2000));
		copylist.add(new CopyEmp(300, "��", 3000));
		
		//������ �Է�
		//3.1 200�� ����� �޿��� 5000 ���� �λ��ؼ� ���
		System.out.println("----------------------------------");
		for(CopyEmp e : copylist){
			if(e.getEmpno() == 200){
				e.setSal(5000);
				System.out.println(e.toString());
				//System.out.println(e.getEmpno() + " : " + (e.getSal() + 3000));
			}
		}
		//3.2 300�� ����� �̸��� "�ñ���" �� �����ؼ� ���
		for(CopyEmp e : copylist){
			if(e.getEname().equals("��")){
				e.setEname("�ñ���");
				System.out.println(e.toString());
			}
		}
		
       //4.��������� Iterator �� ����ؼ� ����ϼ���
		System.out.println("****************************");
		Iterator<Emp> elist = emplist.iterator();
		while(elist.hasNext()){
			//System.out.println(elist.next().getEmpno());
			//System.out.println(elist.next().getEname());
			//System.out.println(elist.next().getJob());
			
			
			//1. Emp e = elist.next();
			//   e.getEmpno .....
			System.out.println(elist.next().toString());
		}
		
	}

}
