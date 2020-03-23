/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sorting;

import java.util.Scanner;
import Sorting.lib.ArrayUtil;
import Sorting.lib.ArrayUtilTester;

/**
 *
 * @author prarthanasarpal
 */
public class SelectionSort2 {

    public static void main(String[] args) {
        // VARIABLES
        int user;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT
        System.out.println("SELECTION SORT");
        System.out.println("Enter 1 for an ascending sorted data & 2 for a descending sorted data (INTEGERS) ");
        System.out.println("Enter 3 for an ascending sorted String data & 4 for a descending sorted String data (ALPHABETS)");
        System.out.println("Enter 5 for binary search ascending & 6 for binary search descending (INTEGERS)");
        System.out.println("Enter 7 for binary search ascending & 8 for binary search descending (ALPHABET)");
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
        if (user == 5) {
            binaryIntAsc();
        }
        if (user == 6) {
            binaryIntDesc();
        }
        if (user == 7) {
            binaryStringAsc();
        }
        if (user == 8) {
            binaryStringDesc();
        }
        if (user != 1 && user != 2 && user != 3 && user != 4 && user != 5 && user != 6 && user != 7 && user != 8) {
            System.err.println("Invalid Input");
        }

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
        //SELECTION SORT ASCENDING
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

    public static void binaryIntAsc() {
        // LINEAR SEARCH ASCENDING INT
        // RANDOM ARRAY
        int searchValue = 0;
        int r = 0;

        int data[] = ArrayUtil.randomArrayNoDuplicates();

        // DISPLAY RANDOM SEARCH NUMBER
        searchValue = (int) (Math.random() * 1000);
        System.out.println("Search for: " + searchValue);

        // SORT ARRAY
        ArrayUtil.bubbleSortAscInt(data);
        // DISPLAY ARRAY
        System.out.print("Array: ");
        ArrayUtil.display(data);

        // BINARY SEARCH
        ArrayUtil.binarySearchAscending(data, searchValue);
        r = ArrayUtil.linearSearch(data, searchValue);
        System.out.println(" ");

        if (r >= 0) {
            System.out.println("Number found at index " + r + ".");
        } else {
            System.out.println("Number not found.");
        }
    }

    public static void binaryIntDesc() {
        // LINEAR SEARCH ASCENDING INT
        // RANDOM ARRAY
        int searchValue = 0;
        int r = 0;

        int data[] = ArrayUtil.randomArrayNoDuplicates();

        // DISPLAY RANDOM SEARCH NUMBER
        searchValue = (int) (Math.random() * 1000);
        System.out.print("Search for: " + searchValue);

        // SORT ARRAY
        ArrayUtil.bubbleSortDescInt(data);
        // DISPLAY ARRAY
        System.out.println("Array: ");
        ArrayUtil.display(data);

        // BINARY SEARCH
        ArrayUtil.binarySearchDescending(data, searchValue);
        r = ArrayUtil.linearSearch(data, searchValue);
        System.out.println(" ");

        if (r >= 0) {
            System.out.println("Number found at index " + r + ".");
        } else {
            System.out.println("Number not found.");
        }
    }

    public static void binaryStringAsc() {
        // LINEAR SEARCH ASCENDING INT
        // RANDOM ARRAY
        String searchValue = " ";
        int r = 0;
        int c = 0;

        String data[] = ArrayUtil.randomArrayNoDuplicatesString();

        // DISPLAY RANDOM SEARCH NUMBER
        c = (int) (Math.random() * 2);

        if (c == 0) {
            searchValue = "" + (char) ((int) (Math.random() * 26) + 'A');
        } else {
            searchValue = "" + (char) ((int) (Math.random() * 26) + 'a');
        }

        System.out.println("Search for: " + searchValue);

        // SORT ARRAY
        ArrayUtil.bubbleSortAscString(data);

        // DISPLAY ARRAY
        System.out.print("Array: ");
        ArrayUtil.displayString(data);

        // BINARY SEARCH
        ArrayUtil.binarySearchStringAscending(data, searchValue);
        r = ArrayUtil.binarySearchStringAscending(data, searchValue);

        if (r >= 0) {
            System.out.println("Character found at index " + r + ".");
        } else {
            System.out.println("Character not found.");
        }
    }

    public static void binaryStringDesc() {
        // LINEAR SEARCH ASCENDING INT
        // RANDOM ARRAY
        String searchValue = " ";
        int r = 0;
        int c = 0;

        String data[] = ArrayUtil.randomArrayNoDuplicatesString();

        // DISPLAY RANDOM SEARCH NUMBER
        c = (int) (Math.random() * 2);

        if (c == 0) {
            searchValue = "" + (char) ((int) (Math.random() * 26) + 'A');
        } else {
            searchValue = "" + (char) ((int) (Math.random() * 26) + 'a');
        }

        System.out.println("Search for: " + searchValue);

        // SORT ARRAY
        ArrayUtil.bubbleSortDescString(data);

        // DISPLAY ARRAY
        System.out.print("Array: ");
        ArrayUtil.displayString(data);

        // BINARY SEARCH
        ArrayUtil.binarySearchStringDescending(data, searchValue);
        r = ArrayUtil.binarySearchStringDescending(data, searchValue);

        if (r >= 0) {
            System.out.println("Character found at index " + r + ".");
        } else {
            System.out.println("Character not found.");
        }
    }

}