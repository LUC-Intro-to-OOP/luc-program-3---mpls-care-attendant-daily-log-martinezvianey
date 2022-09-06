#  MPLS care attendant Daily Log

The MPLS care attendant Daily Dog Log is a program that allows the care attendant manager to  enter daily logs for each Dog in MPLS Dog boarding School.  
Listed below is a chart with the name of each care attendant and the name of each dog in their care.  The program allows the care attendant to continuously 
enter their id# and enter the total amount of time spent with the dog and a general note about the dog's day. Once the care attendant id # is entered, the care attendant
will be prompted to select the dogs who fall under their care.  For each dog entered, The program provides a summary of all entered information for a dog. The program should enforce that only care attendants with the id numbers listed in the chart below can be entered.    

Once the manager is done entering all logs, the program will display a count of total dogs entered, a count of the total number of dogs entered from each 
color group, along with the total time the care attendant spent with the various dogs. The program also provides you with a summary of the dog with the most care minutes.

Your program should operate similarly to the program shown in the .gif below
The .gif below show three iterations of running the program

![Alt text](https://instructorc.github.io/site/slides/java/images/structures/rendered_output_prog3.gif "Program 3 Execution Example")

**ARRAYS CANNOT BE USED FOR THIS PROGRAM**

| ID # | Care Attendant Name | Assigned Color Group                                        |
|------|---------------------|------------------------------------------------------|
| 11   | Noah Charles        |  BLUE, RED     |
| 22   | Silas Alexander     |  GREEN, YELLOW |
| 33    | Chris Isaac        |  BLUE, YELLOW |                               
| 44   | Mya Lynn            |  RED, GREEN    |


**** List of dogs currently in care
| ID # | Dog Name | Dogs in Care                                         |
|------|---------------------|------------------------------------------------------|
| 348   | Badger    | RED      |
| 301   | Hoosier   | RED      |
| 325   | Spartan   | GREEN    |
| 388   | Hawk      | YELLOW   |
| 333   | Gopher    | YELLOW   |
| 388   | Husker    | RED      |
| 391   | Bucky     | RED      |
| 362   | Nittany   | BLUE     |
| 311   | Wolvey    | BLUE     |


### Sample output from Video
```
Welcome to the MPLS care attendant daily log program.  This program will 
allow you to enter a care attendant id and produce a log for the dogs under the attendant's care.

Enter 11 for Noah Charles
Enter 22 for Silas Alexander
Enter 33 for Chris Isaac
Enter 44 for Mya Lynn
To get started, please enter a care attendant's id from the list above
Enter ID #: 10
Sorry, Invalid attendant ID #, please enter a valid id.
Enter ID #: 11

Enter 348 for Badger
Enter 301 for Hoosier
Enter 388 for Husker
Enter 391 for Bucky
Enter 362 for Nittany
Enter 311 for Wolvey
Noah, enter id # from the dogs above:301
Enter total number of minutes spent with dog: 23
Enter note about dog: Dog ate well
Dog Information:
*********************************
Attendant ID #: 11
Dog ID #:       301
Min. w/Dog:     23.0
Notes:  Dog ate well
*********************************

Enter 11 for Noah Charles        
Enter 22 for Silas Alexander     
Enter 33 for Chris Isaac
Enter 44 for Mya Lynn
Enter another ID # or enter -1 to exit: 22

Enter 325 for Spartan
Enter 388 for Hawk
Enter 333 for Gopher
Silas, enter id # from the dogs above:300
Sorry, Invalid dog ID, Please enter an applicable dog id number
Dog id: 325
Enter total number of minutes spent with dog: 12
Enter note about dog: Dog played well with others
Dog Information:
*********************************
Attendant ID #: 22
Dog ID #:       325
Min. w/Dog:     12.0
Notes:  Dog played well with others
*********************************

Enter 11 for Noah Charles
Enter 22 for Silas Alexander
Enter 33 for Chris Isaac
Enter 44 for Mya Lynn
Enter another ID # or enter -1 to exit: 33

Enter 362 for Nittany
Enter 311 for Wolvey
Enter 388 for Hawk
Enter 333 for Gopher
Chris, enter id # from the dogs above:333
Enter total number of minutes spent with dog: 12
Enter note about dog: Dog was sluggish
Dog Information:
*********************************
Attendant ID #: 33
Dog ID #:       333
Min. w/Dog:     12.0
Notes:  Dog was sluggish
*********************************

Enter 11 for Noah Charles
Enter 22 for Silas Alexander
Enter 33 for Chris Isaac
Enter 44 for Mya Lynn
Enter another ID # or enter -1 to exit: -1

Thanks for entering your dog logs
*************************************
Total # of log entries: 3
        Red total count: 1      Red total # of min.: 23
        Green total count: 1    Green total # of min.: 12
        Yellow total count: 1   Yellow total # of min.: 12
        Blue total count: 0     Blue total # of min.: 0
```

### Listed below is a list of requirements that need to be completed for your program

## Requirement 1 (5 Points)
Variables are properly declared and initialized; Use of Scanner Object to read input from console. Make use of constant final variables. 
Whenever possible, make sure to declare all variables that will hold data along with declaring final variables that will not change during runtime.
Proper structure used for allowing care attendant to continously enter new dog logs until they enter a sentinel value that will indicate they are finished

## Requirement 2 (5 Points)
Input/Output of all necessary information for each dog entry; Program correctly identifies the dogs assigned to each user based on color group; Program restricts the use of the id numbers shown in chart for each care attendant and restricts the use of dog id's shown in chart (Defensive Programming).

## Requirement 3 (5 Points)
At the conclusion of all dog log entries, the program provides a tally of 1)Total number of dogs entered 2) Total number of dogs entered by color group and 3) Total time spent with each dog entered

## Requirement 4 (5 Points)
Style - Proper use of comments, spacing, in program; use of descriptive variable names

## Requirement 5 (5 Points)
Program is submitted by the due date listed and pushed to assigned GitHub Repository; Repository contains a minimum of three commits.


## Submission
Your project folder will need to be submitted to the assigned GitHub repository provided to you by the instructor. In Sakai, you will need to submit the link to your repository by the due date and time listed in the write-up. Make sure you receive confirmation from Sakai that your assignment has been submitted.




