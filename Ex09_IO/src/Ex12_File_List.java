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
			System.out.println("사용법 : [java파일명] [디렉토리경로]");
			System.out.println("예시    : Ex12_File_List C:\\Temp");
			System.exit(0); //프로세스 종료
		}
		
		File f = new File(args[0]); //C:\\temp
		if(!f.exists() || !f.isDirectory()){
			System.out.println("유효하지 않은 디렉토리 입니다");
			System.exit(0);
		}
		//정상적인 경로에 폴더 
		PrintFileList(f);
		System.out.println("총 파일수 : " + totalfiles);
		System.out.println("총 폴더수 : " + totaldirs);

	}
	static void PrintFileList(File dir){
		System.out.println("[FULL PATH :" +  dir.getAbsolutePath()  + "]");
		//하위 폴더
		ArrayList<Integer> subDir = new ArrayList<Integer>();
		File[] files = dir.listFiles(); //C:\\Temp 안에 File , Directory 정보
		
		//Temp > aaa   [0]
		//       a.txt [1]
		//       bbb   [2] 
		//       c.jpg [3] 
		
		
		for(int i = 0 ; i< files.length ; i++){
			String filename = files[i].getName(); //파일명 , 폴더명
			if(files[i].isDirectory()){
				filename = "<DIR>["+ filename +"]";
				subDir.add(i); //폴더인경우만 add
				//[0][3][4][7][10]
			}else{
				filename = filename + " / " + files[i].length() + "Byte";
				
			}
			System.out.println("  " + filename);
		}
		int DirNum = subDir.size(); //디렉토리 개수
		int FileNum = files.length - DirNum;
		
		//누적값
		totaldirs += DirNum;
		totalfiles += FileNum;
		///////
		System.out.println("[Current DirNum ] : " + DirNum);
		System.out.println("[Current FileNum] : " + FileNum);
		System.out.println("*******************************");
		
		
		////["0"]["3"]["4"]["7"]["10"]
		for(int j = 0 ; j < subDir.size();j++){
			int index = subDir.get(j);
			PrintFileList(files[index]); //aaa   , bbb  (재귀호출) 하위폴더
		}
		
		
		
		
		
	}

}
