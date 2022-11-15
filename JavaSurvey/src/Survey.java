



import java.util.Scanner;

public class Survey{
    public static int numPeople = 1;
    
    public Survey(){
        PerInfo.perInfo();
        Pets.pets();
        Favorites.favorites();
        Hobbies.hobbies();
        UserInfo.userInfo();
        MySchool.mySchool();
        //SchoolData.schoolData();
        
    }
}







/*

//Ethan Mitchell
//APCSA
//11-15-22

import java.util.Scanner;

public class Survey {
    public int surveysTaken = 0;
    public static boolean goAgain2 = true;
    public static void survey()
    {   //this method is where we can call the individual survey methods of the program
        //System.out.println("survey works!");
        
       // while(goAgain2)
       // {
          
           Scanner input = new Scanner(System.in);
        PerInfo.perInfo();
        hobbies.Hobbies();
        favorites.userfavorites();
        pets.Pets();
        UserInfo.userInfo();
        MySchool.mySchool();
        
        
        
      //  System.out.println("Survey Finished!  Would you like to take another?" + "(surveys taken: " + surveystaken + ")"); 
      //  String goAgain = input.nextLine();
      //  if(goAgain.equals("Y") || goAgain.equals("y") || goAgain.equals("yes") || goAgain.equals("Yes"))
      //  {
           //surveysTaken += 1;
            Survey.survey();
        }
        else
        {
            goAgain2 = false;
        }
            
        }
        
        Scanner input = new Scanner(System.in);
        PerInfo.perInfo();
        hobbies.Hobbies();
        favorites.userfavorites();
        pets.Pets();
        UserInfo.userInfo();
        MySchool.mySchool();
        
        
        
        System.out.println("Survey Finished!  Would you like to take another?" + "(surveys taken: " + surveystaken + ")"); 
        String goAgain = input.nextLine();
        if(goAgain.equals("Y") || goAgain.equals("y") || goAgain.equals("yes") || goAgain.equals("Yes"))
        {
            surveysTaken += 1;
            Survey.survey();
        }
        
    }
    
*/