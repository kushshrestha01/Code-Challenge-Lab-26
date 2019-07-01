import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortAlgorithmTest {

    @Test
    public void insertionSortTest(){
        InsertionSortAlgorithm test = new InsertionSortAlgorithm();
        int[] arr = {1,3,2,4,6,5};
        int[] expectedArray = {1,2,3,4,5,6};
        assertArrayEquals("Checking if the function sorts the array",
                expectedArray,
                test.insertionSort(arr));

    }

}