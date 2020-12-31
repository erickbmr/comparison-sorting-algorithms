package src;

public class InsertionSort
{
    public static void insertion(int[] array)
    {
        int aux = 0, index = 0, length = array.length;

        for(int k = 1; k <= length; k++)
        {
            aux = array[k];
            index = k - 1;

            while(index >= 0 && aux < array[index])
            {
                array[index + 1] = array[index];
                index--;
            }

            array[index + 1] = aux;
        }
    }
}