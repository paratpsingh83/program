package ArrayDemo;

import java.util.Arrays;
public class KthLargest {

    public static int KthLargestNumber(int [] arr,int k){
        Arrays.sort(arr); // Sort the array
        return arr[arr.length - k]; // Return the Kth largest element
    }

    public static void main(String [] args){
        int [] arr={1,3,5,7,8,9,4,6,7,9,5,3,3,3,4,56,6};
        int k=2;
        System.out.println("The " +k+"th  Largest Number is "+ KthLargestNumber( arr, k));
    }
}
