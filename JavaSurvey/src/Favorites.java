//Lance Vaughn
//APCSA
//11-15-22

import java.util.Scanner;

public class Favorites {

    // instance variables
    private String song; // song
    private String game; // game
    private String band; // band
    private String food; // type of food
    private String car; // car
    private String subject = "N/A"; // school subject

    // asking about favorites
    public static void favorites() {
        {
            Scanner input = new Scanner(System.in);
            /*
             * The information I want to collect about the FAVORITES
             * Song
             * Game
             * Band
             * Type of Food
             * Car
             * School subject
             * CSA or N/A
             */

            // song prompt
            System.out.println("What is your favorite song?");
            String userSong = input.nextLine();

            // game prompt
            System.out.println("What is your favorite game?");
            String userGame = input.nextLine();

            // band prompt
            System.out.println("What is your favorite band?");
            String userBand = input.nextLine();

            // type of food prompt
            System.out.println("What is your favorite type of food?");
            String userFood = input.nextLine();

            // car prompt
            System.out.println("What is your favorite car?");
            String userCar = input.nextLine();

            // school subject prompt
            System.out.println("What is your favorite school subject? (CSA or N/A)");
            String userSubject = input.nextLine();

            Favorites user = new Favorites(userSong, userGame, userBand, userFood, userCar, userSubject);

        }
    }

    // favorites constructor
    public Favorites(String nameSong, String nameGame, String nameBand, String nameFood, String nameCar,
            String nameSubject) {
        song = nameSong;
        game = nameGame;
        band = nameBand;
        food = nameFood;
        car = nameCar;

        // the subject options
        String csa = "CSA";
        String insert = "N/A";

        if (nameSubject.toUpperCase().equals(csa)) {
            subject = nameSubject;
        }
        if (nameSubject.toUpperCase().equals(insert)) {
            // As a survey user, I want to be able to write in a favorite school subject if
            // N/A is answered.
            System.out.println("What is your favorite subject?");
            Scanner input = new Scanner(System.in);
            String specificSubject = input.nextLine();
            subject = specificSubject;

        }

        // printing results
        System.out.println("Your favorite song is " + song + ", your favorite game is " + game
                + ", your favorite band is " + band + ", your favorite type of food is " + food
                + ", your favorite car is " + car + ", your favorite subject is " + subject + ".");

    }

}