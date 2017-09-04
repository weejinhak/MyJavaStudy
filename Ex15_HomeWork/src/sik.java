//Á¤±Ô½ÄÀÌ¶õ ÅØ½ºÆ® µ¥ÀÌÅÍ Áß¿¡¼­ ¿øÇÏ´Â Á¶°Ç(ÆĞÅÏ, pattern)°ú ÀÏÄ¡ÇÏ´Â ¹®ÀÚ¿­À» Ã£¾Æ³»±â À§ÇØ »ç¿ëÇÏ´Â °ÍÀ¸·Î 
//¹Ì¸® Á¤ÀÇµÈ ±âÈ£¿Í ¹®ÀÚ¸¦ ÀÌ¿ëÇØ¼­ ÀÛ¼ºÇÑ ¹®ÀÚ¿­À» ÀÇ¹Ì
 
 
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
 
public class sik {
    // static ¼±¾ğ ³¢¸®³¢¸® ³î¾Æ¶ó
    static String data = "";
    static String regExp;
    static Scanner sc = new Scanner(System.in); //ÀÔ·Â
 
    public static void main(String[] args) throws Exception {
 
        while (true) {
            System.out.println("1.ÀÌ¸§ 2.ºñ¹Ğ¹øÈ£ 3.ÇÚµåÆù¹øÈ£ 4.ÀÌ¸ŞÀÏ 5.ÁÖ¹Î¹øÈ£ 6.³¡³»±â");
            int a = sc.nextInt();
            sc.nextLine();
 
            switch (a) {
            
            case 1:
                name();
                break;
            case 2:
                pwd();
                break;
            case 3:
                phone();
                break;
            case 4:
                email();
                break;
            case 5:
                jumin();
                break;
            case 6:
                System.out.println("Á¾·áÇÕ´Ï´Ù");
                System.exit(0);
                break;
                
            default:System.out.println("Àß¸øÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
            break;
 
            }
        }
    }
 
    public static void name() {
       
        System.out.println("1.ÀÌ¸§ ÀÔ·Â:");
        
        String regExp = "^[¤¡-¤¾°¡-ÆR]*$";
        String data = sc.nextLine();
        
       //Á¤±ÔÇ¥Çö½ÄÀÌ ÆĞÅÏ¿¡ ÀÏÄ¡ÇÏ´ÂÁö ¿©ºÎ¸¦ Å×½ºÆ®ÇÑ´Ù.
       boolean b = data.matches(regExp); // true ,false À¯È¿¼º °Ë»ç
 
        if (b == true) {
            System.out.println("¿Ã¹Ù¸¥ Çü½ÄÀÔ´Ï´Ù , Â¦Â¦Â¦!!");
        } else {
            System.out.println("ÀÌ¸§¿¡´Â ÇÑ±Û¸¸ µé¾î¿Ã¼ö ÀÖ¾î¿ä.");
        }
 
    }
 
    public static void pwd() {
        System.out.println("2.ºñ¹Ğ¹øÈ£ ÀÔ·Â:");
        //
        String regExp = "^[A-Za-z0-9_@./#&+-?~]*.{6,20}$";
        String data = sc.nextLine();
 
        boolean b1 = data.matches(regExp); // true ,false À¯È¿¼º °Ë»ç
 
        if (b1 == true) {
            System.out.println("¿Ã¹Ù¸¥ Çü½ÄÀÔ´Ï´Ù , Â¦Â¦Â¦!!");
        } else {
            System.out.println("6~20ÀÚ »çÀÌ¿¡ ¿µ¾î´ë¼Ò¹®ÀÚ,Æ¯¼ö¹®ÀÚµµ µé¾î¿Ã¼ö ÀÖ½À´Ï´Ù.");
        }
    }
 
    public static void phone() {
        System.out.println("3.ÈŞ´ë¹øÈ£ ÀÔ·Â:");
        // ÇÚµåÆù ¾ÕÀÚ¸®(010)
        // °¡¿îµ¥ 4ÀÚ¸®
        // ¸¶Áö¸· 4ÀÚ¸®
        String regExp = "(010)-\\d{4}-\\d{4}";
        String data = sc.nextLine();
 
        boolean b2 = data.matches(regExp); // true ,false À¯È¿¼º °Ë»ç
 
        if (b2 == true) {
            System.out.println("¿Ã¹Ù¸¥ Çü½ÄÀÔ´Ï´Ù, Â¦Â¦Â¦!!!");
        } else {
            System.out.println("ÈŞ´ëÀüÈ­´Â 010-xxxx-xxxx ¸¸ µé¾î¿Ã¼ö ÀÖ¾î¿ä. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä!!");
        }
 
    }
 
    public static void email() {
       //@¾Õ¿¡ ¿µ¾î´ë¼Ò¹®ÀÚ ¼ıÀÚ¸¸
       //@µÚ¿¡´Â ¿µ¾î´ë¼Ò¹®ÀÚ¸¸
       //.(Á¡)µÚ¿¡´Â ¿µ¾î´ë¼Ò¹®ÀÚ¸¸
        System.out.println("4.E-Mail ÀÔ·Â:");
 
        String regExp = "^[_a-zA-Z0-9-\\.]+@[\\.a-zA-Z0-9-]+\\.[a-zA-Z]+$";
        String data = sc.nextLine();
 
        boolean b3 = data.matches(regExp); // true ,false À¯È¿¼º °Ë»ç
 
        if (b3 == true) {
            System.out.println("¿Ã¹Ù¸¥ Çü½ÄÀÔ´Ï´Ù , Â¦Â¦Â¦!!");
        } else {
            System.out.println("E-mail Çü½ÄÀº ex)csyong92@kosta.com ÀÔ´Ï´Ù. ´Ù½Ã ÀÔ·Â ÇÏ¼¼¿ä ");
        }
    }
    public static void jumin(){
          System.out.println("5.ÁÖ¹Î¹øÈ£ ÀÔ·Â:");
          
          String regExp = "^\\d{6}-[1-4]\\d{6}";
          String data = sc.nextLine();
          
          boolean b4 = data.matches(regExp); // true ,false À¯È¿¼º °Ë»ç
          
          if(b4 == true){
             System.out.println("¿Ã¹Ù¸¥ Çü½ÄÀÔ´Ï´Ù , Â¦Â¦Â¦!!");
          }
          else {
             System.out.println("ÁÖ¹Î¹øÈ£ Çü½ÄÀº xxxxxx-xxxxxxxÀÌ°í, µŞÀÚ¸® Ã¹¹øÂ° ¹øÈ£´Â 1~4¸¸ ÀÔ·Â °¡´É ÇÕ´Ï´Ù.");
          }
       }
 
    
}
