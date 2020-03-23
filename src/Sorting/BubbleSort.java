/*
 * Name:        Prarthana Sarpal 
 * Date:        December 12th, 2017
 * Version:     1.02
 * Description: In this program, the computer declares an array of 10 integers with 
                random values between 1 and 1000 and than bubble sorts them, the 
                user can choose whether they wish them sorted in an ascending or
                descending order. The program implements linear search for ordered 
                and unordered arrays from ArrayUtil.
 */

package Sorting;

import java.util.Scanner;
import Sorting.lib.ArrayUtil;

/**
 *
 * @author prarthanasarpal
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIABLES
        int user;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT
        System.out.println("BUBBLE SORT");
        System.out.println("Enter 1 for an ascending sorted data & 2 for a descending sorted data. (INTEGERS)");
        System.out.println("Enter 3 for an ascending sorted data & 4 for a descending sorted data. (ALPHABETS)");
        System.out.println("Enter 5 for linear search. (INTEGERS)");
        System.out.println("Enter 6 for linear search. (ALPHABETS)");
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
        } //
        if (user == 4) {
            descendingString();
        }
        if (user == 5) {
            linearSearch();
        }
        if (user == 6) {
            linearSearchString();
        }
        if (user != 1 && user != 2 && user != 3 && user != 4 && user != 5 && user != 6) {
            System.err.println("Invalid Input");
        }

    }

    public static void ascendingInt() {
        // BUBBLE SORT ASCENDING INT
        // RANDOM ARRAY
        int size = 10;

        int[] data = ArrayUtil.randomArray(size);

        // DISPLAY THE ARRAY;
        System.out.print("Orignal Data: ");
        ArrayUtil.display(data);
        System.out.println(" ");

        // SORT
        ArrayUtil.bubbleSortAscInt(data);

        // DISPLAY SORTED ARRAY;
        System.out.print("Sorted Data: ");
        ArrayUtil.display(data);

    }

    public static void descendingInt() {
        // BUBBLE SORT DESCENDING INT
        // RANDOM ARRAY
        int size = 10;
        int comparisons, swaps;

        int data[] = ArrayUtil.randomArray(size);

        // DISPLAY ARRAY
        System.out.println("Orignal Array: ");
        ArrayUtil.display(data);

        // SORT THE ARRAY
        ArrayUtil.bubbleSortDescInt(data);

        // DISPLAY SORTED ARRAY
        System.out.println("Sorted Array: ");
        ArrayUtil.display(data);
    }

    public static void ascendingString() {
        // BUBBLE SORT ASCENDING STRING
        // RANDOM ARRAY
        int size = 10;

        String data[] = ArrayUtil.randomArrayString(size);

        // DISPLAY ARRAY
        System.out.print("Orignal Data: ");
        ArrayUtil.displayString(data);

        // SORT ARRAY
        ArrayUtil.bubbleSortAscString(data);

        // DISPLAY SORTED ARRAY
        System.out.print("Sorted Data: ");
        ArrayUtil.displayString(data);
        System.out.println(" ");
    }

    public static void descendingString() {
        // BUBBLE SORT ASCENDING STRING
        // RANDOM ARRAY
        int size = 10;

        String data[] = ArrayUtil.randomArrayString(size);

        // DISPLAY ARRAY
        System.out.print("Orignal Data: ");
        ArrayUtil.displayString(data);

        // SORT ARRAY
        ArrayUtil.bubbleSortDescString(data);

        // DISPLAY SORTED ARRAY
        System.out.print("Sorted Data: ");
        ArrayUtil.displayString(data);
        System.out.println(" ");

    }

    public static void linearSearch() {
        // LINEAR SEARCH ASCENDING INT
        // RANDOM ARRAY
        int n = 0;
        int r = 0;

        int data[] = ArrayUtil.randomArrayNoDuplicates();

        // DISPLAY RANDOM SEARCH NUMBER
        n = (int) (Math.random() * 1000);
        System.out.println("Search for: " + n);

        // DISPLAY ARRAY
        System.out.print("Orignal Array: ");
        ArrayUtil.display(data);

        // LINEAR SEARCH UNSORTED ARRAY
        ArrayUtil.linearSearch(data, n);
        r = ArrayUtil.linearSearch(data, n);
        System.out.println(" ");
        if (r >= 0) {
            System.out.println("Number found at index " + r + ".");
        } else {
            System.out.println("Number not found.");
        }
        // SORT THE ARRAY
        ArrayUtil.bubbleSortAscInt(data);

        // DISPLAY SORTED ARRAY
        System.out.print("Sorted Array: ");
        ArrayUtil.display(data);

        //LINEAR SEARCH SORTED ARRAY
        ArrayUtil.linearSearch(data, n);
        r = ArrayUtil.linearSearch(data, n);
        System.out.println(" ");
        if (r >= 0) {
            System.out.println("Number found at index " + r + ".");
        } else {
            System.out.println("Number not found.");
        }

    }

    public static void linearSearchString() {
        // LINEAR SEARCH ASCENDING STRING
        // RANDOM ARRAY
        String n = " ";
        int size = 10;
        String r = " ";
        int c = 0;

        String data[] = ArrayUtil.randomArrayNoDuplicatesString();

        // DISPLAY RANDOM SEARCH NUMBER
        c = (int) (Math.random() * 2);
        if (c == 0) {
            n = "" + (char) ((int) (Math.random() * 26) + 'A');
        } else {
            n = "" + (char) ((int) (Math.random() * 26) + 'a');
        }
        
        System.out.println("Search for: " + n);
        n = n.toUpperCase();

        // DISPLAY ARRAY
        System.out.print("Orignal Array: ");
        ArrayUtil.displayString(data);

        // LINEAR SEARCH UNSORTED ARRAY
        ArrayUtil.linearSearchString(data, n);
        r = ArrayUtil.linearSearchString(data, n);
        
        if (r.equals(n)) {
            System.out.print("Character found at index " + r + ".");
        } else {
            System.out.println("Character not found.");
        }
        
        // SORT THE ARRAY
        ArrayUtil.bubbleSortAscString(data);

        // DISPLAY SORTED ARRAY
        System.out.print("Sorted Array: ");
        ArrayUtil.displayString(data);

        //LINEAR SEARCH SORTED ARRAY
        ArrayUtil.linearSearchString(data, n);
        r = ArrayUtil.linearSearchString(data, n);
        if (r.equals(n)) {
            System.out.println("Character found at index " + r + ".");
        } else {
            System.out.println("Character not found.");
        }
    }

    
}