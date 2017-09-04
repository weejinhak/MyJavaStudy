
 
/* ¿€º∫¿œ : 2017.02.24
 * ¿€º∫¿⁄ : [2¡∂] ¿Ã¿ÁπŒ, ±Ëøµ¡ÿ, ±ËπŒº∫, ¿Ã¿∫∞Ê, ±Ë¿∫øµ, √÷¿∫«˝
 * [¡§±‘«•«ˆΩƒ øπ¡¶]
 * */
 
import java.util.Scanner;
import java.util.regex.Pattern;
 
public class Regular_homework {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        // IP¡÷º“ »Æ¿Œ
        System.out.println("IP¡÷º“∏¶ ¿‘∑¬«ÿ¡÷ººø‰.\nøπ)192.168.207.115");
        String ChkIp = "([0-9][0-9][0-9].[0-9][0-9][0-9].[0-9][0-9][0-9].[0-9][0-9][0-9])";
        String Ip = sc.nextLine();
        boolean resultIp = Pattern.matches(ChkIp, Ip);
 
        if (resultIp) {
            System.out.println("[ø√πŸ∏•] IP¡÷º“ ¿‘¥œ¥Ÿ.");
        } else {
            System.out.println("[¿ﬂ∏¯µ»] IP¡÷º“ ¿‘¥œ¥Ÿ.");
        }
 
         
        
        // ¿Ã∏ß »Æ¿Œ
        System.out.println("¿Ã∏ß¿ª ¿‘∑¬«ÿ¡÷ººø‰.\nøπ)¿Ã¿ÁπŒ");
        String ChkName = "([∞°-∆R]{2,5})";
        String Name = sc.nextLine();
        boolean resultName = Pattern.matches(ChkName, Name);
 
        if (resultName) {
            System.out.println("[ø√πŸ∏•] ¿Ã∏ß ¿‘¥œ¥Ÿ.");
        } else {
            System.out.println("[¿ﬂ∏¯µ»] ¿Ã∏ß ¿‘¥œ¥Ÿ.");
        }
 
        
        
        
        
        // ¡÷πŒµÓ∑œπ¯»£ »Æ¿Œ
        System.out.println("¡÷πŒµÓ∑œπ¯»£∏¶ ¿‘∑¬«ÿ¡÷ººø‰. \nøπ)880517-1234567");
        String ChkJumin = "([0-9][0-9][0-1][0-9][0-3][0-9]-[1-4][0-9][0-9][0-9][0-9][0-9][0-9])";
        String Jumin = sc.nextLine();
        boolean resultJumin = Pattern.matches(ChkJumin, Jumin);
 
        if (resultJumin) {
            System.out.println("[ø√πŸ∏•] ¡÷πŒµÓ∑œπ¯»£ ¿‘¥œ¥Ÿ.");
        } else {
            System.out.println("[¿ﬂ∏¯µ»] ¡÷πŒµÓ∑œπ¯»£ ¿‘¥œ¥Ÿ.");
        }
 
        
        
        
        
        // »ﬁ¥Î∆˘π¯»£ »Æ¿Œ
        System.out.println("»ﬁ¥Î∆˘π¯»£∏¶ ¿‘∑¬«ÿ¡÷ººø‰.\nøπ)010-3555-9217");
        String ChkPhone = "(01[016789]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9])";
        String Phone = sc.nextLine();
        boolean resultPhone = Pattern.matches(ChkPhone, Phone);
 
        if (resultPhone) {
            System.out.println("[ø√πŸ∏•] »ﬁ¥Î∆˘π¯»£ ¿‘¥œ¥Ÿ.");
        } else {
            System.out.println("[¿ﬂ∏¯µ»] »ﬁ¥Î∆˘π¯»£ ¿‘¥œ¥Ÿ.");
        }
 
        
        
        
        
        // Email¡÷º“ »Æ¿Œ
        System.out.println("Email¡÷º“∏¶ ¿‘∑¬«ÿ¡÷ººø‰.\nøπ)ekbabo@naver.com");
        String ChkEmail = "([a-zA-Z][a-zA-Z0-9._]{2,11})@[a-zA-z]{3,5}.([a-zA-Z]{3,4}|[a-zA-Z]{2,4}.[a-zA-Z]{2,4})";
        String Email = sc.nextLine();
 
        boolean resultEmail = Pattern.matches(ChkEmail, Email);
 
        if (resultEmail) {
            System.out.println("[ø√πŸ∏•] Email¡÷º“ ¿‘¥œ¥Ÿ.");
        } else {
            System.out.println("[¿ﬂ∏¯µ»] Email¡÷º“ ¿‘¥œ¥Ÿ.");
        }
    }
}
