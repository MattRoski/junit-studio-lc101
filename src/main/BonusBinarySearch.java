package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
        int right = sortedNumbers.length - 1; //equals 4 in the tests
        int left = 0;
        while (right >= left) {
            int mid = left + ((right - left) / 2);
            System.out.println(mid);
            if (sortedNumbers[mid] > n) {
                right = mid - 1;
            } else if (sortedNumbers[mid] < n) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
