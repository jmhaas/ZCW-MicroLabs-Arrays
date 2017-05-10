package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    public String printArray(String[] inputArray) {
        String output = "*** Output ***";
        for (int i = 0; i < inputArray.length; i++) {
            output += "\n" + inputArray[i];
        }
        return output;
    }

    public String lastElement(String[] inputArray) {
        String output = "*** Output ***";
        output += "\n" + inputArray[inputArray.length -1];


        return output;
    }

    //TODO Define the method lastButOne

    //TODO Define the method reverse

    //TODO Define the method isPalindrome

    //TODO Define the method compress

    //TODO Define the method pack


}
