package src;

public class MergeSort
{
    public static void mergeSort(int array[], int start, int length)
    {  
        if(start < length)
        {
            int middle = (start + length) / 2;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, length);
            merge(array, start, middle, length);
        }
    }

    public static void merge(int[] array, int start, int middle, int length)
    {
        int leftSize = middle - start + 1;
        int rightSize = length - middle;
        
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        
        int leftIndex = 0, rightIndex = 0;

        int i;

        for(i = 0; i < leftSize; i++)
            left[i] = array[start + i];

        for(i = 0; i < rightSize; i++)
            right[i] = array[middle + 1 + i];

        for(i = start; i <= length; i++)
        {
            if(leftIndex < leftSize)
            {
                if(rightIndex < rightSize)
                {
                    if(left[leftIndex] < right[rightIndex])
                        array[i] = left[leftIndex++];
                    else
                        array[i] = right[rightIndex++];
                }

                else
                {
                    array[i] = left[leftIndex];
                }
            }

            else
            {
                array[i] = right[rightIndex++];
            }
        }
    }
}