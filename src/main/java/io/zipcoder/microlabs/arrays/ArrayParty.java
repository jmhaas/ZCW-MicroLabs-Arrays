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
        output += "\n" + inputArray[inputArray.length - 1];


        return output;
    }

    public String secondLastElement(String[] inputArray) {
        String output = "*** Output ***";
        output += "\n" + inputArray[inputArray.length - 2];

        return output;
    }

    public String reverseArray(String[] inputArray) {
        String output = "*** Output ***";
        for (int i = inputArray.length - 1; -1 < i && i < inputArray.length; i--) {
            output += "\n" + inputArray[i];
        }
        return output;
    }


    public String palindromeArray(String[] inputArray) {
        String output = "*** Output ***";
        String[] arr = new String[inputArray.length];
        for (int i = inputArray.length - 1; -1 < i; i--) {
            for (int j = 0; j < inputArray.length; j++) {
                arr[i] = inputArray[j];
                if (arr[i] == inputArray[j]) {

                } else if (arr[i] != inputArray[j]) {
                }

            }

            output += "\n" + inputArray[i];
        }

        return output;
    }
    //TODO Define the method compress

    //TODO Define the method pack


}
