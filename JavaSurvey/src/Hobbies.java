//Benjamin Gilboa
//APCSA
//11-15-22

import java.util.Scanner;

public class Hobbies {

    public static void hobbies() {

        Scanner input = new Scanner(System.in);

        String hobbieTime = "N/A";
        String hobbieEx = "N/A";
        String hobbies = "N/A";
        String hobbieAnswers = "N/A";

        // asked about hobbies

        System.out.println("Do you have a Hobby?");
        String answer = input.nextLine();
        if (answer.equals("yes") || answer.equals("Yes") || answer.equals("Y") || answer.equals("y")) {

            // what hobbies
            System.out.println("What are your hobbies?");
            hobbies = input.nextLine();

            // when did you start this hobby
            System.out.println("How many years ago did you start this hobby?");
            hobbieTime = input.nextLine();

            // expertise level
            System.out.println("What is your level of experience with it?\n\nExpert , Intermidate, Novice, or N/A");
            hobbieEx = input.nextLine();

            // total combo
            hobbieAnswers = "Your hobbie is " + hobbies + " you have done it for " + hobbieTime
                    + " years and your level of expertise is " + hobbieEx;

            System.out.println(hobbieAnswers + "\n Lets continue!");

        }

        else {
            System.out.println("N/A has been entered for all of your questions.\n");

        }

        // add to mass string

    }

}