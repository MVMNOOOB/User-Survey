/*public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

//Ethan Mitchell
import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("helloworld!");
    }
}

// This is where our final code will be.
// add you code here after you finish each story
// use comments and demarkate which story that code is for

//Ethan Mitchell (I made the baseline program that the survey was built off of
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //System.out.println("Test");
        //System.out.println("Disruptive Donkey!");Y
        System.out.println("JAVA STUDENT SURVEY: ");
        System.out.println("\tWould you like to take a short survey? Y/N");
        
        String surveyYN = input.nextLine();
        if (surveyYN.equals("Y"))
        {
            System.out.println("testCase1");
            Survey.survey();
            //here you can call a method to begin the survey process
        }
        else if (surveyYN.equals("N"))
        {
            System.out.println("exitCase0");
            //here the conditional would give an exit case
        }       
    }
} */





/*

// This is where our final code will be.
// add you code here after you finish each story
// use comments and demarkate which story that code is for
// THIS IS NOT WHERE YOU ADD YOUR SURVEY METHODS, THEY GO IN THE SURVEY.JAVA FILE

//Ethan Mitchell
//APCSA
//11-11-22
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //System.out.println("Test");
        //System.out.println("Disruptive Donkey!");Y
        
        int surveysTaken = 0;
        
        System.out.println("JAVA STUDENT SURVEY: " );
        System.out.println("\tWould you like to take a short survey? Y/N");
        
        String surveyYN = input.nextLine();
        if (surveyYN.equals("Y") || surveyYN.equals("y"))
        {
           // System.out.println("go.Survey");
            Survey.survey();
            //here you can call a method to begin the survey process
        }
        
        else if(surveyYN.equals("go.PerInfo"))
        {
            //skips to the Personal Information part of the survey
            PerInfo.perInfo();
        }
        
        else if (surveyYN.equals("go.hobbies"))
        {
            //skips to the hobbies part of the survey
            hobbies.Hobbies();
        }
        
        else if (surveyYN.equals("go.favorites"))
        {
            //skips to the favorites part of the survey
            favorites.userfavorites();
        }
        
        else if (surveyYN.equals("go.pets"))
        {
            //skips to the pets part of the survey
            pets.Pets();
        }
        
        else if (surveyYN.equals("go.userinfo"))
        {
            //skips to the user info part of the survey
            UserInfo.userInfo();
        }
        else if(surveyYN.equals("go.myschool"))
        {
            MySchool.mySchool();
        }
        
        else if (surveyYN.equals("N") || surveyYN.equals("n"))
        {
            System.out.println("exitCase0");
            //here the conditional would give an exit case
        }   
        
        
        
        
    }
}


*/