import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex11_File_Format {
	public static void main(String[] args) {
		File dir = new File(args[0]); //파일또는 폴더 경로
		File[] files = dir.listFiles();
		//files[0] = a.txt , files[1] = kglim 
		for(int i = 0 ; i < files.length ; i++){
			File file = files[i];
			String name = file.getName();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH-mma");
			String attribute="";
			String size="";
			
			if(files[i].isDirectory()){
				attribute="<DIR>";
			}else{
				//파일인 경우 (a.txt , b.jpg)
				size = file.length() + "Byte";
				attribute = file.canRead() ? "R" :"";
				attribute += file.canWrite() ? "W" : "";
				attribute += file.isHidden() ? "H" : "";
			}
			System.out.printf("%s  %3s %10s %s \n", 
					           df.format(new Date(file.lastModified())),
					           attribute,
					           size,
					           name
					         );
		}
	}

}
