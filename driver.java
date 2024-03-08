import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current hour:");
        int currentHour = scan.nextInt();
        System.out.println("Enter current minute:");
        int currentMinute = scan.nextInt();
        System.out.println("Enter current second:");
        int currentSecond = scan.nextInt();
        System.out.println("Enter hours to go forward:");
        int forwardHour = scan.nextInt();
        System.out.println("Enter minutes to go forward:");
        int forwardMinute = scan.nextInt();
        System.out.println("Enter seconds to go forward:");
        int forwardSecond = scan.nextInt();
        
        int totalForwardSecond = forwardHour * 3600 + forwardMinute * 60 + forwardSecond;
        int totalCurrentSecond = currentHour * 3600 + currentMinute * 60 + currentSecond;
        int totalNewSecond = totalCurrentSecond + totalForwardSecond;
        
        int newHour = totalNewSecond / 3600 % 24;
        int newMinute = (totalNewSecond % 3600) / 60;
        int newSecond = totalNewSecond % 60;
        
        System.out.println("The new time is: " + newHour + ":" + newMinute + ":" + newSecond);
    }
}

