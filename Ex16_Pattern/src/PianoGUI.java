import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
/*
 * PianoStick : �ǾƳ� �ǹ� ��ü. ��ư ��ӹް� ������ ������ �����Ѵ�. 
 * 				 Ű�̺�Ʈ (����1-8)�߻��� ��ư����� ���輱��ǥ������. 
 */
class PianoStick extends Button implements Runnable
{
	public Button btn;
	public boolean bCheck = false;
	private boolean isRun = true;
	
	public void Setting (String name, int centerPos)
	{
		this.setName (name);
		this.setSize (70, 150);
		this.setLocation (centerPos*73 +50, 100);
		this.setBackground (Color.white);
		this.setEnabled (false);
	}
	
	public void BtnStateChange ()
	{
		bCheck = true;
	}
	
	@Override
	public void run ()
	{
		while(isRun)
		{
				try
				{
					if( bCheck )
					{
						this.setBackground(Color.gray);
						Thread.sleep(500);
						bCheck =false;
					}else{
						this.setBackground(Color.white);
					}
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
		}
	}
	
	public void Stop ()
	{
		isRun = false;
	}
}

/*
 * PianoGUI : GUI ��� Ŭ���� 
 * 			    �޴����� ȭ�� �� �ΰ���ȭ�� �׷��ش�.	
 * 			    �� ȭ�鱸���� �ʿ��� UI�� panel�� ������ panelä�� ����Ŭ����(pianoGame)���� ����Ѵ�.
 * 			  KeyListener: ����� Ű���� �Է¹��� Ű�̺�Ʈ
 * 		      ActionListener : �����߰��̳� ����� �޴�ȭ������ ���ư������� ��ư Ű �̺�Ʈ
 */
public class PianoGUI implements KeyListener,ActionListener
{
	public Panel 		menuPanel =null;
	public Panel 		GamePanel =null;	
	public Panel 		pianoStickPanel =null;	
	public Button		btn_menu  =null;	
	public Label        lbl_score =null;
	public Label        lbl_count =null;
	public Label		lbl_notice=null;
	public TextField 	txt_input =null;	
	
	private PianoGame   pianoGame;
	private ArrayList<PianoStick> pianoStickList = new ArrayList<>();
	
	PianoGUI (PianoGame pianoGame)
	{
		this.pianoGame = pianoGame;
	}
	
	public void MenuUI()
	{
		menuPanel = new Panel ();
		menuPanel.setBackground (Color.lightGray);
		menuPanel.setSize(700,500);
		menuPanel.setLocation (0,0);
		menuPanel.setLayout(null);
		Label lbl_step = new Label ("���� �����ϼ��� :)");
		lbl_step.setSize (110, 30);
		lbl_step.setLocation (265, 100);
		lbl_step.setForeground( Color.WHITE);
		menuPanel.add (lbl_step);
	}
	
	public void GameUI ()
	{
		int centerNum = 200;
		GamePanel = new Panel ();
		GamePanel.setLocation (0, 280);
		GamePanel.setBackground (Color.lightGray);
		GamePanel.setSize (700, 100);
		
		pianoStickPanel = new Panel ();
		pianoStickPanel.setLocation (0,0);
		pianoStickPanel.setSize (700, 300);
		pianoStickPanel.setBackground (Color.DARK_GRAY);

		for( int i=0; i<7; i++)
		{
			Button btn = new Button ();
			btn.setSize (50,105);
			btn.setLocation (i*75 +90, 100);
			btn.setBackground (Color.black);
			pianoStickPanel.add (btn);
		}
		
		for( int i=0; i<8; i++)
		{
			PianoStick pianoStick = new PianoStick ();
			pianoStick.Setting(String.valueOf (i+49), i);
			Thread thread = new Thread (pianoStick);
			thread.start ();
			pianoStickList.add (pianoStick);
			pianoStickPanel.add (pianoStick);
		}
	
		btn_menu = new Button ("gotoMenu");
		btn_menu.setLocation( (centerNum+300+30)+60, 50);
		btn_menu.setSize (80, 30);
		
		lbl_score = new Label();
		lbl_score.setSize(80, 20);
		lbl_score.setLocation(centerNum-50, 50);
		
		lbl_count = new Label();
		lbl_count.setSize(80, 20);
		lbl_count.setLocation(centerNum-150, 50);
		
		lbl_notice = new Label ();
		lbl_notice.setSize (200, 20);
		lbl_notice.setLocation (380, 28);
		
		txt_input = new TextField();
		txt_input.setSize(250, 20);
		txt_input.setLocation(centerNum+50, 50);
		txt_input.setColumns (30);
		txt_input.setBackground(Color.white);
		
		GamePanel.add (lbl_count);
		GamePanel.add (btn_menu);
		GamePanel.add (lbl_score);
		GamePanel.add (txt_input);
		GamePanel.add (lbl_notice);
	    txt_input.addKeyListener (this);
		btn_menu.addActionListener (this);
	    ChangeUI ();
	}
	
	//btn_menu click
	@Override 
	public void actionPerformed(ActionEvent e) {
		pianoGame.GotoMenu ();
	}
	
	//btn keyReleased(1-8)
	@Override
	public void keyReleased (KeyEvent e)
	{
		int keyCode = (int) (e.getKeyChar ());
		if (keyCode >= 49 && keyCode<=56)
		{
			pianoStickList.get (keyCode-49).BtnStateChange ();
			SoundManager.getInstance ().SoundKeyboard (keyCode);	
			CorrectCheck();
		}else{
			
			lbl_notice.setText("�ǾƳ� �ǹ���  1-8 :)");
		}
	}
	
	private void CorrectCheck()
	{
		boolean bcorrentCheck = pianoGame.CorrectCheck ();
		ChangeUI();
		if (pianoGame.GameEndCheck())
		{
			txt_input.setText ("���ӳ������ϴ�.");
			txt_input.setEnabled (false);
		}	
		
		
		if (bcorrentCheck) 
			lbl_notice.setText("                             ���� :)");
		else
			lbl_notice.setText("                             ���� :(");
	}
	
	private void ChangeUI()
	{
		lbl_score.setText ("ȹ������: "+ pianoGame.getScore ());
		lbl_count.setText ("����Ƚ��: "+ pianoGame.getiCount ());
	}
	
	@Override
	public void keyTyped (KeyEvent arg0){}
	public void keyPressed (KeyEvent e){}

	public void Destroy ()
	{
		for (PianoStick pianoStick : pianoStickList) {
			pianoStick.Stop();
		}
		
		txt_input.removeKeyListener(this);
		btn_menu.removeKeyListener (this);
	}
}
