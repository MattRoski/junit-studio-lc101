package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusBinarySearchTest {

    @Test
    public void returnsIndex(){
        int[] arr = {1, 6, 8, 25, 53};
        assertEquals(1, BonusBinarySearch.binarySearch(arr,6));
    }

    @Test
    public void returnsFirstIndex(){
        int[] arr = {1, 6, 8, 25, 53};
        assertEquals(0, BonusBinarySearch.binarySearch(arr,1));
    }

    @Test
    public void returnsLastIndex(){
        int[] arr = {1, 6, 8, 25, 53};
        assertEquals(4, BonusBinarySearch.binarySearch(arr,53));
    }

}
