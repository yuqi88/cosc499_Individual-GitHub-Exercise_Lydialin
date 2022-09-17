import java.util.Arrays;

public class individual_github_exercise {
    public static void main(String args[])
    {
        int[] testArray = {7,3,4,5,2,1};
        sortArray(testArray);
        for(int i=0; i<testArray.length; i++)
            System.out.print(testArray[i] + " ");
        System.out.println("for recording yay");
    }
    public static void sortArray(int[] arr){
        Arrays.sort(arr);
    }
}
