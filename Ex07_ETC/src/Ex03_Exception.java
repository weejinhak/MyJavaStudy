import java.io.IOException;

//���� CD ��ġ
//�ӽ����� (CD copy)
//�ν���
//�ӽ����� ����

//�ν��� ���߿� ���� > �ӽ����� ����
//�ν��� ����        > �ӽ����� ����

//try{} catch(Exception e) {} finally{ ���� ���� ��}
public class Ex03_Exception {
	
	static void StartInstall(){
		System.out.println("install");
	}
	static void CopyFiles(){
		System.out.println("copy file");
	}
	static void DeleteFiles(){
		System.out.println("delete file");
	}
	
	public static void main(String[] args) {
		try{
			StartInstall();
			CopyFiles();
			
			//����� ���� ������ (���� ��ü�� ���� ����)
			IOException e = new IOException("Copy ����");
			throw e; //���� ���� ������ (�����)
			
		}catch(Exception e){
			System.out.println("���� ������ : " + e.getMessage());
		}finally{
			//���� ����  (return .. ) 
			DeleteFiles();
		}
		
	}

}
