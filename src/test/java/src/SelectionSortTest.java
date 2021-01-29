package src;

import org.junit.Test;
import static org.junit.Assert.*;

public class SelectionSortTest{

  @Test
	public void testSelectiontionSort(){
		int[] array = {-1, 0 , 10, 15, 3, 5, 8};
		array = SelectionSort.selectionSort(array);

		assertEquals(-1, array[0]);
		assertEquals(0, array[1]);
		assertEquals(3, array[2]);
		assertEquals(5, array[3]);
		assertEquals(8, array[4]);
		assertEquals(10, array[5]);
		assertEquals(15, array[6]);
	}
}
