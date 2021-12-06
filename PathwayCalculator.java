// main class that asks user their intended major and calls the methods

import java.util.*;
import java.io.*;

public class PathwayCalculator {


   public static void main(String[] args) {
   
      // create 10 school objects and assign them to those from our reserached list
      // load each with their undergrad and grad program costs, for in and out-of-state students
      
      School uw = new School("University of Washington", 30640.00, 30294.00);
      School wsu = new School("Washington State University (Pullman)", 22488.00, 22488.00);
      School ewu = new School("Eastern Washington University", 25008.00, 13387.95);
      School wwu = new School("Western Washington University", 26934.00, 12490.01);
      School cwu = new School("Central Washington University", 26446.00, 29888.00);
      School su = new School("Seattle University", 67170.00, 32340.00);
      School bc = new School("Bellevue College", 22432.00, 0.00);
      School cc = new School("Clark College", 20460.00, 0.00);
      School sfcc = new School("Spokane Falls Community College", 15020.67, 0.00);
      School ecc = new School("Everett Community College", 20154.00, 0.00);
      
      // different possible majors and their avg expected salaries
      Major compSci = new Major("Computer Science", 87000.0, 105000.0, 128000.0);
      Major business = new Major("Business", 54019.0, 81685.0, 101000.0);
      Major engineer = new Major("Engineering", 87000.0, 94000.0, 147000.0);
      
       // scanner object to read user response
       Scanner scan = new Scanner(System.in);
       
       // welcome user and ask for their intended major (in GUI, would be dropdown or predictive textbox)
       System.out.println("Welcome! Please select your intended major/program.");
       String major = scan.nextLine();
       System.out.println("Intended Major: " + major + "\n");
       
       // calculate results
       System.out.println("Hang tight while we trace out your most financially-viable path...\n\n");;
       
       String bestLevel = "";
       
       // cs major demo
       if(major.equals("Computer Science")) {
           double uSalary = compSci.getUSalary();
           double mSalary = compSci.getMSalary();
           double pSalary = compSci.getPSalary();
           double difference1 = (mSalary - uSalary);
           double difference2 = (pSalary - mSalary);
           
           if(difference1 <= 10000.0) {
               bestLevel = "Bachelor of Computer Science";
           }
           if(difference2 <= 10000.0) {
                  bestLevel = "Master's in Computer Science";
               }
           if(difference2 >= 10000.0) {
               bestLevel = "PhD in Computer Science";
           }

         System.out.println("Based on your major, you should...\n");
         System.out.println("Complete your " + bestLevel + " at Washington State University...\n");
         System.out.println("Your expected salary out of school with a " + bestLevel + " is $" + compSci.getPSalary() + "...");
      }
      
      // business major demo
      if(major.equals("Business")) {
           double uSalary = business.getUSalary();
           double mSalary = business.getMSalary();
           double pSalary = business.getPSalary();
           double difference1 = (mSalary - uSalary);
           double difference2 = (pSalary - mSalary);
           
           if(difference1 <= 10000.0) {
               bestLevel = "Bachelor of Business";
           }
           if(difference2 <= 10000.0) {
                  bestLevel = "Master's in Business";
               }
           if(difference2 >= 10000.0) {
               bestLevel = "PhD in Business";
           }
       
         System.out.println("Based on your major, you should...\n");
         System.out.println("Complete your " + bestLevel + " at Washington State University...\n");
         System.out.println("Your expected salary out of school with a " + bestLevel + " is $" + business.getPSalary() + "...");
      }
      
      // engineering major demo
      if(major.equals("Engineering")) {
           double uSalary = engineer.getUSalary();
           double mSalary = engineer.getMSalary();
           double pSalary = engineer.getPSalary();
           double difference1 = (mSalary - uSalary);
           double difference2 = (pSalary - mSalary);
           
           if(difference1 <= 10000.0) {
               bestLevel = "Bachelor of Engineering";
           }
           if(difference2 <= 10000.0) {
                  bestLevel = "Master's in Engineering";
               }
           if(difference2 >= 10000.0) {
               bestLevel = "PhD in Engineering";
           }
       
         System.out.println("Based on your major, you should...\n");
         System.out.println("Complete your " + bestLevel + " at Washington State University...\n");
         System.out.println("Your expected salary out of school with a " + bestLevel + " is $" + engineer.getPSalary() + "...");
      }

    
    
    
    
    }   

}
