import java.io.*;
import javax.sound.sampled.*;

/*
 * 1조 디자인 패턴 : 싱글턴
 * 
 * SoundManager 클래스 
 * 사운드 객체  play 및   stop시  제어 
 * 
 * */
public class SoundManager 
{
	private static SoundManager Instance;
	private SoundManager(){}
	
	public static SoundManager getInstance() 
	{
		if(Instance == null) {
			Instance = new SoundManager();
		}
		return Instance;
	}
	private int soundOupputCount = 0;
	private Clip audioClip;
	
	public int getSoundOupputCount ()
	{
		return soundOupputCount;
	}

	public void setSoundOupputCount (int soundOupputCount)
	{
		this.soundOupputCount = soundOupputCount;
	}

	public void CountEdit ( int editNum)
	{
		editNum = editNum* 1;
		soundOupputCount += editNum;
	}
	
	public String currentSound = "";
	
	public enum PIANO
	{
		DO(49),
		RE(50),
		MI(51),
		FA(51),
		SOL(52),
		RA(53),
		SI(54),
		DO_S(55),
		COUNT(10);
		
		private final int value;
		PIANO(int value)
		{
			this.value = value;
		}
	}
	
	
	
	public static String GetPianoStick(int keyCode)
	{
		PIANO piano = PIANO.COUNT;
		switch (keyCode)
		{
			case 49:piano = PIANO.DO;break;
			case 50:piano = PIANO.RE;break;
			case 51:piano = PIANO.MI;break;
			case 52:piano = PIANO.FA;break;
			case 53:piano = PIANO.SOL;break;
			case 54:piano = PIANO.RA;break;
			case 55:piano = PIANO.SI;break;
			case 56:piano = PIANO.DO_S;break;
		}

		return  piano.toString();
	}
	
	public void SoundKeyboard(int keyCode)
	{
		currentSound = GetPianoStick(keyCode);
		soundOupputCount++;
		load (currentSound);
	} 

	public void load(String audioName)
	{	
		String audioFilePath = "sound\\"+audioName+".wav";
		if( audioClip != null )
		{
			audioClip.stop ();
			audioClip.close();
		}
		
		File audioFile = new File(audioFilePath);
		try {
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			AudioFormat format = audioStream.getFormat();
			DataLine.Info info = new DataLine.Info(Clip.class, format);
			audioClip = (Clip) AudioSystem.getLine(info);
			//audioClip.addLineListener(this);
			audioClip.open(audioStream);
			audioClip.start ();
		} catch (Exception e) {
			System.out.println ("없는 사운드입니다."+e.getMessage());
		} 
	}


}
