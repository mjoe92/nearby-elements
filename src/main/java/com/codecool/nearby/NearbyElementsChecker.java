package com.codecool.nearby;

//import java.util.Arrays;

import java.util.Arrays;

/**
 * The task of the class is to find and return the nearby elements from a two-dimensional int array.
 * To keep it as an one class application, the entry point (main method) and test data is kept here also.
 */
public class NearbyElementsChecker {

    int[][] elementsInChecker;

    /**
     * Constructor. The array to work with is given here to the instance.
     *
     * @param elements the 2 dimensional int array to search through
     */
    public NearbyElementsChecker(int[][] elements) {

        elementsInChecker = elements;

    }

    /**
     * Instance method for returning nearby elements.
     *
     * @param row row of the target element
     * @param col column of the target element
     * @param range maximum distance of nearby elements to give back
     * @return array holding the nearby elements within range, except for the target element, may be of zero length
     * @return null if row is out of bounds
     */

    public int[] getNearbyElements(int row, int col, int range) {

        NearbyElementsChecker nearbyElementsChecker = new NearbyElementsChecker(this.elementsInChecker);
        int[][] elementsCopied = nearbyElementsChecker.elementsInChecker;
        int startElement = col - range;
        int endElement = col + range;

        // row is outside
        if (row < 0 || row >= elementsCopied.length) {
            return null;
        }

        // outside of the array
        if (startElement < 0 && endElement < 0 || startElement >= elementsCopied[row].length && endElement >= elementsCopied[row].length) {
            return new int[]{};
        }

        // just startElement outside or endElement outside
        if (startElement < 0 && (0 <= endElement && endElement < elementsCopied[row].length)) {
            startElement = 0;
        }
        if (endElement >= elementsCopied[row].length && (0 <= startElement && startElement < elementsCopied[row].length)) {
            endElement = elementsCopied[row].length - 1;
        }

        // everything is outside
        if ((startElement < 0 && endElement < 0) || (startElement >= elementsCopied[row].length && endElement >= elementsCopied[row].length)) {
            return null;
        }

        // startElement is outside on left, endElement is outside on right
        if (startElement < 0 && endElement >= elementsCopied[row].length) {
            startElement = 0;
            endElement = elementsCopied[row].length - 1;
        }

        // elements in range into array
        int sizeOfArray = endElement - startElement + 1;
        if (startElement <= col && col <= endElement) {
            sizeOfArray --;
        }

        int j = 0;
        int[] nearbyElements = new int[sizeOfArray];
        for (int i = startElement; i <= endElement; i++) {
            if (i != col) {
                nearbyElements[j++] = elementsCopied[row][i];
            }
        }
        return nearbyElements;
    }

    /**
     * Instance method for pretty printing the elements
     */
    public void prettyPrint() {
        NearbyElementsChecker arrayFromChecker = new NearbyElementsChecker(this.elementsInChecker);
        int[][] arrayToPrint = arrayFromChecker.elementsInChecker;

        int maxSize = 0;
        int checkSize;
        for (int[] rowElements : arrayToPrint) {
            for (int element : rowElements) {
                checkSize = String.valueOf(element).length();
                maxSize = (Math.max(maxSize, checkSize));
            }
        }

        String printArray;
        for (int i = 0; i < arrayToPrint.length; i++) {
            printArray = "";
            for (int j = 0; j < arrayToPrint[i].length; j++) {
                printArray += " ";
                checkSize = String.valueOf(arrayToPrint[i][j]).length();
                for (int k = 0; k < maxSize - checkSize; k++) {
                    printArray += " ";
                }
                printArray += arrayToPrint[i][j];
            }
            System.out.print(printArray + System.lineSeparator());
        }
    }

    // The main method with this declaration is the entry point of Java applications.
    public static void main(String[] args) {

        int[][] testArray = new int[][] {
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 },
            { 25, -3, 41, 325, 7, 424, 42}
        };

        // Create an instance of our class with the test data.
        NearbyElementsChecker nearbyElementsChecker = new NearbyElementsChecker(testArray);
/*
        int[] getRangedElements = nearbyElementsChecker.getNearbyElements(1,9,5);
        System.out.println(Arrays.toString(getRangedElements));
*/

        // Print the two-dimensional array
        nearbyElementsChecker.prettyPrint();
    }

}
