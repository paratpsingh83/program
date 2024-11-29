package bbbb;


//1.Write  Java  Program to find Second Largest Number in an Array                              2,Write Java Program to reverse String without using inbuilt methods
public class Demo3 {
    public static void main(String[] args) {
        int [] arr1={1,3,2,5,4,7,8,9,2};
        int secondHihest = findSecondHihest(arr1);
        System.out.println(secondHihest);
    }
    public  static  int findSecondHihest(int[] arr1){
        int lagrgest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:arr1){
            if(num>lagrgest){
                secondLargest=lagrgest;
                lagrgest=num;
            }else if(num>secondLargest&&num<secondLargest){
                secondLargest=num;
            }
        }
        return  secondLargest;
    }

}
