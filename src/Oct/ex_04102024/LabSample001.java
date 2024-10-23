package Oct.ex_04102024;

import java.util.Scanner;

public class LabSample001 {
    public static void main(String[] args) {
        //Ip- Int & op- Char
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the Score : ");
        int Score = Scan.nextInt();
        if (Score >= 90 && Score < 100)
        {
            System.out.println("Grade is A" + "because Score is : " + Score);
        }
    }
}
