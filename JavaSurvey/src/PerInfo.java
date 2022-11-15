//Sai Akshat Chitta
//APCSA
//11-15-22

import java.util.Scanner;

public class PerInfo {
    static String name;
    static int age;
    static String eduLevel;
    static double height;
    static String address;
    static int peopleCount;
    
    public static void perInfo(){

        Scanner input = new Scanner(System.in); //creates Scanner
        System.out.println("Whats your name?"); //question to prompt input for name
        name = input.nextLine(); //assigns input to a variable
        

        System.out.println("How old are you? (Enter a whole number)"); //question to prompt input for age
        age = input.nextInt(); //assigns input to a variable
        input.nextLine();
        
        
        
        System.out.println("What's your highest level of education? (Choose one) "); //question to prompt input for education level
        System.out.println("A) Some High School, no Diploma"); //answer option one
        System.out.println("B) High School Diploma, or equivalent"); //answer option two
        System.out.println("C) Some College Credit, no degree"); //answer option three
        System.out.println("D) Trade/Technical/Vocational Training"); //answer option four
        System.out.println("E) Associate Degree"); //answer option five
        System.out.println("F) Bachelor's Degree"); //answer option six
        System.out.println("G) Master's Degree"); //answer option seven
        System.out.println("H) Professional Degree"); //answer option eight
        System.out.println("I) Doctorate Degree"); //answer option nine
        
        String userChoice = input.nextLine(); //assigns user input to variable
        while(!userChoice.equalsIgnoreCase("A") && !userChoice.equalsIgnoreCase("B") && !userChoice.equalsIgnoreCase("C") && !userChoice.equalsIgnoreCase("D") && !userChoice.equalsIgnoreCase("E") && !userChoice.equalsIgnoreCase("F") && !userChoice.equalsIgnoreCase("G") && !userChoice.equalsIgnoreCase("H") && !userChoice.equalsIgnoreCase("I")){
         System.out.println("That isn't one of available options.\nPlease choose again!");
         userChoice = input.nextLine();
        }
        
        if(userChoice.equalsIgnoreCase("A")){ //assigns a value to eduLevel if user's answer choice is 
         eduLevel = "Some High School, no Diploma";
        }
        else if(userChoice.equalsIgnoreCase("B")) { //assigns a value to eduLevel if user's answer choice is 
         eduLevel = "High School Diploma, or equivalent";
        }
        else if(userChoice.equalsIgnoreCase("C")) { //assigns a value to eduLevel if user's answer choice is 
         eduLevel = "Some College Credit, no degree";
        }
        else if(userChoice.equalsIgnoreCase("D")) { //assigns a value to eduLevel if user's answer choice is  
         eduLevel = "Trade/Technical/Vocational Training";
        }
        else if(userChoice.equalsIgnoreCase("E")) { //assigns a value to eduLevel if user's answer choice is 
         eduLevel = "Associate Degree";
        }
        else if(userChoice.equalsIgnoreCase("F")) { //assigns a value to eduLevel if user's answer choice is 
         eduLevel = "Bachelor's Degree";
        }
        else if(userChoice.equalsIgnoreCase("G")) { //assigns a value to eduLevel if user's answer choice is 
         eduLevel = "Master's Degree";
        }
        else if(userChoice.equalsIgnoreCase("H")) { //assigns a value to eduLevel if user's answer choice is 
         eduLevel = "Professional Degree";
        }
        else if(userChoice.equalsIgnoreCase("I")) { //assigns a value to eduLevel if user's answer choice is 
         eduLevel = "Doctorate Degree";
        }
        else{ //assigns a value to eduLevel if user's answer choice is not one of the given answers choices
         eduLevel = null;
        }
        
        
        
        System.out.println("How tall are you in inches? (Ex: 70.4)"); //question to prompt input for height
        height = input.nextDouble(); //assings user input to variable
        input.nextLine();
        
        
        
        System.out.println("Enter your address: ");
        System.out.println("Street: "); //question to prompt input
        String street = input.nextLine(); //assigns input to a variable
        System.out.println("City: "); //question to prompt input
        String city = input.nextLine(); //assigns input to a variable
        System.out.println("State: "); //question to prompt input
        String state = input.nextLine(); //assigns input to a variable
        System.out.println("Country: "); //question to prompt input
        String country = input.nextLine(); //assigns input to a variable
        System.out.println("Zip Code: "); //question to prompt input
        int zip = input.nextInt(); //assigns input to a variable
        
        address = (street + ", " + city + ", " + state + ", " + country + ", " + zip);
        
        
        }
        
        public void heightToCm(double heightInches){
            heightInches = height;
            
            double heightCm = heightInches * 2.54;
            System.out.println(height + " inches equals " + heightCm +  " centimeters.");
            
        }
}