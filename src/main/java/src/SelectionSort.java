package src;

public class SelectionSort
{
    public static int term = 0;

    public static int[] selectionSort(int[] array)
    {
        int aux = 0, minimum = 0;

        for(int i = 0; i < array.length; i++)
        {
            minimum = getMinimum(array, i);

            if(array[i] > minimum)
            {
                aux = array[i];
                array[i] = minimum;
                array[term] = aux;
            }
            else
            {
                continue;
            }
        }

        return array;
    }

    public static int getMinimum(int[] array, int startIndex)
    {
        int maximum = 0, minimum = 0, endIndex = array.length;

        for(int i = startIndex; i < endIndex; i++)
        {
            if(maximum < array[i]) maximum = array[i];
        }

        minimum = maximum;

        for(int j = startIndex; j < endIndex; j++)
        {
            if(minimum > array[j])
            {
                minimum = array[j];
                term = j;
            }
        }

        return minimum;
    }
}