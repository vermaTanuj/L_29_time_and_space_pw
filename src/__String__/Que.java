package __String__;

public class Que {
    public static void main(String[] args) {
        //check if a string is palindrome or not:-
        System.out.println(isPalindrome("a b c d c b a"));
    }

    //programme to find that string is palindrome or not
    public static String isPalindrome(String s){

         s.toLowerCase();
        char []c=s.toCharArray();
        int end=c.length-1;

        for(int i=0;i<c.length;i++){
            if(c[i]!=c[end--]){
               return "No";
            }
        }

        return "Yes";
    }
}
