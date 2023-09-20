/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10385722.creativeprogram.a1;

import java.util.Scanner;

public class ST10385722CreativeProgramA1 
{
    static final QuoteGenerator qg = new QuoteGenerator();
    public static void main(String[] args) 
    {   
        Scanner temp = new Scanner(System.in);
        /*
            My program is going to generate random quotes that works from:
        
            -- math.random to choosen random numbers. These numbers will be
            used to get the elements from a 2D array to generate a random sentence
            --the user will also input some variables, which the program takes the
            length of the word and uses it in the code
            --such as a verb, subject and object
            --math.random will run through a range and pick a random starting
            or ending message to make it funny
            uses concepts from lu1 and lu2
        */
        
        //calls the welcome method to start the program
        welcomeToYourDestiny();
        //the return boolean is used to quit the application
        boolean quit = qg.Prediction(temp);
        if (quit) 
        {
            System.out.println("M: Come Againnnnnn~~~");
            System.exit(0);
        }
        //if its false, instead of an else statement, there is just the
        //call to the method again
        qg.Prediction(temp);
        
    }//main ends
    
    //welcomes the user to the program
    public static void welcomeToYourDestiny()
    {
        System.out.println(" __          __ ______  _       _____  ____   __  __  ______       _______  ____                         \n" +
" \\ \\        / /|  ____|| |     / ____|/ __ \\ |  \\/  ||  ____|     |__   __|/ __ \\                        \n" +
"  \\ \\  /\\  / / | |__   | |    | |    | |  | || \\  / || |__           | |  | |  | |                       \n" +
"   \\ \\/  \\/ /  |  __|  | |    | |    | |  | || |\\/| ||  __|          | |  | |  | |                       \n" +
"    \\  /\\  /   | |____ | |____| |____| |__| || |  | || |____         | |  | |__| |                       \n" +
"     \\/  \\/    |______||______|\\_____|\\____/ |_|  |_||______|        |_|   \\____/                        \n" +
" __     __ ____   _    _  _____       _____   ______   _____  _______  _____  _   _ __     __            \n" +
" \\ \\   / // __ \\ | |  | ||  __ \\     |  __ \\ |  ____| / ____||__   __||_   _|| \\ | |\\ \\   / /            \n" +
"  \\ \\_/ /| |  | || |  | || |__) |    | |  | || |__   | (___     | |     | |  |  \\| | \\ \\_/ /             \n" +
"   \\   / | |  | || |  | ||  _  /     | |  | ||  __|   \\___ \\    | |     | |  | . ` |  \\   /              \n" +
"    | |  | |__| || |__| || | \\ \\     | |__| || |____  ____) |   | |    _| |_ | |\\  |   | |     _   _   _ \n" +
"    |_|   \\____/  \\____/ |_|  \\_\\    |_____/ |______||_____/    |_|   |_____||_| \\_|   |_|    (_) (_) (_)");
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\nWELCOME TO YOUR FUTURE DESTINYYYYYYYYYY"
                + "\nENTER, IF YOU DAREEEEE..."
                + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\nps. Use Full Screen for best results~\n\n");
    }//welcome method ends
    
}//class ends

//references
/*
Farrell, J. (2023) Java programming. Boston, MA: Cengage. 
Cooper, J. (2023) 145 best java project ideas for beginners and experts, Blog - Great Assignment Help. Available at: https://www.greatassignmenthelp.com/blog/java-project-ideas/ (Accessed: 20 September 2023). 
H, S. (1957) Print array without brackets and commas, Stack Overflow. Available at: https://stackoverflow.com/questions/4389480/print-array-without-brackets-and-commas (Accessed: 20 September 2023). 
Kumar, S. (2023) How to add an element to an array in java?, Online Courses and eBooks Library. Available at: https://www.tutorialspoint.com/how-to-add-an-element-to-an-array-in-java (Accessed: 20 September 2023). 
Nguyen, L. (2023) Long Nguyen, Long Nguyen | AP Computer Science A Resources. Available at: https://longbaonguyen.github.io/courses/apcsa/apjava.html (Accessed: 20 September 2023). 
Unknown (2015) How to declare arraylist with values in java?, Java67. Available at: https://www.java67.com/2015/10/how-to-declare-arraylist-with-values-in-java.html (Accessed: 20 September 2023). 



*/
