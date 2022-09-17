import java.util.Arrays;

import java.util.Scanner;

public class individual_github_exercise {
    public static void main(String args[])
    {
        System.out.println("Enter 6 integers to form an array:");
        Scanner scr = new Scanner(System.in);
        int[] array = new int[6];
        System.out.print("The array looks like: [");
        for(int i=0; i<array.length; i++){
            array[i] = scr.nextInt();
            System.out.print(array[i]);
        }
        System.out.println("]");
        scr.close();
    }
    public static void sortArray(int[] arr){
        Arrays.sort(arr);

    }
}
