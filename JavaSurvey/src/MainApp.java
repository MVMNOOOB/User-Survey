import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("JAVA STUDENT SURVEY: ");

        System.out.println("\tWould you like to take a short survey? Y/N");
        String surveyYN = input.nextLine();
        int i = 0;

        while (surveyYN.equalsIgnoreCase("Y")) {
            i++;
            if (i == 1) {
                Survey person1 = new Survey();
            }
            if (i == 2) {
                Survey person2 = new Survey();
            }
            if (i == 3) {
                Survey person3 = new Survey();
            }
            if (i == 4) {
                Survey person4 = new Survey();
            }
            if (i == 5) {
                Survey person5 = new Survey();
            }
            if (i == 6) {
                Survey person6 = new Survey();
            }
            if (i == 7) {
                Survey person7 = new Survey();
            }
            if (i == 8) {
                Survey person8 = new Survey();
            }
            if (i == 9) {
                Survey person9 = new Survey();
            }
            if (i == 10) {
                Survey person10 = new Survey();
            }
            System.out.println("Would you like to take another survey? Y/N");
            surveyYN = input.nextLine();
            while (!surveyYN.equalsIgnoreCase("Y") && !surveyYN.equalsIgnoreCase("N")) {
                System.out.println("That isnt a valid option. Please try again");
                surveyYN = input.nextLine();
            }
            System.out.print("\033[H\033[2J");
        }
        if (i == 1) {
            System.out.println(i + " person has taken this survey!\n\nThank you for your time! Enjoy your day!");

        } else {
            System.out.println(i + " people have taken this survey!\n\nThank you for your time! Enjoy your day!");
        }
    }
}