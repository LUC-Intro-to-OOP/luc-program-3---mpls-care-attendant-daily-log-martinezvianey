/*--------------------------------------------
Program 3: MPLS care attendant Daily Log
The MPLS care attendant Daily Dog Log is a program that allows the care attendant manager to  enter daily logs for each Dog in MPLS Dog boarding School.  
Listed below is a chart with the name of each care attendant and the name of each dog in their care.  The program allows the care attendant to continuously 
enter their id# and enter the total amount of time spent with the dog and a general note about the dog's day. Once the care attendant id # is entered, the care attendant
will be prompted to select the dogs who fall under their care.  For each dog entered, The program provides a summary of all entered information for a dog. The program should enforce that only care attendants with the id numbers listed in the chart below can be entered.    

Once the manager is done entering all logs, the program will display a count of total dogs entered, a count of the total number of dogs entered from each 
color group, along with the total time the care attendant spent with the various dogs. The program also provides you with a summary of the dog with the most care minutes.

**ARRAYS CANNOT BE USED FOR THIS PROGRAM**

| ID # | Care Attendant Name | Assigned Color Group|
|------|---------------------|---------------------|
| 11   | Noah Charles        |  BLUE, RED          |
| 22   | Silas Alexander     |  GREEN, YELLOW      |
| 33   | Chris Isaac         |  BLUE, YELLOW       |                               
| 44   | Mya Lynn            |  RED, GREEN         |


**** List of dogs currently in care
| ID # | Dog Name | Dogs in Care                                         |
|-------|------------|----------|
| 348   | Badger    | RED      |
| 301   | Hoosier   | RED      |
| 325   | Spartan   | GREEN    |
| 388   | Hawk      | YELLOW   |
| 333   | Gopher    | YELLOW   |
| 388   | Husker    | RED      |
| 391   | Bucky     | RED      |
| 362   | Nittany   | BLUE     |
| 311   | Wolvey    | BLUE     |
	
    [REPLACE MY INFORMATION WITH YOURS]
    Course: COMP 170, Fall 1 2022
    System: Visual Studio Code, Windows 10
    Author: C. Fulton
*/

import java.util.Scanner;

public class DailyLog {
    public static void main(String[] args) throws Exception {
        
        //DECLARATIONS *Make sure to also consider all variables that will keep tally and initialize to zero
        Scanner input = new Scanner(System.in);

        int attendantID;
        int END = -1;
        int dogID;
        int minutesSpent = 0;
        String dogNotes;

        int logEntries = 0;
        int totalRedGroup = 0;
        int totalRedMin = 0;

        int totalBlueGroup = 0;
        int totalBlueMin = 0;

        int totalGreenGroup = 0;
        int totalGreenMin = 0;

        int totalYellowGroup = 0;
        int totalYellowMin = 0;

        
        /*
        String dogName;
        int dogID;
        String dogGroup;
        String assignedGroup;
        int userID;
        */

        //WELCOME MESSAGE
        System.out.println("Welcome to the MPLS care attendant daily log program.  This program will allow you to enter a care attendant id and produce a log for the dogs under the attendant's care.");

        //Create Space
        System.out.println("");

        //OUTPUT OF CARE ATTENDANT INFO.
        System.out.println("Enter " + 11 + " for Noah Charles");
        System.out.println("Enter " + 22 + " for Silas Alexander");
        System.out.println("Enter " + 33 + " for Chris Isaac");
        System.out.println("Enter " + 44 + " for Mya Lynn");
       
       
        //PRIMER fr
        System.out.print("To get started, please enter a care attendant's ID from the list above.\nEnter ID #: ");
        attendantID = Integer.parseInt(input.nextLine());

        //Enfore that only 11, 22, 33, 44 and sentinel value can be entered
        while (attendantID != END) {
            logEntries = logEntries + 1;
            //check to make sure it stores right input :
            //System.out.println("You entered ID #: " + attendantID);

            while (attendantID != 11 && attendantID != 22 && attendantID != 33 && attendantID != 44) {
                System.out.println("Invalid ID.\nPlease enter a new attendantID:");
                attendantID = Integer.parseInt(input.nextLine());
            }

            while (attendantID == 11 ) {
                System.out.println("Enter " + 348 + " for Badger"); 
                System.out.println("Enter " + 301 + " for Hoosier");
                System.out.println("Enter " + 388 + " for Husker");
                System.out.println("Enter " + 391 + " for Buckey");
                System.out.println("Enter " + 362 + " for Nittany");
                System.out.println("Enter " + 311 + " for Wolvey");
                System.out.print("Noah, please enter a dog ID from above:");
                dogID = Integer.parseInt(input.nextLine());
                
                while (dogID != 348 && dogID != 301 && dogID != 388 && dogID != 391 && dogID != 362 && dogID != 311) {
                    System.out.print("Invalid dog ID. Please enter a new dog ID #: ");
                    dogID = Integer.parseInt(input.nextLine());
                }
                
                System.out.print("Enter total number of minutes spent with the dog: ");
                minutesSpent = Integer.parseInt(input.nextLine());
                
                switch (dogID) {
                    case 348:
                    case 301:
                    case 388:
                    case 391:
                    totalRedGroup = totalRedGroup + 1;
                    totalRedMin = totalRedMin + minutesSpent;
                    break;
                    case 362:
                    case 311:
                    totalBlueGroup = totalBlueGroup + 1;
                    totalBlueMin = totalBlueMin + minutesSpent;
                    break;
                    default: 
                    System.out.print("unknown ID");
                    break;
                }
                //System.out.println(totalGroupMin);
                //System.out.println(totalGroup);
                
                System.out.print("Enter any notes about dog: ");
                dogNotes = input.nextLine();
                

                System.out.println("\nDaily Log of Dog Information:");
                System.out.println("Attendant ID: " + attendantID);
                System.out.println("Dog ID: " + dogID);
                System.out.println("Total minutes spent with dog: " + minutesSpent);
                System.out.println("Dog notes: " + dogNotes);
                break;
                
            }
            while (attendantID == 22) {
                System.out.println("Enter " + 325 + " for Spartan"); 
                System.out.println("Enter " + 388 + " for Hawk");
                System.out.println("Enter " + 333 + " for Gopher");
                System.out.print("Silas, please enter a dog ID from above:");
                dogID = Integer.parseInt(input.nextLine());

                
                while (dogID != 325 && dogID != 388 && dogID != 333) {
                    System.out.println("Invalid dog ID. Please enter a new dog ID #: ");
                    dogID = Integer.parseInt(input.nextLine());
                }

                System.out.print("Enter total number of minutes spent with the dog: ");
                minutesSpent = Integer.parseInt(input.nextLine());
                
                System.out.print("Enter any notes about dog: ");
                dogNotes = input.nextLine();

                switch (dogID) {
                    case 325:
                    totalGreenGroup = totalGreenGroup + 1;
                    totalGreenMin = totalGreenMin + minutesSpent;
                    break;
                    case 388:
                    case 333:
                    totalYellowGroup = totalYellowGroup + 1;
                    totalYellowMin = totalYellowMin + minutesSpent;
                    break;
                    default: 
                    System.out.print("unknown ID");
                    break;

                }
                
                System.out.println("\nDaily Log of Dog Information:");
                System.out.println("Attendant ID: " + attendantID);
                System.out.println("Dog ID: " + dogID);
                System.out.println("Total minutes spent with dog: " + minutesSpent);
                System.out.println("Dog notes: " + dogNotes);
                break;
            }
            while  (attendantID == 33) {
                System.out.println("Enter " + 388 + " for Hawk"); 
                System.out.println("Enter " + 333 + " for Gopher");
                System.out.println("Enter " + 311 + " for Wolvey");
                System.out.println("Enter " + 362 + " for Nittany");
                System.out.print("Chris, please enter a dog ID from above:");
                dogID = Integer.parseInt(input.nextLine());

                while (dogID != 388 && dogID != 333 && dogID != 311 && dogID != 362) {
                    System.out.println("Invalid dog ID. Please enter a new dog ID #: ");
                    dogID = Integer.parseInt(input.nextLine()); 
                }
                
                System.out.print("Enter total number of minutes spent with the dog: ");
                minutesSpent = Integer.parseInt(input.nextLine());
                System.out.print("Enter any notes about dog: ");
                dogNotes = input.nextLine();

                switch (dogID) {
                    case 388:
                    case 333:
                    totalYellowGroup = totalYellowGroup + 1;
                    totalYellowMin = totalYellowMin + minutesSpent;
                    break;
                    
                    case 311:
                    case 362:
                    totalBlueGroup = totalBlueGroup + 1;
                    totalBlueMin = totalBlueMin + minutesSpent;
                    break;
                    default: 
                    System.out.print("unknown ID");
                    break;

                }

                System.out.println("\nDaily Log of Dog Information:");
                System.out.println("Attendant ID: " + attendantID);
                System.out.println("Dog ID: " + dogID);
                System.out.println("Total minutes spent with dog: " + minutesSpent);
                System.out.println("Dog notes: " + dogNotes);
                break;
            }
            while (attendantID == 44) {
                System.out.println("Enter " + 348 + " for Badger"); 
                System.out.println("Enter " + 301 + " for Hoosier");
                System.out.println("Enter " + 325 + " for Spartan");
                System.out.println("Enter " + 391 + " for Buckey");
                System.out.println("Enter " + 388 + " for Husker");
                System.out.println("Mya, please enter a dog ID from above:");
                dogID = Integer.parseInt(input.nextLine());    
                
                while (dogID != 348 && dogID != 301 & dogID != 325 && dogID != 391 && dogID != 388) {
                    System.out.println("Invalid dog ID. Please enter a new dog ID #: ");
                    dogID = Integer.parseInt(input.nextLine());
                }
                System.out.print("Enter total number of minutes spent with the dog: ");
                minutesSpent = Integer.parseInt(input.nextLine());
                System.out.print("Enter any notes about dog: ");
                dogNotes = input.nextLine();
                
                switch (dogID) {
                    case 348:
                    case 301:
                    case 391: 
                    case 388:
                    totalRedGroup = totalRedGroup + 1;
                    totalRedMin = totalRedMin + minutesSpent;
                    break;

                    case 325:
                    totalGreenGroup = totalGreenGroup + 1;
                    totalGreenMin = totalGreenMin + minutesSpent;
                    break;
                    default: 
                    System.out.print("unknown ID");
                    break;
                }
                System.out.println("\nDaily Log of Dog Information:");
                System.out.println("Attendant ID: " + attendantID);
                System.out.println("Dog ID: " + dogID);
                System.out.println("Total minutes spent with dog: " + minutesSpent);
                System.out.println("Dog notes: " + dogNotes);
                break;
            }

            System.out.println("\nEnter a new attendant ID # or enter " + -1 + " to exit.\n");
            attendantID = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("******************\nSUMMARY:");

        System.out.println ("Total log entries: " + logEntries);
        System.out.println("Total Red Group Count: " + totalRedGroup + "\nTotal Red Group Minutes: " + totalRedMin);
        System.out.println("Total Blue Group Count: " + totalBlueGroup + "\nTotal Blue Group Minutes: " + totalBlueMin );
        System.out.println("Total Green Group Count: " + totalGreenGroup + "\nTotal Green Group Minutes: " + totalGreenMin);
        System.out.println("Total Yellow Group Count: " + totalYellowGroup + "\nTotal Yellow Group Minutes: " + totalRedMin);

           
        
                    
    }
} 

    //Looping structure that allow for continous iteration and checks against sentinel value
    //sentinel value - -1 
    // while (attendantID != END) {

        //Determine which dogs to display based on attendant id number 
        // switch (attendant) {
        //   case 
        // }

                //Enforce that dog ID is an applicable number according to the chart
                
                //Gather rest of information such as total numbers of min. spent with dog and dog note


                //Determine color count and total time spent by color


                //Increment count for total entries



                //OUTPUT OF CARE ATTENDANT INFO.


                //Reprompt user to enter another user and enforce that only care attendant ID #'s are entered'
