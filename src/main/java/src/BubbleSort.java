package src;

public class BubbleSort
{
    public static int[] bubble(int[] array)
    {
        int swapCounter = -1, aux = 0;
        int index = array.length;

        do
        {
            swapCounter = 0;
            for(int i = 0; i < index - 1; i++)
            {
                if(array[i] > array[i + 1])
                {
                    if (array[i + 1] != -1)
                    {
                        aux = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = aux;
                        swapCounter++;
                    }

                    else break;
                }
            }
            index--;
        }while(swapCounter != 0);

        return array;
    }
}
