/*
 * Name:        Prarthana Sarpal
 * Date:        December 13th, 2017
 * Version:     1.04
 * Description:`In this program, the computer declares an array of 10 integers with 
                random values between 1 and 1000 and than selection sorts them, the 
                user can choose whether they wish them sorted in an ascending or
                descending order.  
 */


package Sorting;

import java.util.Scanner;
import Sorting.lib.ArrayUtil;
import Sorting.lib.ArrayUtilTester;

/**
 *
 * @author prarthanasarpal
 */

public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIABLES
        int user;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT
        System.out.println("SELECTION SORT");
        System.out.println("Enter 1 for an ascending sorted data & 2 for a descending sorted data (INTEGERS) ");
        System.out.println("Enter 3 for an ascending sorted String data & 4 for a descending sorted String data (ALPHABETS)");
        System.out.println("Enter 5 for an ascending binary search String data & 6 for a descending binary search data (INTEGERS)");
        System.out.print("User Choice: ");
        user = input.nextInt();

        // PROCESSING
        if (user == 1) {
            ascendingInt();
        }
        if (user == 2) {
            descendingInt();
        }
        if (user == 3) {
            ascendingString();
        }
        if (user == 4) {
            descendingString();
        }
//        if (user == 5) {
//            binarySearchIntAsc();
//        }
//        if (user == 6) {
//            binarySearchStringDesc();
//        }
        if (user != 1 && user != 2 && user != 3 && user != 4 && user != 5 && user!= 6) {
            System.err.println("Invalid Input");
        }

        // TO TEST ENABLE...
        //ArrayUtilTester.selectionSortTestAscInt();
        //ArrayUtilTester.selectionSortTestDescInt();
        //ArrayUtilTester.selectionSortTestAscString();
        ArrayUtilTester.selectionSortTestDescString();
    }

    public static void ascendingInt() {
        // SELECTION SORT ASCENDING
        // RANDOM ARRAY
        int size = 10;

        int[] data = ArrayUtil.randomArray(size);

        // DISPLAY THE ARRAY;
        System.out.print("Orignal Data: ");
        ArrayUtil.display(data);
        System.out.println(" ");

        // SORT
        ArrayUtil.selectionSortAscInt(data);

        // DISPLAY SORTED ARRAY;
        System.out.print("Sorted Data: ");
        ArrayUtil.display(data);
        System.out.println(" ");
    }

    public static void descendingInt() {
        // SELECTION SORT DESCENDING
        // RANDOM ARRAY
        int size = 10;

        int data[] = ArrayUtil.randomArray(size);

        // DISPLAY ARRAY
        System.out.println("Orignal Array: ");
        ArrayUtil.display(data);

        // SORT THE ARRAY
        ArrayUtil.selectionSortDescInt(data);

        // DISPLAY SORTED ARRAY
        System.out.println("Sorted Array: ");
        ArrayUtil.display(data);
    }

    public static void ascendingString() {
        // SELECTION SORT ASCENDING
        // RANDOM ARRAY
        int size = 10;

        String[] data = ArrayUtil.randomArrayString(size);

        // DISPLAY THE ARRAY;
        System.out.print("Orignal Data: ");
        ArrayUtil.displayString(data);

        // SORT
        ArrayUtil.selectionSortAscString(data);

        // DISPLAY SORTED ARRAY;
        System.out.print("Sorted Data: ");
        ArrayUtil.displayString(data);
        System.out.println(" ");
    }

    public static void descendingString() {
        // SELECTION SORT ASCENDING
        // RANDOM ARRAY
        int size = 10;

        String[] data = ArrayUtil.randomArrayString(size);

        // DISPLAY THE ARRAY;
        System.out.print("Orignal Data: ");
        ArrayUtil.displayString(data);

        // SORT
        ArrayUtil.selectionSortDescString(data);

        // DISPLAY SORTED ARRAY;
        System.out.print("Sorted Data: ");
        ArrayUtil.displayString(data);
        System.out.println(" ");

    }
    
    public static void binarySearchIntDesc() {
        // BINARY SEARCH ASCENDING INT
        // RANDOM ARRAY
        int size = 10;

        int n = (int) (Math.random() * 1000);
        System.out.println("Search for: " + n);

        int[] data = ArrayUtil.randomArray(size);

        // DISPLAY RANDOM SEARCH NUMBER
        ArrayUtil.display(data);

        // BINARY SEARCH UNSORTED ARRAY
        ArrayUtil.binarySearchAscending(data, n);

//      mid = ArrayUtil.binarySearch(data, n);
        // SORT 
        ArrayUtil.selectionSortAscInt(data);

        // DISPLAY SORTED ARRAY
        ArrayUtil.display(data);

        // BINARY SEARCH SORTED ARRAY
        ArrayUtil.binarySearchAscending(data, n);
    }
}