import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//문자 다룰떄도 Buffer (I/O) 성능
//buffer 장점 : Line() 단위 처리 가능
public class Ex08_Reader_Writer_Buffer {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try{
				fr = new FileReader("Ex01_Stream.java");
				br = new BufferedReader(fr);
				String line="";
				for(int i = 0 ; (line = br.readLine()) != null ; i++){
					//System.out.println(line);
					//QUIZ (;) 세미콜론이 있는 문장만 출력하세요
					if(line.indexOf(";") != -1){
						System.out.println(line);
					}
				}
				
		}catch(Exception e){
			
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
