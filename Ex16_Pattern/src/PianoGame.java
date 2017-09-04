import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
/*
 * PianoGame : 	�ǾƳ� ���� ����Ŭ���� 
 * 			   	MenuSelect() - ùȭ�� ���� �� ������ �Ǻ�����
 * 				GameReady() - �Ǻ����ý� ����ȭ������ �̵�
 * 				GameStart() - �ΰ���ȭ�� ���� �� �����帧 ����
 * 				Add () / AllRemove() - PianoGUI���� ������ UI ����
 * 			    Init () - ���� �ʱ�ȭ
 */
//���ӻ���
enum GAME_STATE
{
	MENU,
	GAME,
	NONE,
}

public class PianoGame
{
	private final int SCORE = 10;
	private final int COUNT = 3;
	private int iScore = 0;
	private int iCount = 3;
	private Frame frame     				=null;
	private ArrayList<String> titleList	 	=null;
	private ArrayList<String> wordDataList 	=null;
	private ArrayList <Component> viewList 	=null;
	private GAME_STATE  currentGameState;
	private PianoGUI pianoGUI;
	
	
	PianoGame()
	{
		GUISetting ();
		titleList		= new ArrayList<>();
		wordDataList	= new ArrayList<>();
		viewList  		= new ArrayList<>();
	}
	
	private void GUISetting ()
	{
		frame = new Frame ();
		frame.setSize (700, 380);
		
		frame.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing (WindowEvent e)
			{
				super.windowClosing (e);
				e.getWindow().dispose ();
				System.exit (0);
			}
		});
	}
	
	public void GotoMenu ()
	{
		currentGameState = GAME_STATE.MENU;
		Init();
		State ();
	}
	
	
	private void MenuSelect ()
	{
		pianoGUI = new PianoGUI(this);
		pianoGUI.MenuUI ();
		
		titleList = IOFIle.GetWordData ("data\\title");
		for( int i=0; i<titleList.size(); i++)
		{
			Button btn = new Button (titleList.get (i));
			btn.setName (String.valueOf (i));
			btn.setSize (80,30);
			btn.setLocation (i*90+200, 150);
			pianoGUI.menuPanel.add (btn);
			btn.addActionListener(new ActionListener () {
				@Override
				public void actionPerformed(ActionEvent e) {
					SoundManager.getInstance ().load("button"); 
					GameReady (((Button)e.getSource()).getName() );
				}
			});
			
		}
		
		Add (pianoGUI.menuPanel);
		frame.setVisible (true);
	}
	
	private void GameReady(String selectStep)
	{
		int idx = Integer.parseInt(selectStep);
		wordDataList =IOFIle.GetWordData ( "data\\" + titleList.get (idx) );
		currentGameState = GAME_STATE.GAME;
		AllRemove();
		State();
	}
	

	private void State()
	{
		switch (currentGameState) 
		{
			case MENU:MenuSelect ();	break;
			case GAME:GameStart();	break;
		}
	}

	private void GameStart ()
	{
		pianoGUI.GameUI ();
		Add (pianoGUI.pianoStickPanel);
		Add (pianoGUI.GamePanel);
	}
	
	public boolean CorrectCheck()
	{
		int currentIdx = SoundManager.getInstance().getSoundOupputCount ();
	
		System.out.println("������� ��: "+wordDataList.get (currentIdx-1)+ " ���� ���� �� : "+SoundManager.getInstance ().currentSound);
		if( !wordDataList.get (currentIdx-1).equals (SoundManager.getInstance ().currentSound) )
		{
			--iCount;
			setScore(-1);
			SoundManager.getInstance ().CountEdit (-1);
			return false;
		}else{
			setScore(1);
			return true;
		}
	}
	
	public int getiCount() {
		return iCount;
	}

	public int getScore() {
		return this.iScore;
	}

	public void setScore(int score) {
		this.iScore += SCORE*score;
		if( this.iScore <= 0)
		{
			this.iScore = 0;
		}
	}

	public boolean GameEndCheck()
	{
		if( iCount == 0 )return true;
		
		int currentIdx = SoundManager.getInstance().getSoundOupputCount ();
		if ( currentIdx >= wordDataList.size())
			return true;
		
		return false;
	}
	
	private void AllRemove ()
	{
		for (Component component : viewList) {
			frame.remove (component);
		}
		viewList.clear();
	}
	
	private void Add (Component viewComponet)
	{
		if( !viewList.contains(viewComponet))
		{
			viewList.add (viewComponet);
			frame.add (viewComponet);
		}
	}
	
	private void Init ()
	{
		titleList.clear();	
		wordDataList.clear();	
	
		if( viewList.size ()>0)
		{
			AllRemove ();
			viewList.clear ();	
		}
		
		if( pianoGUI != null)
		{
			pianoGUI.Destroy ();
			pianoGUI = null;
		}
		
		iCount = COUNT;
		iScore = 0;
		SoundManager.getInstance().setSoundOupputCount (0);
	}
	
}
