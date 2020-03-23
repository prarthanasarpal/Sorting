/*
 * Name:        Prarthana Sarpal
 * Date:        November 29th, 2017
 * Version:     1.09
 * description: Type ArrayUtil.method_name to access
 */
package Sorting.lib;

/**
 *
 * @author prarthanasarpal
 */
public class ArrayUtil {

    // MAX VALUE
    public static int maxValue(int data[]) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
        
    }

    // MIN VALUE
    public static int minValue(int data[]) {
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
        
    }

    // AVERAGE
    public static double average(double data[]) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum / data.length;

    }

    // SUM
    public static int findSum(int data[]) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum;
        
    }

    // TOTAL NUMBERS
    public static int findTotal(int data[]) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total = i;
        }
        return total;

    }

    // RANDOM ARRAY INT
    public static int[] randomArray(int size) {
        int[] data = new int[size];

        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 1000) + 1;
        }
        return data;
        
    }

    // RANDOM ARRAY STRING
    public static String[] randomArrayString(int size) {
        String[] data = new String[size];
        int r;

        for (int i = 0; i < data.length; i++) {
            r = (int) (Math.random() * 2);
            if (r == 0) {
                data[i] = "" + (char) ((int) (Math.random() * 26) + 'A');
            } else {
                data[i] = "" + (char) ((int) (Math.random() * 26) + 'a');
            }
        }

        return data;
    }

    // RANDOM ARRAY NO DUPLICATES
    public static int[] randomArrayNoDuplicates() {
        int[] data = new int[10];

        for (int i = 0, c = 1; i < data.length; i++, c++) {
            data[i] = c;
        }
        for (int i = 0; i < data.length; i++) {
            int c = 0;
            c = (int) (Math.random() * 10);
            ArrayUtil.swap(data, c, i);
        }
        return data;
        
    }

    // RANDOM ARRAY NO DUPLICATES STRING
    public static String[] randomArrayNoDuplicatesString() {
        String[] data = new String[10];

        for (int i = 0, c = 65; i < data.length; i++, c++) {
            data[i] = "" + (char) ((int) c);
        }

        for (int i = 0; i < data.length; i++) {
            int c = 0;
            c = (int) (Math.random() * 10);
            ArrayUtil.swap(data, c, i);
        }
        return data;
        
    }

    // DISPLAY ARRAY
    public static void display(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    // DISPLAY ARRAY DOUBLE
    public static void display(double data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        
    }

    // DISPLAY ARRAY STRING 
    public static void displayString(String data[]) {

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println(" ");
        
    }

    // SWAPPPING
    public static void swap(int[] data, int x, int y) {
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;
        
    }

    // SWAPPING STRING
    public static void swap(String[] data, int x, int y) {
        String temp = data[x];
        data[x] = data[y];
        data[y] = temp;
        
    }

    // BUBBLE SORT ASCENDING INT
    public static void bubbleSortAscInt(int[] data) {
        int comparisons = 0;
        int swaps = 0;

        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int i = 0; i < data.length - 1; i++) {
                comparisons++;
                if (data[i] > data[i + 1]) {
                    swap(data, i, i + 1);
                    swaps++;
                }

            }
        }
        System.out.println("Number of swaps: " + swaps);
        System.out.println("Number of comparisons: " + comparisons);
        
    }

    // BUBBLE SORT DESCENDING INT
    public static void bubbleSortDescInt(int[] data) {
        int comparisons = 0;
        int swaps = 0;

        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int i = 0; i < data.length - 1 - pass; i++) {
                comparisons++;
                if (data[i] < data[i + 1]) {
                    swap(data, i, i + 1);
                    swaps++;
                }

            }
        }
        System.out.println(" ");
        System.out.println("Number of swaps: " + swaps);
        System.out.println("Number of comparisons: " + comparisons);
        
    }

    // BUBBLE SORT ASCENDING STRING
    public static void bubbleSortAscString(String[] data) {
        int comparisons = 0;
        int swaps = 0;

        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int i = 0; i < data.length - 1 - pass; i++) {
                comparisons++;
                if (data[i].toUpperCase().compareTo(data[i + 1].toUpperCase()) > 0) {
                    swap(data, i, i + 1);
                    swaps++;
                }

            }
        }
        System.out.println("Number of swaps: " + swaps);
        System.out.println("Number of comparisons: " + comparisons);
        
    }

    // BUBBLE SORT DESCENDING STRING
    public static void bubbleSortDescString(String[] data) {
        int comparisons = 0;
        int swaps = 0;

        for (int pass = 0; pass < data.length - 1; pass++) {
            for (int i = 0; i < data.length - 1 - pass; i++) {
                comparisons++;
                if (data[i].toUpperCase().compareTo(data[i + 1].toUpperCase()) < 0) {
                    swap(data, i, i + 1);
                    swaps++;
                }

            }
        }
        System.out.println("Number of swaps: " + swaps);
        System.out.println("Number of comparisons: " + comparisons);
        
    }

    // SELECTION SORT ASCENDING INT
    public static void selectionSortAscInt(int[] data) {

        int max = 0;
        int comparisons = 0;
        int swaps = 0;
        int i = 1;
        

        for (int pass = 0; pass <= data.length - 1; pass++) {
            max = data[0];
            for (;i <= data.length - 1; i++) {
                comparisons++;
                if (data[i] > max) {
                    
                    max = data[i];

                }
            } 
            swap(data, max, pass);
            swaps++;
        }
        System.out.println("Number of swaps: " + swaps);
        System.out.println("Number of comparisons: " + comparisons);
        
    }

    // SELECTION SORT ASCENDING INT
    public static void selectionSortDescInt(int[] data) {
        int max = 0;
        int comparisons = 0;
        int swaps = 0;
        int i = 1;
        
        //max = data[data.length-1];
        for (int pass = 0; pass <= data.length - 1; pass++) {
            max = data[pass];
            max = data[0];
            for (; i <= data.length - 1; i++) {
                comparisons++;
                if (data[i] <= max) {
                    max = data[i];

                }
            }
            swaps++;
            swap(data, max, pass);  // correct form otherwise index out of bounds
        }
        System.out.println(" ");
        System.out.println("Number of swaps: " + swaps);
        System.out.println("Number of comparisons: " + comparisons);
        
    }

    // SELECTION SORT ASCENDING STRING
    public static void selectionSortAscString(String[] data) {
        int max;
        int comparisons = 0;
        int swaps = 0;

        for (int pass = 0; pass < data.length - 1; pass++) {
            max = 0;
            for (int i = 1; i < data.length - pass; i++) {
                comparisons++;
                if (((data[i].toUpperCase()).compareTo(data[max].toUpperCase())) > 0) {
                    max = i;
                }
            }
            swaps++;
            swap(data, max, data.length - 1 - pass);
        }
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
        
    }

    // SELECTION SORT DESSCENDING STRING
    public static void selectionSortDescString(String[] data) {
        int max;
        int comparisons = 0;
        int swaps = 0;

        for (int pass = 0; pass < data.length - 1; pass++) {
            max = 0;
            for (int i = 1; i < data.length - pass; i++) {
                comparisons++;
                if (((data[i].toUpperCase()).compareTo(data[max].toUpperCase())) < 0) {

                    //
                    max = i;
                }
            }
            swaps++;
            swap(data, max, data.length - 1 - pass);
        }
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
        
    }

    public static int linearSearch(int[] data, int searchValue) {
        boolean notMatch = false;
        int c = 0;

        for (; c < data.length; c++) {
            do {
                if (data[c] == searchValue) {
                    return c;
                }
            } while (notMatch);
        }
        return -1;
        
    }

    public static String linearSearchString(String[] data, String searchValue) {
        boolean notMatch = false;
        int c = 0;

        for (; c < data.length; c++) {
            do {
                if (data[c] == searchValue) {
                    return data[c];
                }
            } while (notMatch);
        }
        return " ";
        
    }

    public static int binarySearchAscending(int[] data, int searchValue) {

        int l = 0;
        int r = data.length-1;
        int mid;
        int loc = -1;

        while (l <= r) {
            
                mid = (l + r) / 2;

                if (data[mid] == searchValue) {
                    return mid;
                } else if (data[mid] < searchValue) {
                        l = mid + 1;                    
                }
                else {
                    r = mid - 1;
                }
            
        } 
        return loc;
        
    }
    
     public static int binarySearchDescending(int[] data, int searchValue) {

        int l = 0;
        int r = data.length-1;
        int mid;
        int loc = -1;

        while (l <= r) {
            
                mid = (l + r) / 2;

                if (data[mid] == searchValue) {
                    return mid;
                } else if (data[mid] > searchValue) {
                        l = mid + 1;                    
                }
                else {
                    r = mid - 1;
                }
            
        } 
        return loc;
        
    }

    public static int binarySearchStringAscending(String[] data, String searchValue) {
        int l = 0;
        int r = data.length-1;
        int mid;
        int loc = -1;

        while (l <= r) {
            
                mid = (l + r) / 2;

                if (data[mid].equals(searchValue)) {
                    return mid;
                } else if ( (data[mid].toUpperCase()).compareTo((searchValue).toUpperCase()) <= 0 ) {
                        l = mid + 1;                    
                }
                else {
                    r = mid - 1;
                }
            
        } 
        return loc;
        
    }
    
    public static int binarySearchStringDescending(String[] data, String searchValue) {
        int l = 0;
        int r = data.length-1;
        int mid;
        int loc = -1;

        while (l <= r) {
            
                mid = (l + r) / 2;

                if (data[mid].equals(searchValue)) {
                    return mid;
                } else if ( (data[mid].toUpperCase()).compareTo((searchValue).toUpperCase()) >= 0 ) {
                        l = mid + 1;                    
                }
                else {
                    r = mid - 1;
                }
            
        } 
        return loc;
        
    }


}