import java.io.File;

public class Ex10_File {

	public static void main(String[] args) {
		//System.out.println(args[0] + "/" + args[1]);
		if(args.length !=1){
			System.out.println("사용법 : java파일명 [디렉토리명]");
			System.exit(0);
		}
		//java Ex10_File C:\\Temp  > args[0]
		File f = new File(args[0]);
		if(!f.exists() || !f.isDirectory()){ //존재하지 않거나 디렉토리 아닌경우
			System.out.println("유효하지 않은 디렉토리 입니다");
			System.exit(0);
		}
		
		//존재하는 폴더인 경우
		File[] files = f.listFiles(); //파일 , 디렉토리
		for(int i = 0 ; i < files.length ; i++){
			String name = files[i].getName(); //파일명 , 폴더명
			System.out.println(files[i].isDirectory() ? "DIR:"+name :name );
		}
	}

}
