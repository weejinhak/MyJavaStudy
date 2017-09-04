package Quiz;

import javax.swing.JOptionPane;

class GameGugudan extends Thread
{
    
    @Override
    public void run()
    {
        try
        {
            Quiz ();
        } catch (Exception e)
        {
            System.out.println (e.getMessage());
        }
    }
    
    private void Quiz ()
    {
        int inputNumRandom0 = (int)((Math.random()*8)+ 2);
        String inputNum0 = String.valueOf (inputNumRandom0);
        int inputNumRandom1 = (int)((Math.random()*8)+ 2);
        String inputNum1 = String.valueOf (inputNumRandom1);
        int num = inputNumRandom0 * inputNumRandom1;
        String numStr = String.valueOf (num);
        String txtStr = inputNum0 +" * " +  inputNum1 + "= ?";
        
        String inputData= JOptionPane.showInputDialog(txtStr);
        System.out.println("입력한 값은 :"+ inputData);
        
        if (numStr.equals (inputData) )
        {
            CorrectAnswer ();
        }else{
            WrongAnswer ();
        }
    }
    
    private void CorrectAnswer()
    {
        System.out.println("정답");
        Quiz ();
    }
    
    private void WrongAnswer ()
    {
        System.out.println("오답");
        Quiz_Thread.GameEnd();
    }
 
}
 
class GameTimer extends Thread
{
    private int time = 10;
    
    @Override
    public void run()
    {
        try
        {
            for( int i=time; i>0; i--)
            {
                if( Quiz_Thread.GetGameEndCheck()) return;
                Thread.sleep (1000);
                System.out.println (i);
            }
            System.out.println("시간 종료");
            Quiz_Thread.GameEnd();
 
        } catch (Exception e)
        {
        }
    }
}
 
 
 
public class Quiz_Thread
{
    private static boolean gameEndCheck = false;
    
    public static void main (String[] args)
    {
        GameTimer timer = new GameTimer ();
        timer.start ();
        
        GameGugudan gameGugudan = new GameGugudan ();
        gameGugudan.start ();
    }
    
    public static void GameEnd()
    {
        gameEndCheck = true;
        System.out.println("게임 종료");
        System.exit(0);
        
    }
    
    public static boolean GetGameEndCheck()
    {
        return gameEndCheck;
    }
 
}
 
