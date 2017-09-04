import java.util.ArrayList;

import kr.or.kosta.Emp;

//��ü���� > ��ü (memory) 
public class Ex04_ArrayList_Object_keyPoint {

	public static void main(String[] args) {
		//Emp ��� Ÿ���� ������ ��� 1���� ���弼��
		Emp e = new Emp(1000,"ȫ�浿","IT");
		System.out.println(e.toString());
		
		//�迭(Array) 2��
		Emp[] elist = {new Emp(100,"�达","SALES"),
					   new Emp(200,"�ھ�","IT")
		              };
		for(Emp emp : elist){
			System.out.println(emp.toString());
		}
		//elist[0]
		////////////////������� ����///////////////
		//ArrayList ����
		ArrayList emplist = new ArrayList();
		emplist.add(new Emp(500,"�̾�","Manager"));
		emplist.add(new Emp(600,"ȫ��","Sales"));
		emplist.add(new Emp(700,"����","IT"));
		
		//for���� ���ؼ� (toString()) ������� ����
		//��� , �̸� , ���� ����ϼ���
		
		//hint
		//[0] �迭�� �ִ� ����� ����ϼ��� get�Լ�
		//Emp m = (Emp)emplist.get(0);
		//System.out.println(m.toString());
		for(int i = 0 ; i < emplist.size() ; i++){
			System.out.println(((Emp)emplist.get(i)).getEmpno() + "/ " + 
								((Emp)emplist.get(i)).getEname() + "/ " +
								((Emp)emplist.get(i)).getJob()
					           ); //getter //emplist.get(i) return object
		}
		//������ for
		for(Object obj : emplist){
			Emp m = (Emp)obj;
			System.out.println(m.getEmpno() +":"+m.getEname() +":" + m.getJob() );
		}
		
		//�����ؿ� �Ⱦ��� �;��
		//generic Ÿ�� ���� (100 %)
		ArrayList<Emp> emplist2 = new ArrayList<Emp>();
		emplist2.add(new Emp(1,"A","AA"));
		emplist2.add(new Emp(2,"B","BB"));
		emplist2.add(new Emp(3,"C","CC"));
		
		for(Emp obj : emplist2){
			System.out.println(obj.getEmpno() + "," + obj.getEname());
		}
	}

}




