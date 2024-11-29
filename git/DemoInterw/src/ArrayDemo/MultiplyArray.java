package ArrayDemo;

public class MultiplyArray {

    public static int multiply(int [] arr, int index){
        if(index>= arr.length){
            return 1;
        }
        return arr[index]*multiply(arr,index+1);

    }

    public static void main(String[] args) {
        int [] arr= {1,2,3,4};
        int result=multiply(arr,0);
        System.out.println(result);
    }
}
