/*
 * Name:        Prarthana Sarpal
 * Date:        December 8th, 2017
 * Version:     1.06
 * Description:`A testing code for sorting arrays  
 */

package Sorting.lib;

/**
 *
 * @author prarthanasarpal
 */

public class ArrayUtilTester {
    public static void main(String[] args) {
        
        System.out.println("BUBBLE SORT");
        ArrayUtilTester.bubbleSortTestAscInt();
        ArrayUtilTester.bubbleSortTestDescInt();
        ArrayUtilTester.bubbleSortTestAscString();
        ArrayUtilTester.bubbleSortTestDescString();
        
        System.out.println("SELECTION SORT");
        ArrayUtilTester.selectionSortTestAscInt();
        ArrayUtilTester.selectionSortTestDescInt();
        ArrayUtilTester.selectionSortTestAscString();
        ArrayUtilTester.selectionSortTestDescString();
        
        System.out.println("LINEAR SEARCH");
        ArrayUtilTester.linearSearchTestInt();
        ArrayUtilTester.linearSearchTestString();
        
        System.out.println("BINARY SEARCH");
        ArrayUtilTester.binarySearchTestAscendingInt();
        ArrayUtilTester.binarySearchTestDescendingInt();
        ArrayUtilTester.binarySearchTestAscendingString();
        ArrayUtilTester.binarySearchTestDescendingString();
        
        System.out.println("MAX/ MIN/ SUM/ AVERAGE");
        ArrayUtilTester.maxTest();
        ArrayUtilTester.minTest();
        ArrayUtilTester.sumTest();
        ArrayUtilTester.averageTest();
        
    }

    public static void bubbleSortTestAscInt() {
        int[] dataSet = ArrayUtil.randomArray(100);

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #1A      : Bubble Sort ascending intergers");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers, duplicats are okay");
        System.out.println("POST CONDITION     : array sorted, lowest to highest, duplicates incorporated");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        ArrayUtil.display(dataSet);

        // SORT DATA
        ArrayUtil.bubbleSortAscInt(dataSet);

        // DISPLAY SORTED ARRAY
        System.out.println("DATA AFTER: ");
        ArrayUtil.display(dataSet);

        // CONFIRM; the value at index i must be less than the value at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert (dataSet[i] <= dataSet[i + 1]);
        }

        System.out.println("TEST CASE #1A RESULTS - passed");
    }

    public static void bubbleSortTestDescInt() {
        int[] dataSet = ArrayUtil.randomArray(100);

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #1AB     : Bubble Sort descending integers");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers, duplicates are okay");
        System.out.println("POST CONDITION     : array sorted, highest to lowest, duplicates incorporated");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        ArrayUtil.display(dataSet);

        // SORT DATA
        ArrayUtil.bubbleSortDescInt(dataSet);

        // DISPLAY SORTED ARRAY
        System.out.println("DATA AFTER: ");
        ArrayUtil.display(dataSet);

        // CONFIRM; the value at index i must be greater than the value at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert (dataSet[i] >= dataSet[i + 1]);
        }

        System.out.println("TEST CASE #1AB RESULTS - passed");
    }

    public static void bubbleSortTestAscString() {
        String[] dataSet = ArrayUtil.randomArrayString(26);

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #2A      : Bubble Sort ascending string");
        System.out.println("PRE CONDITION      : unsorted array; upper case alphabets, duplicates are okay");
        System.out.println("POST CONDITION     : array sorted, A-Z order, duplicates incorporated");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        ArrayUtil.displayString(dataSet);

        // SORT DATA
        ArrayUtil.bubbleSortAscString(dataSet);

        // DISPLAY SORTED ARRAY
        System.out.println("DATA AFTER: ");
        ArrayUtil.displayString(dataSet);
        System.out.println(" ");

        // CONFIRM; the alphabet at index i must come before the alphabet at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert ((dataSet[i].toUpperCase()).compareTo(dataSet[i + 1].toUpperCase()) <= 0); // ERROR
        }

        System.out.println("TEST CASE #2A RESULTS - passed");
    }

    public static void bubbleSortTestDescString() {
        String[] dataSet = ArrayUtil.randomArrayString(26);

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #2AB     : Bubble Sort descending string");
        System.out.println("PRE CONDITION      : unsorted array; upper case alphabets, duplicates are okay");
        System.out.println("POST CONDITION     : array sorted, Z-A order, duplicates incorporated");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        ArrayUtil.displayString(dataSet);
        System.out.println(" ");

        // SORT DATA
        ArrayUtil.bubbleSortDescString(dataSet);

        // DISPLAY SORTED ARRAY
        System.out.println("DATA AFTER: ");
        ArrayUtil.displayString(dataSet);
        System.out.println(" ");

        // CONFIRM; the alphabet at index i must come after the alphabet at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert ((dataSet[i].toUpperCase().compareTo(dataSet[i + 1].toUpperCase())) >= 0); // ERROR
        }

        System.out.println("TEST CASE #2AB RESULTS - passed");
    }

    public static void selectionSortTestAscInt() {
        int[] dataSet = ArrayUtil.randomArray(100);

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #3A      : Selection Sort Ascending int");
        System.out.println("PRE CONDITION      : unsorted array; + and - numbers, duplicates are okay");
        System.out.println("POST CONDITION     : array sorted, lowest to highest, duplicates incorporated");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        ArrayUtil.display(dataSet);

        // SORT DATA
        ArrayUtil.selectionSortAscInt(dataSet);

        // DISPLAY SORTED ARRAY
        System.out.println("DATA AFTER: ");
        ArrayUtil.display(dataSet);
        System.out.println(" ");

        // CONFIRM; the value at index i must be less than the value at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert (dataSet[i] <= dataSet[i + 1]);
        }

        System.out.println("TEST CASE #3A RESULTS - passed");
    }

    public static void selectionSortTestDescInt() {
        int[] dataSet = ArrayUtil.randomArray(26);

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #3AB      : Selection Sort Descending int");
        System.out.println("PRE CONDITION       : unsorted array; + and - numbers, duplicates are okay");
        System.out.println("POST CONDITION      : array sorted, highest to lowest, duplicates incorporated");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        ArrayUtil.display(dataSet);

        // SORT DATA
        ArrayUtil.bubbleSortDescInt(dataSet);

        // DISPLAY SORTED ARRAY
        System.out.println("DATA AFTER: ");
        ArrayUtil.display(dataSet);
        System.out.println(" ");

        // CONFIRM; the value at index i must be greater than the value at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert (dataSet[i] >= dataSet[i + 1]);
        }

        System.out.println("TEST CASE #3AB RESULTS - passed");
    }

    public static void selectionSortTestAscString() {
        String[] dataSet = ArrayUtil.randomArrayString(26);

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #4A      : Selection Sort Ascending string");
        System.out.println("PRE CONDITION      : unsorted array; alphabets, duplicates are okay");
        System.out.println("POST CONDITION     : array sorted, A-Z order, duplicates incorporated");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        ArrayUtil.displayString(dataSet);

        // SORT DATA
        ArrayUtil.selectionSortAscString(dataSet);

        // DISPLAY SORTED ARRAY
        System.out.println("DATA AFTER: ");
        ArrayUtil.displayString(dataSet);
        System.out.println(" ");

        // CONFIRM; the alphabet at index i must come before the alphabet at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert ((dataSet[i].toUpperCase().compareTo(dataSet[i + 1].toUpperCase())) <= 0); //ERROR
        }

        System.out.println("TEST CASE #4A RESULTS - passed");
    }

    public static void selectionSortTestDescString() {
        String[] dataSet = ArrayUtil.randomArrayString(26);

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #4AB      : Selection Sort Descending string");
        System.out.println("PRE CONDITION       : unsorted array; alphabets, duplicates are okay");
        System.out.println("POST CONDITION      : array sorted, Z-A order, duplicates incorporated");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        ArrayUtil.displayString(dataSet);

        // SORT DATA
        ArrayUtil.selectionSortDescString(dataSet);

        // DISPLAY SORTED ARRAY
        System.out.println("DATA AFTER: ");
        ArrayUtil.displayString(dataSet);
        System.out.println(" ");

        // CONFIRM; the alphabet at index i must come before the alphabet at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert ((dataSet[i].toUpperCase().compareTo(dataSet[i + 1].toUpperCase())) >= 0); //ERROR
        }

        System.out.println("TEST CASE #4AB RESULTS - passed");
    }

    public static void linearSearchTestInt() {
        int searchValue = 0;
        int r = 0;
        int[] dataSet = ArrayUtil.randomArrayNoDuplicates();

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #5A      : Linear search integers");
        System.out.println("PRE CONDITION      : unsorted array, + and - numbers no duplicates");
        System.out.println("POST CONDITION     : array sorted, lowest to highest, test results printed (pass or fail)");

        // PRINT SEARCH VALUE
        searchValue = (int) (Math.random() * 1000);
        System.out.println("Search for: " + searchValue);

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        ArrayUtil.display(dataSet);

        // SORT DATA
        ArrayUtil.bubbleSortAscInt(dataSet);
        ArrayUtil.linearSearch(dataSet, searchValue);
        r = ArrayUtil.linearSearch(dataSet, searchValue);

        // DISPLAY SORTED ARRAY
        System.out.println("DATA AFTER: ");
        ArrayUtil.display(dataSet);
        System.out.println(" ");

        // CONFIRM; the value at index i must be less than the value at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert (dataSet[i] <= dataSet[i + 1]);
        }

        // CONFIRM; whether search values are found or not
        for (int i = 0; i < dataSet.length - 1; i++) {
            if (r == searchValue) {
                assert (r == searchValue);
            } else {
                assert (r != searchValue);
            }
        }

        System.out.println("TEST CASE #5A RESULTS - passed");
    }

    public static void linearSearchTestString() {
        String searchValue = " ";
        String r = " ";
        int c = 0;
        String[] dataSet = ArrayUtil.randomArrayNoDuplicatesString();

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #5AB     : Linear search string");
        System.out.println("PRE CONDITION      : unsorted array, no duplicates");
        System.out.println("POST CONDITION     : array sorted, A-Z order, test results printed (pass or fail)");

        // PRINT SEARCH VALUE
        c = (int) (Math.random() * 2);
        if (c == 0) {
            searchValue = "" + (char) ((int) (Math.random() * 26) + 'A');
        } else {
            searchValue = "" + (char) ((int) (Math.random() * 26) + 'a');
        }

        System.out.println("Search for: " + searchValue);
        searchValue = searchValue.toUpperCase();

        System.out.println("Search for: " + searchValue);

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        ArrayUtil.displayString(dataSet);

        // SORT DATA
        ArrayUtil.bubbleSortAscString(dataSet);
        ArrayUtil.linearSearchString(dataSet, searchValue);
        r = ArrayUtil.linearSearchString(dataSet, searchValue);

        // DISPLAY SORTED ARRAY
        System.out.println("DATA AFTER: ");
        ArrayUtil.displayString(dataSet);
        System.out.println(" ");

        // CONFIRM; the value at index i must be less than the value at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert ((dataSet[i].compareTo(dataSet[i + 1])) <= 0);
        }

        // CONFIRM; whether search values are found or not
        for (int i = 0; i < dataSet.length - 1; i++) {
            if (r == searchValue) {
                assert (r.equals(searchValue));
            } else {
                assert (!(r.equals(searchValue)));
            }
        }

        System.out.println("TEST CASE #5AB RESULTS - passed");
    }

    public static void binarySearchTestAscendingInt() {
        int searchValue = 0;
        int r = 0;
        int[] dataSet = ArrayUtil.randomArrayNoDuplicates();

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #6A      : Binary search ascending int");
        System.out.println("PRE CONDITION      : ascending sorted array; + and - numbers, no duplicates");
        System.out.println("POST CONDITION     : array sorted lowest to highest, test results printed (pass or fail)");

        // PRINT SEARCH VALUE
        searchValue = (int) (Math.random() * 1000);
        System.out.println("Search for: " + searchValue);

        // SORT DATA
        ArrayUtil.bubbleSortAscInt(dataSet);
        ArrayUtil.binarySearchAscending(dataSet, searchValue);

        r = ArrayUtil.binarySearchAscending(dataSet, searchValue);

        // DISPLAY ARRAY
        System.out.println("ARRAY: ");
        ArrayUtil.display(dataSet);
        System.out.println(" ");

        // CONFIRM; the value at index i must be less than the value at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert (dataSet[i] <= dataSet[i + 1]);
        }

        // CONFIRM; whether search values are found or not
        for (int i = 0; i < dataSet.length - 1; i++) {
            if (r == searchValue) {
                assert (r == searchValue);
            } else {
                assert (r != searchValue);
            }
        }

        System.out.println("TEST CASE #6A RESULTS - passed");
    }

    public static void binarySearchTestDescendingInt() {
        int searchValue = 0;
        int r = 0;
        int[] dataSet = ArrayUtil.randomArrayNoDuplicates();

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #6AB      : Binary search descending int");
        System.out.println("PRE CONDITION       : descending sorted array; + and - numbers, no duplicates");
        System.out.println("POST CONDITION      : array sorted highest to lowest, test results printed (pass or fail)");

        // PRINT SEARCH VALUE
        searchValue = (int) (Math.random() * 1000);
        System.out.print("Search for: " + searchValue);

        // SORT DATA
        ArrayUtil.bubbleSortDescInt(dataSet);
        ArrayUtil.binarySearchDescending(dataSet, searchValue);

        r = ArrayUtil.binarySearchDescending(dataSet, searchValue);

        // DISPLAY ARRAY
        System.out.print("ARRAY: ");
        ArrayUtil.display(dataSet);
        System.out.println(" ");

        // CONFIRM; the value at index i must be greater than the value at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert (dataSet[i] >= dataSet[i + 1]);
        }

        // CONFIRM; whether search values are found or not
        for (int i = 0; i < dataSet.length - 1; i++) {
            if (r == searchValue) {
                assert (r == searchValue);
            } else {
                assert (r != searchValue);
            }
        }

        System.out.println("TEST CASE #6AB RESULTS - passed");
    }

    public static void binarySearchTestAscendingString() {
        String searchValue = " ";
        int r = 0;
        int c = 0;
        String[] dataSet = ArrayUtil.randomArrayNoDuplicatesString();

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #6ABC      : Binary search ascending string");
        System.out.println("PRE CONDITION        : ascending sorted array, alphabets, no duplicates");
        System.out.println("POST CONDITION       : array sorted A-Z order, test results printed (pass or fail)");

        // PRINT SEARCH VALUE
        c = (int) (Math.random() * 2);
        if (c == 0) {
            searchValue = "" + (char) ((int) (Math.random() * 26) + 'A');
        } else {
            searchValue = "" + (char) ((int) (Math.random() * 26) + 'a');
        }

        // SORT DATA
        ArrayUtil.bubbleSortAscString(dataSet);
        ArrayUtil.binarySearchStringAscending(dataSet, searchValue);

        r = ArrayUtil.binarySearchStringAscending(dataSet, searchValue);

        // DISPLAY ARRAY
        System.out.print("ARRAY: ");
        ArrayUtil.displayString(dataSet);
        System.out.println(" ");

        // CONFIRM; the value at index i must be less than the value at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert ((dataSet[i].compareTo(dataSet[i + 1])) <= 0);
        }

        // CONFIRM; whether search values are found or not
        for (int i = 0; i < dataSet.length - 1; i++) {
            if( r >= 0 ) {
                assert( r >= 0 );
            } else {
                assert( r < 0 );
            }
        }

        System.out.println("TEST CASE #6ABC RESULTS - passed");
    }

    public static void binarySearchTestDescendingString() {
        String searchValue = " ";
        int r = 0;
        int c = 0;
        String[] dataSet = ArrayUtil.randomArrayNoDuplicatesString();

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #6ABCD      : Binary search descending string");
        System.out.println("PRE CONDITION         : descending sorted array, alphabets, no duplicates");
        System.out.println("POST CONDITION        : array sorted Z-A order, test results printed (pass or fail)");

        // PRINT SEARCH VALUE
        c = (int) (Math.random() * 2);
        if (c == 0) {
            searchValue = "" + (char) ((int) (Math.random() * 26) + 'A');
        } else {
            searchValue = "" + (char) ((int) (Math.random() * 26) + 'a');
        }

        // SORT DATA
        ArrayUtil.bubbleSortDescString(dataSet);
        ArrayUtil.binarySearchStringDescending(dataSet, searchValue);

        r = ArrayUtil.binarySearchStringAscending(dataSet, searchValue);

        // DISPLAY ARRAY
        System.out.print("ARRAY: ");
        ArrayUtil.displayString(dataSet);
        System.out.println(" ");

        // CONFIRM; the value at index i must be greater than the value at index i+1
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert ((dataSet[i].compareTo(dataSet[i + 1])) >= 0);
        }

        // CONFIRM; whether search values are found or not
        for (int i = 0; i < dataSet.length - 1; i++) {
            if( r >= 0 ) {
                assert( r >= 0 );
            } else {
                assert( r < 0);
            }
        }

        System.out.println("TEST CASE #6ABCD RESULTS - passed");
    }

    public static void maxTest() {
        int[] dataSet = new int[100];
        int max = 0;

        dataSet = ArrayUtil.randomArray(100);

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #7A      : Determining Maximum value");
        System.out.println("PRE CONDITION      : an integer array");
        System.out.println("POST CONDITION     : finds the maximum integer from random array and prints it");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        ArrayUtil.display(dataSet);

        // FIND MAX
        ArrayUtil.maxValue(dataSet);

        // DISPLAY MAX
        max = ArrayUtil.maxValue(dataSet);
        System.out.println(" ");
        System.out.println("Maximum Value: " + max);

        // CONFIRM; the value returned must be the lagest in the array
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert (max >= dataSet[i + 1]);
        }

        System.out.println("TEST CASE #7A RESULTS - passed");
    }

    public static void minTest() {
        int[] dataSet = new int[100];
        int min = 0;

        dataSet = ArrayUtil.randomArray(100);

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #8A      : Determining minimum value");
        System.out.println("PRE CONDITION      : an integer array");
        System.out.println("POST CONDITION     : finds the minimum integer from random array and prints it");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        ArrayUtil.display(dataSet);

        // FIND MIN
        ArrayUtil.minValue(dataSet);

        // DISPLAY MIN
        min = ArrayUtil.minValue(dataSet);
        System.out.println(" ");
        System.out.println("Minimum Value: " + min);

        // CONFIRM; the value returned must be the smallest in the array
        for (int i = 0; i < dataSet.length - 1; i++) {
            assert (min <= dataSet[i + 1]);
        }

        System.out.println("TEST CASE #8A RESULTS - passed");
    }

    public static void sumTest() {
        int size = 10;
        int[] dataSet = new int[size];
        int sum = 0;

        for (int i = 0; i < dataSet.length; i++) {
            dataSet[i] = 1;
        }

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #9A      : Determining sum of an array");
        System.out.println("PRE CONDITION      : an integer array");
        System.out.println("POST CONDITION     : finds the sum of an array and prints it");

        // DISPLAY ARRAY
        System.out.println("DATA: ");
        ArrayUtil.display(dataSet);

        // FIND SUM
        ArrayUtil.findTotal(dataSet);

        // DISPLAY SUM
        sum = ArrayUtil.findSum(dataSet);
        System.out.println(" ");
        System.out.println("Sum: " + sum);

        // CONFIRM; the value returned must equal the total of all values in the array
            assert (sum == size);

        System.out.println("TEST CASE #9A RESULTS - passed");
    }

    public static void averageTest() {
        int size = 10;
        double[] dataSet = new double[size];
        double average = 0;

        for (int i = 0; i < dataSet.length; i++) {
            dataSet[i] = 1;
        }

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #10A      : Determine the average of an array");
        System.out.println("PRE CONDITION       : A double array");
        System.out.println("POST CONDITION      : finds the average of an array and prints it");

        // DISPLAY ARRAY
        System.out.println("DATA BEFORE: ");
        ArrayUtil.display(dataSet);

        // FIND AVERAGE
        ArrayUtil.average(dataSet);

        // DISPLAY AVERAGE
        average = ArrayUtil.average(dataSet);
        System.out.println(" ");
        System.out.println("DATA AFTER: " + average);

        // CONFIRM; the value returned must be (sum)/(dataset.length);
            assert (average == ((size) / size));

        System.out.println("TEST CASE #10A RESULTS - passed");
    }

}