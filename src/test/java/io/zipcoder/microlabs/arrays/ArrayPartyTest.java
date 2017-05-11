package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.lastElement(breakfast);

        //: Then
        Assert.assertEquals("The result is not the last element", expected, actual);
    }

    @Test
    public void secondLastElementTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Tomatoes";

        //: When
        String actual = arrayParty.secondLastElement(breakfast);

        //: Then
        Assert.assertEquals("The result is not the second to last element", expected, actual);
    }

    @Test
    public void reverseArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Mushrooms\n" +
                "Tomatoes\n" +
                "Bacon\n" +
                "Beans\n" +
                "Eggs\n" +
                "Sausage";


        //: When
        String actual = arrayParty.reverseArray(breakfast);

        //: Then
        Assert.assertEquals("The result is not the second to last element", expected, actual);
    }
    //TODO Define the method isPalindromeTest
    @Test
    public void palindromeArrayTest(){
        //: Given
        String [] palindromic = {"Sausage", "Eggs", "Beans",
                "Beans", "Eggs", "Sausage"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Beans\n" +
                "Eggs\n" +
                "Sausage";


        //: When
        String actual = arrayParty.palindromeArray(palindromic);

        //: Then
        Assert.assertEquals("The result is not a palindrome", expected, actual);
    }

    @Test
    public void compressionArrayTest(){
        //: Given
        String [] compression = {"1","1","3","3","3","2","2","2","1","1","1","1","4","4","4","4"};

        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "1\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "4";


        //: When
        String actual = arrayParty.compressionArray(compression);

        //: Then
        Assert.assertEquals("The result is not compressed", expected, actual);
    }





    //TODO Define the method compressTest

    //TODO Define the method packTest


}
