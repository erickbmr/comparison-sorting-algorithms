package src;

public class BubbleSort
{
    public void bubble(int[] array, int index)
    {
        int swapCounter = -1, aux = 0;

        do
        {
            swapCounter = 0;
            for(int i = 0; i < index - 1; i++)
            {
                if(array[i] > array[i + 1])
                {
                    if (array[i + 1] != '\0')
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

    }
}
