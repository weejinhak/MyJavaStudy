
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IOFIle{

	public static ArrayList<String> GetWordData (String txtName)
	{
		ArrayList<String> SheetMusicList = new ArrayList<>();
		
		try {
			BufferedReader in = new BufferedReader (new FileReader (txtName+".txt"));
			String str = null;
			
			try {
				while ( (str = in.readLine()) != null) 
				{
					String[] tempArr = str.split(",");
					for( int i=0; i<tempArr.length; i++)
					{
						if(!tempArr[i].isEmpty())SheetMusicList.add (tempArr[i]);
					}
				}
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return SheetMusicList;
	}
}
