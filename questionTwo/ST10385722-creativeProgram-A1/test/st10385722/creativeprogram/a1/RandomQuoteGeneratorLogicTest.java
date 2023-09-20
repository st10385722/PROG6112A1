/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10385722.creativeprogram.a1;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

//test class for various methods in both the:
/*
    --RandomQuoteGeneratorLogic class
    --QuoteGenerator class
*/
public class RandomQuoteGeneratorLogicTest extends RandomQuoteGeneratorLogic
{

    //tests whether the array has filled correctly when called
    @Test
    public void testFilledArray() 
    {
        RandomQuoteGeneratorLogic rql = new RandomQuoteGeneratorLogic();
        //replica of the first element in the 2D array
        String expectedOutput = "I see you, admiring the sunset, ";
        
        //saves the value returned from the array as a string
        String arrayToTest[][] =  rql.fillerWordArray();
       
        //assertEquals them
        assertEquals(expectedOutput, arrayToTest[0][0]);
    }
    
    //tests the implemented easter egg in the code
    @Test
    public void testEasterEgg()
    {
        RandomQuoteGeneratorLogic rql = new RandomQuoteGeneratorLogic();
        rql.RandomQuoteGeneratorLogic("uwu", "");
    
        //easter egg method returns a boolean that can be used in assertTrue statement
        boolean TestEasterEgg = rql.getEasterEgg();
        
        assertTrue(TestEasterEgg);
    }
    
    //tests whether the correct noun is returned for the corrent word length
    @Test
    public void testCorrectReturnedNoun()
    {
        RandomQuoteGeneratorLogic rql = new RandomQuoteGeneratorLogic();
        String expectedNoun = "adventure";
        
        //only required to fill one part of the constructor
        rql.RandomQuoteGeneratorLogic("", "Random");
        String actualNoun = rql.randomNoun();
        
        //asserts them
        assertEquals(expectedNoun, actualNoun);
    }
    
    //does the same thing as the testCorrectReturnedNoun method
    @Test
    public void testCorrectReturnedVerb()
    {
        RandomQuoteGeneratorLogic rql = new RandomQuoteGeneratorLogic();
        String expectedVerb = "mourn";
        
        rql.RandomQuoteGeneratorLogic("encourage", "");
        
        assertEquals(expectedVerb, rql.randomVerbs());
    }
    
    //tests the method that creates the prediciton for the user using a scanner source method
    @Test
    public void testPrediction()
    {
        RandomQuoteGeneratorLogic rql = new RandomQuoteGeneratorLogic();
        QuoteGenerator qg = new QuoteGenerator();
        
        Scanner tp = new Scanner("q\nEating\nFood\n4\nq\nno\nq");
        
        rql.RandomQuoteGeneratorLogic("", "");
        boolean testComp = qg.Prediction(tp);
        
        assertTrue(testComp);
    }
    
}
