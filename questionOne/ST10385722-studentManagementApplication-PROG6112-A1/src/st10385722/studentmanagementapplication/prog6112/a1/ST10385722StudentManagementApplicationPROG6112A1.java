/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10385722.studentmanagementapplication.prog6112.a1;

public class ST10385722StudentManagementApplicationPROG6112A1 
{
    //static variable to access the display class
    static display dp = new display();
    //main
    public static void main(String[] args) 
    {
        //calls the top part of the welcome message
        welcomeMessage();
        //calls the bottom part of the welcome message
        dp.displayMenu();
    } //main ends
    
    //welcome method 
    public static void welcomeMessage()
    {       
        System.out.println("STUDENT MANAGEMENT APPLICATION"
                + "\n**************************************");
    }//welcome method ends
    
}//Main class ends

//references
/*
Java programming, joyce farrell, ninth edition.
Ken (2009) In Java, should variables be declared at the top of a function, or as they’re needed?, Stack Overflow. Available at: https://stackoverflow.com/questions/1411463/in-java-should-variables-be-declared-at-the-top-of-a-function-or-as-theyre-ne (Accessed: 04 September 2023). 
Parahar, M. (2022) How do you search for an element in an arraylist in Java, How do you search for an element in an ArrayList in Java. Available at: https://www.tutorialspoint.com/how-do-you-search-for-an-element-in-an-arraylist-in-java (Accessed: 04 September 2023). 
User, U. (2011) How do I convert a string to an INT in Java?, Stack Overflow. Available at: https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java (Accessed: 04 September 2023). 
*/
