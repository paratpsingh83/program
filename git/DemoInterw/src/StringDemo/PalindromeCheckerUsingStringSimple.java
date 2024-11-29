package StringDemo;

public class PalindromeCheckerUsingStringSimple {
    public static boolean isPalindrome(String  str){
        String revers="";
        for(int i=str.length()-1; i>=0;i--){
            revers=revers+str.charAt(i);
        }
       if(str.equals(revers)){
           return  true;
       }
       return false;
    }
    public static void main(String[] args) {
        String str="madam";
        System.out.println(isPalindrome(str));
    }
}
