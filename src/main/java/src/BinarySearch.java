package src;

public class BinarySearch
{
    public static boolean binarySearch(int[] array, int wanted, int start, int length)
    {
        if(start > length) return false;

        int middle = (start + length) / 2;

        if(wanted == array[middle]) return true;

        else if(wanted > array[middle]) return binarySearch(array, wanted, middle + 1, length);

        else return binarySearch(array, wanted, start, middle - 1);
    }
}