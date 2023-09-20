/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10385722.studentmanagementapplication.prog6112.a1;

import java.util.ArrayList;
import java.util.Scanner;

public class Student 
{
    //all of the array lists for the program
    //reason for arrayList:
    /*
        -built in methods allow for easier iteration and deletion from the list
        -easier to delete when it comes to a parrell setup
    */
    ArrayList<Integer> studentID = new ArrayList<>();
    ArrayList<String> studentName = new ArrayList<>();
    ArrayList<Integer> studentAge = new ArrayList<>();
    ArrayList<String> studentEmail = new ArrayList<>();
    ArrayList<String> studentCourse = new ArrayList<>();
   
    //method to capture student
    void SaveStudent(Scanner ss)
    {
        //Scanner ss = new Scanner(System.in);
        System.out.println("CAPTURE A NEW STUDENT"
                + "\n**************************************");
        System.out.print("Enter the student ID: ");
        //takes the input as well as adds it to the array list in 1 line
        studentID.add(ss.nextInt());
        //allows the nextInt() to run
        ss.nextLine();
        
        System.out.print("Enter the student name: ");
        studentName.add(ss.nextLine());
        
        System.out.print("Enter the student age: ");
        
        //gives the ageChecker its own method so that it can handle all of the logic of it
        StudentAge(ss);

        System.out.print("Enter the student email: ");
        studentEmail.add(ss.nextLine());
        
        System.out.print("Enter the student course: ");
        studentCourse.add(ss.nextLine());
        
        System.out.print("Student data successfully captured!\n\n"); 
    }//SaveStudent method ends
    
    //method that checks whether the age follows the rules
    //returns a boolean so that it can also be used for Junit testing
    boolean StudentAge(Scanner sa)
    {
        boolean ageVerify = false;
        //saves the input as a string so the code doesnt crash
        String ageCheckstr = sa.nextLine();
        int age;
        /*
        a try execution that checks whether the string contains only numbers,
        some numbers and a letter, or only letters.
        If the string contains the letter, the age int is reset to zero.
        This helps in the if statement below it, which allows us to re-enter
        the value until a valid one is entered
        */
        try
                {
                    age = Integer.parseInt(ageCheckstr);
                }
                catch (NumberFormatException e)
                {
                    age = 0;
                    ageVerify = false;
                }
        if (age >= 16) 
        {
            //only when the age is valid, it is added to the array list
            studentAge.add(age);
            ageVerify = true;
        }
        else
        {
            //a while statement that ensure the code is not left until a valid entry is entered
            while(!ageVerify)
            {
                //a redo of the code above
                System.out.println("You have entered a incorrect student age!!!");
                ageVerify = false;
                System.out.print("Please re-enter the student age >> ");
                ageCheckstr = sa.nextLine();
                try
                {
                    age = Integer.parseInt(ageCheckstr);
                }
                catch (NumberFormatException e)
                {
                    age = 0;
                    ageVerify = false;
                }
                if (age >= 16) 
                {
                    studentAge.add(age);
                    ageVerify = true;
                }
            }
        }
        return ageVerify;
        
    }//student age class ends
    
    //method that searches for the student from the arrayList
    int toSearch;
    boolean SearchStudent(Scanner sst)
    {
        int element;
  
        boolean foundStudent;
        //Scanner sst = new Scanner(System.in);
        System.out.print("Enter the student ID to search: ");
        //saving the input to a variable so that it can be concatinated in a system out println
        toSearch = sst.nextInt();
        //checks whether there is an instnace of the nextInt() input
        element = studentID.indexOf(toSearch);
        //if there is no value found, the int is set to the value -1, which can be used in a if statment
        if (element == -1) 
        {
            System.out.print("Student with Student ID: " + toSearch + " was not found!\n\n");
            foundStudent = false;
            return foundStudent;
        }
            //prints the information using the indexOf() value to ensure requested data is shown
            System.out.println("-----------------------------------------"
            + "\nSTUDENT ID: " + studentID.get(element)
            + "\nSTUDENT NAME: " + studentName.get(element)
            + "\nSTUDENT AGE: " + studentAge.get(element)
            + "\nSTUDENT EMAIL: " + studentEmail.get(element)
            + "\nSTUDENT COURSE: " + studentCourse.get(element)
            + "\n-----------------------------------------"); 
            foundStudent = true;
            return foundStudent;
            
    }//SearchStudent method ends
     
    //class that deletes a student from the arrayLists
    boolean DeleteStudent(Scanner ds)
    {
        //Uses the code from the SearchStudent class to search for the student in the arrayList
        boolean studentDeleted = false;
        //Scanner ds = new Scanner(System.in);
        int element;
        int toSearchForDeletion;
        String deletionConfirmation;
        System.out.print("Enter the student ID to delete : ");
        toSearchForDeletion = ds.nextInt();
        element = studentID.indexOf(toSearchForDeletion); 
        if (element == -1) 
        {
            System.out.print("Student with Student ID: " + toSearchForDeletion + " WAS not found\n\n");
            return studentDeleted;
        }
        ds.nextLine();
        //does a confirmation prompt to ensure that you want to delete the student
        System.out.println("Are you sure you want to remove student " + toSearchForDeletion + " from the system?"
        + "\nYes (y) to delete or No (n) to cancel");
        deletionConfirmation = ds.nextLine();
        //switch statement to check the requested choice from the user
        switch(deletionConfirmation)
        {
            //this case removes the students information from all the array lists
            case "y":
                studentID.remove(element); studentName.remove(element); studentAge.remove(element);
                studentEmail.remove(element); studentCourse.remove(element);
                //tells the user that data has been deleted for quality of life
                System.out.println("-----------------------------------------"
                + "\nStudent with Student Id: " + toSearchForDeletion + " WAS deleted!"
                + "\n-----------------------------------------");
                studentDeleted = true;
            break;
            //this case cancels the deletion
            case "n":
                System.out.println("Deletion cancelled!");
                studentDeleted = false;
            break;
            //a default
            default:
                System.out.println("Invalid choice entered!");
                DeleteStudent(ds);
            break;
        }
        return studentDeleted;
    }//DeleteStudent method ends
    
    //this method prints all information stored on the array lists
    void StudentReport()
    {
        //the isEmpty() method checks whether one of the array lists are deleted, and since the array lists are parrallel
        //all of the array lists are empty
        if(studentID.isEmpty())
        {
            System.out.println("There are no values to display!");
        }

        //a for loop that runs through the entire array list
        for (int i = 0; i < studentID.size(); i++)
        {
            //adds 1 to the element to show what student it is
            System.out.println("STUDENT " + (i + 1)
            + "\n-----------------------------------------"
            + "\nSTUDENT ID: " + studentID.get(i)
            + "\nSTUDENT NAME: " + studentName.get(i)
            + "\nSTUDENT AGE: " + studentAge.get(i)
            + "\nSTUDENT EMAIL: " + studentEmail.get(i)
            + "\nSTUDENT COURSE: " + studentCourse.get(i)
            + "\n-----------------------------------------");
        }
        
    }//StudentReport method ends
    
    //this method exits the application
    void ExitStudentApplication()
    {
        System.out.println("Thank you for using my program");
        System.exit(0);
    }//ExitStudentApplication method ends

}//student class ends
