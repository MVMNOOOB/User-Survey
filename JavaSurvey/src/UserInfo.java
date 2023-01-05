
//Ethan Mitchell
//APCSA
//11-15-22

import java.util.Scanner;

public class UserInfo {
    public static void userInfo() {
        String userAdresss;
        String userSchool;

        Scanner input = new Scanner(System.in);

        System.out.println("Do You live in a multi unit building? Y/N");
        String liveInMultiUnit = input.nextLine();

        if (liveInMultiUnit.equals("Y") || liveInMultiUnit.equals("y")) {
            System.out.println("What is your unit number?");
            userAdresss = input.nextLine();
        }

        else {
            System.out.println("What is your address?");
            userAdresss = input.nextLine();
        }
        System.out.println("What school do you go to?");
        userSchool = input.nextLine();
    }
}