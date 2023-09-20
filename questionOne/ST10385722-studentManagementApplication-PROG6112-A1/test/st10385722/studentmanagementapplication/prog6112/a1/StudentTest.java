/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10385722.studentmanagementapplication.prog6112.a1;

//unit test imports
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest {
    
    //this method tests to see whether input ges saved to the arrayList
    @Test
    public void TestSaveStudent() 
    {
        //object for the student class so that the method can see it
        Student st = new Student();
        //scanner class that allows automated input of scanner input, so that that user does not
        //have to input values for the code to test
        Scanner tss = new Scanner("10111\nJohn Burger\n21\nemail@gmail.com\nDISD");
        
        //expected variables for the assertEquals
        int expectedID = 10111;
        String expectedName = "John Burger";
        int expectedAge = 21;
        String expectedEmail = "email@gmail.com";
        String expectedCourse = "DISD";
        
        //runs the SaveStudent() method and automatically adds the input using the
        //Scanner source
        st.SaveStudent(tss);
        
        //saving the actual inputs to variables for assertEquals
        int actualID = st.studentID.get(0);
        String actualName = st.studentName.get(0);
        int actualAge = st.studentAge.get(0);
        String actualEmail = st.studentEmail.get(0);
        String actualCourse = st.studentCourse.get(0);
        
        //compares the expected and actual IDs
        assertEquals(expectedID, actualID);
        assertEquals(expectedName, actualName);
        assertEquals(expectedAge, actualAge);
        assertEquals(expectedEmail, actualEmail);
        assertEquals(expectedCourse, actualCourse);
    }
    
    //tests the searching of the student
    @Test
    public void TestSearchStudent()
    {
        
        Student st = new Student(); 
        
        //boolean value used in the assertEquals comparision
        boolean expectedPass = true;
        //adds scanner input for the SearchStudent method
        Scanner tss = new Scanner("10111");
              
        //adding temporary values to the arrays for testing purposes
        st.studentID.add(10111);
        st.studentName.add("John Burger");
        st.studentAge.add(21);
        st.studentEmail.add("email@gmail.com");
        st.studentCourse.add("DISD");
        
        //the methods returns a boolean value, which is used to check whether
        //the method successfully found a student in the arrayList
        //using the input from the scanner source
        boolean actualPass = st.SearchStudent(tss);

        //checks the equality using assertEquals
        assertEquals(expectedPass, actualPass);
    }
    
    //Testing for when the student is not found
    @Test
    public void TestSearchStudent_StudentNotFound()
    {
        Student st = new Student();
        
        //adding input from scanner source
        //naming follows first letters of each word in the method name
        Scanner tss_snf = new Scanner("10112");
        
        //since there is no need to add elements into the array, we can just search
        //for a StudentID that is not present
        boolean actualPass = st.SearchStudent(tss_snf);
        
        //checks whether the return boolean is false
        assertFalse(actualPass);
        
    }
    
    //testing the deleteStudent method
    @Test
    public void TestDeleteStudent()
    {
        Student st = new Student();
        //scanner source input
        Scanner tds = new Scanner("10111\ny");
        
        //adding temporary values
        st.studentID.add(10111);
        st.studentName.add("John Burger");
        st.studentAge.add(21);
        st.studentEmail.add("email@gmail.com");
        st.studentCourse.add("DISD");
        
        //method returns a boolean to check whether the student was deleted
        boolean actualDeletion = st.DeleteStudent(tds);
        
        //checks whether return value is true;
        assertTrue(actualDeletion);    
    }
    
    //method name self explaintory
    @Test
    public void TestDeleteStudent_StudentNotFound()
    {
        Student st = new Student();
        //similar style of testing from SearchStudent_StudentNotFound method
        Scanner tds_snf = new Scanner("10112");
        
        boolean notActualDeletion = st.DeleteStudent(tds_snf);
        
        assertFalse(notActualDeletion);
    }
    
    //validation of the StudentAge method in the student class
    @Test
    public void TestStudentAge_StudentAgeValid()
    {
        //using assertEquals for this test, so expectedVariable required
        boolean expectedAgeBool = true;
        Student st = new Student();
        //scanner source inputting a correct value
        Scanner tsa_sav = new Scanner("19");
        
        //method returns a boolean, which saves to the actualAgeBool variable
        boolean actualAgeBool = st.StudentAge(tsa_sav);
        
        //checks equality of the 2 variables
        assertEquals(expectedAgeBool, actualAgeBool);
        
    }
    
    //method name explains purpose of this test
    @Test
    public void TestStudentAge_StudentAgeInvalid()
    {
        Student st = new Student();
        //scanner source input, with an invalid age input
        Scanner tsa_sai = new Scanner("10111\nBurger\n6");
        boolean actualAgeBool;
        
        //studentAge method returns a boolean value
        actualAgeBool = st.StudentAge(tsa_sai);
        //an if statement that checks whether the returned method is false, since
        //in the method, the while statement doesnt allow the code to leave its
        //bounds without a correct value.
        if (actualAgeBool == false) 
        {
            assertFalse(actualAgeBool);
        }
        
    }
    
    //self explanitory
    @Test
    public void TestStudentAge_StudentAgeInvalidCharacter()
    {
        Student st = new Student();
        //testing invalid entry, but with a letter instead of a invalid number
        Scanner tsa_saic = new Scanner("10111\nBurger\nc");
        boolean expectedAgeBool = false;
        
        //same if statmenent clause as the other studentAgeinvalid method
        boolean actualAgeBool = st.StudentAge(tsa_saic);
        if(actualAgeBool == false)
        {
            assertEquals(expectedAgeBool, actualAgeBool);
        }
        
    }
    
}

//references
//S, D. (2017) Junit - Nosuchelementexception: No line found, Stack Overflow. Available at: https://stackoverflow.com/questions/45653605/junit-nosuchelementexception-no-line-found (Accessed: 18 September 2023). 
