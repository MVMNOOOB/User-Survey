//Abid Khan
//APCSA
//11-15-22

import java.util.Scanner;
public class MySchool
{
    
    public static void mySchool()
    {
        String color3;
        String color2;
        Scanner input = new Scanner(System.in);
        System.out.println("School name: ");
        String school = input.nextLine();
        
        System.out.println("principal name: ");
        String principal = input.nextLine();
        
        System.out.println("mascot name: ");
        String mascot = input.nextLine();
        
        System.out.println("Colors(put N/A, if there is not 2nd color: ");
        System.out.print("1. ");
        String color1 = input.nextLine();
        System.out.print("2. ");
        color2 = input.nextLine();
        
        if(color2.toUpperCase().equals("N/A"))
        {
            
            color3 = color1;
        }
        else
        {
            color3 = color1 + " and " + color2;
        }
        
        
        
        System.out.println("Address: ");
        String addressPlace = input.nextLine();
    }
    
}