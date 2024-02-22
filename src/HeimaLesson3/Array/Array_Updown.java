package HeimaLesson3.Array;

import java.util.Arrays;
import java.util.Collections;

public class Array_Updown {
    public static void main(String[] args) {
        /*对数组进行反转*/

        //Method1
        int[] arr = {10,20,30,40,50};
        for (int i = 0, j = arr.length - 1; i < j ; i++ , j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
        }
        System.out.println(Arrays.toString(arr));

        //Method2
        Integer[] arr2 = {10,20,30,40,50};
        Collections.reverse(Arrays.asList(arr2));
        System.out.println(Arrays.toString(arr2));
    }
}
