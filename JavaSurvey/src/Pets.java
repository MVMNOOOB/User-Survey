//Spencer Woodruff
//APCSA
//11-15-22

import java.util.Scanner;

public class Pets {
    public static void pets() {
        // scanner obj
        Scanner input = new Scanner(System.in);

        // initialize variable
        String petName;
        String petType;
        String petAge;
        String petColor;

        // initialize continuation(temp) variables
        String petContinue1;
        String petContinue2;

        // runs untill user reaches conclusion then breaks
        while (true) {
            // do you have a pet?
            System.out.println("Do you have a pet?");
            petContinue1 = input.nextLine();

            // there is no pet
            if (petContinue1.equals("N/A") || petContinue1.equals("No") || petContinue1.equals("no")
                    || petContinue1.equals("No.") || petContinue1.equals("no.")) {
                petName = "N/A";
                petType = "N/A";
                petAge = "N/A";
                petColor = "N/A";

                System.out.println("N/A!");
                break;
            }

            // there is a pet, name?
            System.out.println("What is your pet's name?");
            petName = input.nextLine();

            // kind of animal?
            System.out.println("What kind of pet is it?");
            petType = input.nextLine();

            // age?
            System.out.println("What is the age of your " + petType + "?");
            petAge = input.nextLine();

            // color?
            System.out.println("What is the color of your " + petType + "?");
            petColor = input.nextLine();

            // list out, confirm if correct
            System.out.print("Your pet's name is " + petName + ", ");
            System.out.print("your pet is a " + petType + ", ");
            System.out.print("your pet's age is " + petAge + ", ");
            System.out.print("and your pet's color is " + petColor + ". Is this correct? ");
            petContinue2 = input.nextLine();

            // done, moving on
            if (petContinue2.equals("Yes") || petContinue2.equals("yes") || petContinue2.equals("Yes.")
                    || petContinue2.equals("yes.")) {
                System.out.println("Alright, let's continue!");
                break;
            }
            // incorrect details, attempt again
            else {
                System.out.println("Alright, let's try again!");
            }
        }
    }
}