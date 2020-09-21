import java.util.Scanner;
import static java.lang.System.*;

public class Lab5A {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        out.print("Experiencing severe symptoms (Y/N)? ");
        String sev = input.nextLine().toLowerCase();

        if (sev.equals("y")){
            out.print("Seek emergency care.");
        }else if (sev.equals("n")){
            out.print("Close contact with someone who has COVID (Y/N)? ");
            String con = input.nextLine().toLowerCase();
            if (con.equals("y")){
                out.print("Quarantine and get tested if you feel sick.");
            }else if(con.equals("n")){
                out.print("If you experience other symptoms, isolate and get tested.");
            }else{
                out.println("error.");
            }
        }else{
            out.println("error.");
        }
    }
}
