package Oct.ex_18102024;

import java.util.Scanner;

public class Lab18_01 {
    public static void main(String[] args) {
        //Switch : Enter int number from 1 to 7 and which day it is? (1- Monday)
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the day (from 1 to 7) : ");
        int Day = Scan.nextInt();

        switch (Day)
        {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Lol");
                break;
        }

        Scan.close();
    }
}
