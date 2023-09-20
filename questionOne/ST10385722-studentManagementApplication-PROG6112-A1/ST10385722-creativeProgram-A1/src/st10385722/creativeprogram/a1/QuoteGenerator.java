/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10385722.creativeprogram.a1;

//extends the RandomQuoteGeneratorLogic class to turn this class into the subclass

import java.util.Scanner;

public class QuoteGenerator extends RandomQuoteGeneratorLogic
{
    
    //this method prints all of the user questions and inputs, and sends it to the logic class  
    boolean Prediction(Scanner rqgScanner)
    {
        //intializing variables
        boolean choiceQuit;
        String firstInput, secondInput;
        
        System.out.println("M: I am MacDonna, and I.. am able to tell you...YOUR DESTINY!!~");
        System.out.println("I will ask you with a series of questions. Ensure that you answer them as...truthfully as possible!");
        System.out.println("Are you ready? Press enter to continue");
        rqgScanner.nextLine();
        //start of the user prompts
        System.out.println("M: Firstly, I need a glimpse at your... inner mind~~\n"
        + "\nProvide me with your favourite thing to do~");
        System.out.print("Answer here>>");
        firstInput = rqgScanner.nextLine();
        super.RandomQuoteGeneratorLogic(firstInput, "");
        boolean gotEasterEgg = super.getEasterEgg();
        if (gotEasterEgg) 
        {
            System.exit(0);
        }
        System.out.println("\nM: Yes, i see an image formulating~\n"
                + "\nNext, bestow upon me something that is...your nearest and dearest~");
        System.out.print("Answer here>>");
        secondInput = rqgScanner.nextLine();
        //saves the userInputs to the constructor in the parent class
        
        super.RandomQuoteGeneratorLogic(firstInput, secondInput);
        
        System.out.println("\nM: Yes, that is perfect~\n");
        
        //taking returned value from the string
        System.out.println("M: Lastly, tell me...Which from these activites would you partake in the most?~"
        + "\n(1) Hiking"
        + "\n(2) Running"
        + "\n(3) Commiting crimes"
        + "\n(4) Wiggle wiggle wiggle\n");
        System.out.print("Answer here>>");
        int choice = rqgScanner.nextInt();
        
        String activity = super.chooseActivity(choice);
        rqgScanner.nextLine();
        System.out.println(activity);
        System.out.println("\nM: Are you ready, to find out your... DESTINY?~"
                + "\nPress enter to continue");
        rqgScanner.nextLine();
        super.randomJumbledNumbers();
        super.fillerWordArray();
        
        //saves the returned values from the randomX methods to these String variables
        String verbForSentence = randomVerbs();
        String nounForSentence = randomNoun();
        
        //shows that the logic is complete
        System.out.println("M: The predicition... is complete~"
        + "\nYour destiny is...\n\n");
        
        //prints the completed sentence
        System.out.println(super.getStartOfSentence() + verbForSentence + " " + nounForSentence + super.getEndOfSentence());
        
        System.out.println("\n\nM: Did you find your destiny...satisfactory?~"
                + "\nEnter \"yes \" or \"no\"~~");
        System.out.print("Answer here>>");
        String choiceReview = rqgScanner.nextLine();
        //calls the overriden method from the parent class
        choice(choiceReview);
        
        //gives the user the option to quit the program or to run it
        System.out.println("M: Do you want me to take another attempt at...FINDING YOUR DENSITY.. I MEAN DESTINYYYYYY!!~~"
        + "\nEnter (1) for yes or anything for no");
        System.out.print("Answer here>>");
        String choiceQuitStr = rqgScanner.nextLine();
        //if statement checks whether the user wants to continue the program
        if(choiceQuitStr.equals("1"))
        {
            choiceQuit = false;
            return choiceQuit;
        }
        
        choiceQuit = true;
        
        return choiceQuit;
    }
    
    //overriden method
    @Override
    void choice(String choiceReview)
    {
 
        switch(choiceReview.toLowerCase())
        {
            case "yes":
                System.out.println("\n\nM: Thank you for... positive review~\n\n");
            break;
            case "no":
                System.out.println("\n\nM: What do you expect, I am just machine code executing subpar human code!\n\n");
            break;
            default:
                System.out.print("M: Wrong answer love, try again~~");
                choiceReview = rqgScanner.nextLine();
                choice(choiceReview);
            break;
        }

    }
    
    
}
