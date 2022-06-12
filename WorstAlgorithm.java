/*WORST ALGORITHM EVER!!*/
//This algorithm is the stupidest and the most randomized algorithm ever
/*
    This is a sorting algorithm that simply keep shuffling the array until it's completely sorted!
    Best time complexity O(1), if the array given is already sorted
    Worst time complexity is random, unknown, we can also say INFINITY!

    while(array is not sorted)
    {
    shuffle();
    }

    * At the example I made here, {1,3,2,4}, if you run this program many times, you will see how extremely random is this algorithm
    You can find the number of shuffling is 1 and you can find it in another hand exceeding the 70.

    You can also observe how huge number of steps increase by increasing the size of the array!

    An example I have created is : int[] array = {1,3,2,4,9,1,5,1,4,3,1,2};
    The result was :
    -------------------
    final array:
    1 1 1 1 2 2 3 3 4 4 5 9
    --------------------------------
    Total number of steps of shuffling is: 433407

    Even with a very small array like {2,1}, you can find your program keep shuffling 10 times until it reaches to the goal {1,2}



 */

// This program is just for Fun and testing - Never recommended for sure!
public class WorstAlgorithm {
    public static void main(String[] args) {
        int[] array = {1,3,2,4};
        int totalShuffling = worstAlgorithm(array);

        System.out.println("--------------------------------\nTotal number of steps of shuffling is: " + totalShuffling);
    }

    /* */
    public static int worstAlgorithm(int[] array)
    {
        int steps = 0;

        while(!isSorted(array))
        {
            System.out.println("the array of step: " + steps);
            printArray(array);

            shuffle(array);
            steps++;

        }
        System.out.println("-------------------\nfinal array:");
        printArray(array);
        return steps;
    }

    public static void shuffle(int[] array)
    {
        for(int i = 0 ; i<array.length ; i++)
        {
            int randomPosition = (int)(Math.random()* array.length);
            swap(i,randomPosition,array);
        }
    }

    public static void swap(int i , int j , int[] array)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static boolean isSorted(int[] array)
    {
        boolean sorted = true;
        for(int i = 1 ; i<array.length &&sorted; i++)
        {
            if(array[i]<array[i-1])
                sorted = false;
        }
        return sorted;
    }

    public static void printArray(int[] array)
    {
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
