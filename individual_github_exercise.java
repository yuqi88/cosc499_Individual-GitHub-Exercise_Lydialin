import java.util.Arrays;

import java.util.Scanner;

public class individual_github_exercise {
    public static void main(String args[])
    {
        //7 3 4 5 2 1
        //inline comment for recording.
        System.out.println("Enter 6 integers to form an array:");
        Scanner scr = new Scanner(System.in);
        int[] array = new int[6];
        for(int i=0; i<array.length; i++)
            array[i] = scr.nextInt();
        scr.close();

        System.out.print("The array looks like: [");
        for(int i=0; i<array.length; i++)
            System.out.print(array[i]);
        System.out.println("] before sorting.");


        sortArray(array);
        System.out.print("The array looks like: [");
        for(int i=0; i<array.length; i++)
            System.out.print(array[i]);
        System.out.println("] after sorting.");
    }

    public static void sortArray(int[] arr){
        Arrays.sort(arr);
    }
}
