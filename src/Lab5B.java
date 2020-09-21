import java.util.Scanner;
import static java.lang.System.*;

public class Lab5B {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        out.print("Enter a number that represents today (Sunday==0, Monday==1,...) ");
        int day = input.nextInt();

        out.print("Enter the number of days until the meeting: ");
        int count = input.nextInt();
        int meetingday= (day + count) % 7;

        switch(meetingday){
            case 0: out.print("Meeting day is Sunday");
                break;
            case 1: out.print("Meeting day is Monday");
                break;
            case 2: out.print("Meeting day is Tuesday");
                break;
            case 3: out.print("Meeting day is Wednesday");
                break;
            case 4: out.print("Meeting day is Thursday");
                break;
            case 5: out.print("Meeting day is Friday");
                break;
            case 6: out.print("Meeting day is Saturday");
                break;
        }
    }
}