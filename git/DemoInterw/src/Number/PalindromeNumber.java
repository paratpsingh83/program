package Number;

public class PalindromeNumber {

    public static boolean isPalindrome(int number){
        int temp=number;
        int reverse=0;
        while(number!=0){
            int remender=number%10;
            reverse=reverse*10+remender;
            number=number/10;
        }
        if(temp==reverse){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int number=121;
        System.out.println(isPalindrome(number));
    }
}
