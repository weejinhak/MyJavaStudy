import java.io.File;
import java.util.ArrayList;

public class Ex12_File_List {
	static int totalfiles =0;
	static int totaldirs =0;
	
	public static void main(String[] args) {
		//cmd
		//java Ex12_File_List aaa
		//args[0] > aaa
		//java Ex12_File_List aaa bbb ccc
		//args[0] > aaa , args[1] > bbb , args[2] > ccc
		
		if(args.length != 1){
			System.out.println("���� : [java���ϸ�] [���丮���]");
			System.out.println("����    : Ex12_File_List C:\\Temp");
			System.exit(0); //���μ��� ����
		}
		
		File f = new File(args[0]); //C:\\temp
		if(!f.exists() || !f.isDirectory()){
			System.out.println("��ȿ���� ���� ���丮 �Դϴ�");
			System.exit(0);
		}
		//�������� ��ο� ���� 
		PrintFileList(f);
		System.out.println("�� ���ϼ� : " + totalfiles);
		System.out.println("�� ������ : " + totaldirs);

	}
	static void PrintFileList(File dir){
		System.out.println("[FULL PATH :" +  dir.getAbsolutePath()  + "]");
		//���� ����
		ArrayList<Integer> subDir = new ArrayList<Integer>();
		File[] files = dir.listFiles(); //C:\\Temp �ȿ� File , Directory ����
		
		//Temp > aaa   [0]
		//       a.txt [1]
		//       bbb   [2] 
		//       c.jpg [3] 
		
		
		for(int i = 0 ; i< files.length ; i++){
			String filename = files[i].getName(); //���ϸ� , ������
			if(files[i].isDirectory()){
				filename = "<DIR>["+ filename +"]";
				subDir.add(i); //�����ΰ�츸 add
				//[0][3][4][7][10]
			}else{
				filename = filename + " / " + files[i].length() + "Byte";
				
			}
			System.out.println("  " + filename);
		}
		int DirNum = subDir.size(); //���丮 ����
		int FileNum = files.length - DirNum;
		
		//������
		totaldirs += DirNum;
		totalfiles += FileNum;
		///////
		System.out.println("[Current DirNum ] : " + DirNum);
		System.out.println("[Current FileNum] : " + FileNum);
		System.out.println("*******************************");
		
		
		////["0"]["3"]["4"]["7"]["10"]
		for(int j = 0 ; j < subDir.size();j++){
			int index = subDir.get(j);
			PrintFileList(files[index]); //aaa   , bbb  (���ȣ��) ��������
		}
		
		
		
		
		
	}

}
