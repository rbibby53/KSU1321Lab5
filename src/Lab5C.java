import java.util.Scanner;
import static java.lang.System.*;

public class Lab5C {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        out.print("Enter x: ");
        int x = input.nextInt();
        out.print("Enter y: ");
        int y = input.nextInt();

        if(x == 0 && y == 0){
            out. print("This point is the origin.");
        }else if (x==0){
            out.print("This point is on the y axis.");
        }else if (y==0) {
            out.print("This point is on the x axis.");
        }else if (x>0 && y>0){
            out.print("This point is in the first quadrant.");
        }else if (x<0 && y>0){
            out.print("This point is in the second quadrant.");
        }else if (x<0 && y<0){
            out.print("This point is in the third quadrant.");
        }else if (x>0 && y<0){
            out.print("This point is in the fourth quadrant.");
        }
    }
}