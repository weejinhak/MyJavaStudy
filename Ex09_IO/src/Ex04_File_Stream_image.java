import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex04_File_Stream_image {

	public static void main(String[] args) throws Exception {
	  String orifile = "C:\\Users\\Public\\Pictures\\Sample Pictures\\c.jpg";
	  String targetfile = "C:\\Temp\\new.jpg";
	  
	  FileInputStream fis = new FileInputStream(orifile);
	  FileOutputStream fos = new FileOutputStream(targetfile); //생성
	  
	  int readByteno;
	  byte[] readBytes = new byte[1024]; //1kb 
	  while((readByteno = fis.read(readBytes)) != -1){
		  System.out.println(readByteno);
		  fos.write(readBytes,0,readByteno);
	  }
	  
	  fis.close();
	  fos.close();
	  
	  
	  System.out.println("완료");
	  
	}

}
