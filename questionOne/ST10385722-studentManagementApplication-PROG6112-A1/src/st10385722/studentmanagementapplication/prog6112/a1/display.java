/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10385722.studentmanagementapplication.prog6112.a1;

import java.util.Scanner;

public class display
{
    //instantiating an object for the student class
    Student st = new Student();
    static boolean studentCaptured = false;
    //method to welcome user as well as give them the option to quit
    boolean welcomeLogic()
    {
        //scanner class for the welcome method
        Scanner wc = new Scanner(System.in);
        //making a constant variable for the login 
        String CORRECT_VALUE = "1";
        
        boolean confirmLaunch = false;
        System.out.println("Enter (1) to launch menu or any other key to exit");
        String confirm = wc.nextLine();
        //an if statement that checks whether the value entered is correct to continue
        if (confirm.equals(CORRECT_VALUE)) 
        {
            //makes the boolean true to let the next method run
            confirmLaunch = true;
        }
        else
        {
            //exits the application immedietly 
            System.exit(0);
        }
        //returns the value 
        return confirmLaunch;
        
    }//welcome logic method ends

    //displays the menu to select methods from the student class
    void displayMenu()
    {
        Scanner dm = new Scanner(System.in);
        //calls the welcome method, which also allows this if statement to work
        if(welcomeLogic() == true)
        {
            System.out.println("Please select one of the following menu items:"
                + "\n(1) Capture a new student."
                + "\n(2) Search for a student."
                + "\n(3) Delete a student."
                + "\n(4) Print student report"
                + "\n(5) Exit Application");
            String menuChoice = dm.nextLine();
            //switch case to check the input
            switch(menuChoice)
            {
                case "1":
                    st.SaveStudent(dm);
                    studentCaptured = true;
                    displayMenu();            
                break;
                case "2":
                    //for the other switch cases, it checks whether the array list has been populated
                    if (studentCaptured) 
                    {
                        st.SearchStudent(dm); 
                        displayMenu();
                    }
                    else
                    {
                        System.out.print("There are no values to be displayed!\n\n");
                        displayMenu();
                    }
                    
                break;
                case "3":
                    if (studentCaptured) 
                    {
                        st.DeleteStudent(dm);
                        displayMenu();
                    }
                    else
                    {
                        System.out.print("There are no values to be displayed!\n\n");
                        displayMenu();
                    }
                break;
                case "4":
                    if (studentCaptured) 
                    {
                        st.StudentReport();
                        displayMenu();
                    }
                    else
                    {
                        System.out.print("There are no values to be displayed!\n\n");
                        displayMenu();
                    }
                break;
                case "5":
                    st.ExitStudentApplication();
                break;
                default:
                    System.out.print("Invalid choice entered!\n\n");
                    displayMenu();
                break;
            }
        }
    }//displayMenu method ends

}//display class ends
