/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10385722.creativeprogram.a1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//parent class for the QuoteGenerator class, which displays the logic
public class RandomQuoteGeneratorLogic 
{
    Scanner rqgScanner = new Scanner(System.in);
    //creates inputted values as private for information hiding
    private String verb;
    private String noun; 
    //private is used here so that a constructor can be made for these 2 variables
    private String startOfSentence;
    private String endOfSentence;
    
    //constructor
    void RandomQuoteGeneratorLogic(String verb, String noun)
    {
        this.verb = verb;
        this.noun = noun;
    }
    
    //constructor for the sentence structure
    void setSentence(String startOfSentence, String endOfSentence)
    {
        this.startOfSentence = startOfSentence;
        this.endOfSentence = endOfSentence;
    }
    
    //getters
    public String getVerb()
    {
        return verb;
    }
    
    public String getNoun()
    {
        return noun;
    }
    
    public String getStartOfSentence()
    {
        return startOfSentence;
    }
    
    public String getEndOfSentence()
    {
        return endOfSentence;
    }
    
    //this method hardcodes the array values into a 2D array, so that it can be used to generate a sentence
    public String[][] fillerWordArray()
    {
        String[][] fillerWords = new String[10][2];
        
        fillerWords[0][0] = "I see you, admiring the sunset, "; fillerWords[0][1] = " with a smile.";
        
        fillerWords[1][0] = "I witness you under the bright moonlight, and you "; fillerWords[1][1] = " in the distance.";
        
        fillerWords[2][0] = "I percieve you going around a corner"; fillerWords[2][1] = " without a care.";
        
        fillerWords[3][0] = "I envision you, Among(us) the tall grass, doing "; fillerWords[3][0] = " through the mist.";
        
        fillerWords[4][0] = "I see in your mind, thinking about doing "; fillerWords[4][1] = " soothes you like no other.";
        
        fillerWords[5][0] = "I see... beyond the (Forza)Horizion, you "; fillerWords[5][1] = " and its is so serene.";
        
        fillerWords[6][0] = "I see the inside of an old castle "; fillerWords[6][1] = " without hesitation.";
        
        fillerWords[7][0] = "I observe... a closed door, and when it is open, I see you "; fillerWords[7][1] = " and with delight.";
        
        fillerWords[8][0] = "I see you, under the blankets of the stars above,  "; fillerWords[8][1] = " ever so gently.";
        
        fillerWords[9][0] = "In my restless dream, I see that town, "; fillerWords[9][1] = " Silent hill.";
                 
        System.out.println("\n\nYes, I see it clearly, your destiny");
        
        //creating static variables for min and max of the math.random() method
        int MINIMUM_VALUE = 0;
        int MAXIMUM_VALUE_COL = 9;
        
        //generates a random int to be used as index for the arrays. This allows for a different values to be generated
        //everytime the code is run. It then saves this value to a int variable.
        int randomIntColOne= (int)Math.floor(Math.random() * (MAXIMUM_VALUE_COL - MINIMUM_VALUE + 1) + MINIMUM_VALUE);
        int randomIntColTwo = (int)Math.floor(Math.random() * (MAXIMUM_VALUE_COL - MINIMUM_VALUE + 1) + MINIMUM_VALUE);
        
        //saves the array output to a string, so that it can be returned
        //since the arrays are printed spefically that the startings of the sentence are
        //on coulomn zero and the ends are on coulomn 1, it prints correctly
        String startOfSentenceMethod = fillerWords[randomIntColOne][0];
        String endOfSentenceMethod = fillerWords[randomIntColTwo][1];
        
        //using the constructor made for the sentences, i can add the values to it
        setSentence(startOfSentenceMethod, endOfSentenceMethod);   
        
        return fillerWords;
    }//fillerWordArray ends
    
    //gives the user a "random" verb, but actually just uses the length of the inputted
    //String, and returns it
    
    private boolean easterEgg()
    {
        boolean easterEggCheck;
        if(verb.equals("uwu"))
        {
            System.out.println("M: Haha, you found the easter egg, "
                    + "you damn furry!~");
            System.out.println("@@@@@@@@@@@@@&,@@@@@@@@@@@,@@@@@@&,   /&@@@@@@@@@@@@@**@@@@@@@@@@@@@(*@@@@@@@@@@\n" +
                               "@@@@@@@@@@@@@/#@@@@@@@@@@@@(.@@@@@*&@@@@@@/.(@@@@@@/(@@@@@@@@@@@@@@@& &@@@@@@@@@\n" +
    "@@@@@@@@@@@@&.@@@@@@@@@@@@@@@#.@@@@,&@@@@@@@@&./@@.&@@@@@@@@@@@@@@@@@,@@@@@@@@@@\n" +
                       "@@@@@@@@@@@@%#@@@@@@@@@@@@@@@@@% @&/ ,%@@@@@@@@@( /@@@@@@@@@@@@@@@@@@,@@@@@@@@@@\n" +
                               "@@@@@@@@@@@@%#@@@@@@@@@@@@@@@@&,,&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,@@@@@@@@@@\n" +
             "@@@@@@@@@@@@%#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,@@@@@@@@@@\n" +
                               "@@@@@@@@@@@@%#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&/@@@@@@@@@@\n" +
          "@@@@@@@@@@@@@,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*#@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@,&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@@@@@@/(@@@@@@@@@@@\n" +
                            "@@@@@@@@@@@@@@.@@@@@&(/./(%%.. .. /@@@@@@@@@@@..... @@@@.&@@@@@@@@**@@@@@@@@@@@@\n" +
                        "@@@@@@@@@@@@@@@,%@@@@@ @@@@&.. ...*@@@@@@@@@@% .... @@@@@.&@@@@**&&@@@@@@@@@@@@@\n" +
                    "@@@@@@@@@@ . ,,/((%@@%(@@@@&. ....*@@@@@@@@@@& .... &@@@@(%@@@@@@@@@//@@@@@@@@@@\n" +
                                        "@@@@@@@@@@@,/@@@@@@@@(&@@@@@..... @@@@@@@@@@@@*... #@@@@@(%@@@@@@@,/@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@%.(@@@@@@,@@@@@@@%#&@@@/..,@@@@@@@@@@@@@@@@@@@@@@@% &@@@@@@@@@@@@@@\n" +
                    "@@@@@@@@@@@@@@@.@@/#%/&(/&@@@@@@@@@@@@@@@@@@@@@@@@@@@%/(#/&@@@@@(*@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@&.@@@@@&&@@@@@@@@@@@@@@@&.. .(&% #@@@@@@@@@@@@@@@@@@@./@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@/&@@@@@&@@@@@@@@@@@@@@&@@@@@@@@@@@@@@@@@@@@@%,&@@@%/*..%@@@@@@@@@@@\n" +
        "@@@@@@@@@@@@@@@@@@@@@@%.,/%&@@@@@@@@@@@@@@@@@@@@@@&#/.*#&@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@%,&&/...,/@@@@@@@@@@@@@@@@/&@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@/*@@@@@@@@@@@@@@@@@@@@@@@&.@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@& &@@@@@@@@@@@@@@@@@@@@@@,%@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@# @@@@@@@@@@@@@@@@@@@@@@@@@@,#@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@@@@@@@@@@,%@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ &@@@@@@@@@@@@@@@@@@@@@@@@&,@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/#@@@@@@@@@@@@@@@@@@@@@@@@@@.&@@@@@@@@@@@@@@@@@@@@@");
            return easterEggCheck = true;
        }
        
        return easterEggCheck = false;
    }
    
    public boolean getEasterEgg()
    {
        boolean easterEgg = easterEgg();
        return easterEgg;   
    }
    String randomVerbs()
    {
        
       String chosenVerbFromList = "";
   
        //saves the verbs to a ARRAYLIST
        ArrayList<String> listOfVerbs = new ArrayList<>(Arrays.asList(
        "embrace",
        "whisper",
        "tremble",
        "enchant",
        "shatter",
        "cradle",
        "celebrate",
        "conquer",
        "mourn",
        "transmit"));
        
        //takes the users inputted verb, and gets its length
        int verbLength = verb.length();
        //a switch statement that checks the lenght of the word, and gives the
        //appropriate verb from the arrayList
        switch(verbLength)
        {
            case 1: chosenVerbFromList = listOfVerbs.get(0); break;
            case 2: chosenVerbFromList = listOfVerbs.get(1); break;
            case 3: chosenVerbFromList = listOfVerbs.get(2); break;
            case 4: chosenVerbFromList = listOfVerbs.get(3); break;
            case 5: chosenVerbFromList = listOfVerbs.get(4); break;
            case 6: chosenVerbFromList = listOfVerbs.get(5); break;
            case 7: chosenVerbFromList = listOfVerbs.get(6); break;
            case 8: chosenVerbFromList = listOfVerbs.get(7); break;
            case 9: chosenVerbFromList = listOfVerbs.get(8); break;
        }
        //this ensures that the program doesnt crash, and gives the user 
        //a generic value
        if(verbLength > 10)
        {
            chosenVerbFromList = "slowly";
        }

        return chosenVerbFromList;
    }//randomVerb method ends
    
    //does the same thing as the randomVerb method, but uses a standard
    //ARRAY instead of an arrayList
    String randomNoun()
    {
        String chosenNounFromList = "";
        String[] listOfNouns = new String[10];
        listOfNouns[0] = "infitiy"; listOfNouns[1] = "treasures "; 
        listOfNouns[2] = "blossom"; listOfNouns[3] = "harmony";
        listOfNouns[4] = "resillence"; listOfNouns[5] = "adventure";
        listOfNouns[6] = "cascade"; listOfNouns[7] = "laughter";
        listOfNouns[8] = "embrace"; listOfNouns[9] = "meadow";
        
        int nounLength = noun.length();
        switch(nounLength)
        {
            case 1: chosenNounFromList = listOfNouns[0]; break;
            case 2: chosenNounFromList = listOfNouns[1]; break;
            case 3: chosenNounFromList = listOfNouns[2]; break;
            case 4: chosenNounFromList = listOfNouns[3]; break;
            case 5: chosenNounFromList = listOfNouns[4]; break;
            case 6: chosenNounFromList = listOfNouns[5]; break;
            case 7: chosenNounFromList = listOfNouns[6]; break;
            case 8: chosenNounFromList = listOfNouns[7]; break;
            case 9: chosenNounFromList = listOfNouns[8]; break;
            case 10: chosenNounFromList = listOfNouns[9]; break;
        }
        if(nounLength > 10)
        {
            chosenNounFromList = "absorb";
        }
        return chosenNounFromList;
           
    }
    //enum that houses the choices the user can make in the code
    enum ChosenActivity{HIKING, RUNNING, COMMITING_CRIMES, WIGGLE_WIGGLE_WIGGLE};
    
    //method that chooses the activity depending on the users input
    String chooseActivity(int choice)
    {
        String activityToPrint = "";
        //takes the users choice and casts it to a getChosenActivity method to get the choice from the enum
        ChosenActivity ca = getChosenActivity(choice);
        //one the value is returned, it is put in a switch case and gives a QUIRKY output
        switch(ca)
        {
            case HIKING:
                activityToPrint = "\nM: One of those fitness people i assume?~";
            break;
            case RUNNING:
                activityToPrint = "\nM: Running, but from what?~";
            break;
            case COMMITING_CRIMES:
                activityToPrint = "\nM: Yes, I like it!~";
            break;
            case WIGGLE_WIGGLE_WIGGLE:
                activityToPrint = "\nM: Really? I put that for comedic effect";
            break;
            default:
                throw new UnsupportedOperationException("Wrong choice dear");
        }
       return activityToPrint; 
    }//chooseActivity method ends
    
    //this method takes the choice input from the above method and chooses the correct enum from the format
    //of the printed statement
    ChosenActivity getChosenActivity(int choice)
    {
            switch(choice)
            {
                case 1:
                    return ChosenActivity.HIKING;
                case 2:
                    return ChosenActivity.RUNNING;
                case 3:
                    return ChosenActivity.COMMITING_CRIMES;
                case 4:
                    return ChosenActivity.WIGGLE_WIGGLE_WIGGLE;
            }
    
        return null;
    }
    
    //creates a wall of numbers to make it seem that the computer is "Thinking"
    void randomJumbledNumbers()
    {
        //static values for the min and max values
        int MINIMUM_VALUE = 0;
        int MAXIMUM_VALUE = 1;
        //arrayList that is used below
        ArrayList<Integer> randNum = new ArrayList<>();
        int addToElement;
        
        //gives the illusion that the program is thinking
        System.out.println("M: YES, I CAN SEE IT, THE 0'S AND 1'S FORMULATING\n\n");

        //FOR loop to add values to the arrayList
        for (int i = 0; i < 50; i++) 
        {
            //generates random values to add to the array, same as with the fillerWord() method
            addToElement = (int)Math.floor(Math.random() * (MAXIMUM_VALUE - MINIMUM_VALUE + 1) + MINIMUM_VALUE);
            //adds the values to the arrayList
            randNum.add(addToElement);
        }
        
        //incersion sort used for displaying and sorting the arrayList
        for (int i = 0; i < randNum.size(); i++) 
        {
            //removes the current element from the index, and adds it later
            int temp = randNum.remove(i);
            int index = i - 1;
            while(index >= 0 && temp < randNum.get(index))
                index--;
            //using toString to cast the arrayList to a string, so that i can remove the square brackets and commas
            //and displays it
            //this try catch block prints the code, then waits 200 ms, or 0.2 seconds, and then prints again, to give 
            //the illusion of printing
            //the reason for the catch is to ensure that the program does not crash due to the exception
            try 
            { 
            Thread.sleep(200); // 10000ms = 10s 
            } 
            catch(InterruptedException ex)
            { 
            System.exit(0); 
            } 
            System.out.println(randNum.toString().replace("[","").replace("]","").replace(",", ""));
            randNum.add(index + 1, temp);
            }
        
    }//randomJumbledNumbers method ends
    
    //method that is overriden in the QuoteGenerator
    void choice(String choiceReview)
    {
        
    }
}
