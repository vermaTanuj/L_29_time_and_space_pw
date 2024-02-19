package __String__;

public class Que {
    public static void main(String[] args) {
        //check if a string is palindrome or not:-
        System.out.println(isPalindrome("a b c dd c b a"));
        System.out.println(revString("abcde"));

        System.out.println("tanuj verma:-"+revSentence("tanuj verma"));
        System.out.println("[ tanuj  verma is good ]:-"+revSentence(" tanuj  verma is good ")+"]");
        System.out.println("revSentence(  tanuj verma  ):-"+"["+revSentence("  tanuj verma  ")+"]");
        System.out.println("revSentence(  tanuj   verma  ):-"+revSentence("  tanuj   verma  "));
        System.out.println(revSentence("Welcome   to Coding Ninjas"));

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

    //Reverse a string:-
    public static String revString(String s){

        if(s.length()==0 )return "Empty string";
        if(s==null){return "Null";}
        int st=0;
        int end=s.length()-1;
        char []c=s.toCharArray();

        while(st<end) {
            char temp = c[st];
            c[st] = c[end];
            c[end] = temp;
            st++;end--;
        }
        return String.valueOf(c);
    }

    // Reverse the string array:-
    public static String[] revStringArray(String []a){
        int st=0;
        int end =a.length-1;

        while(st<end){
            String temp=a[st];
            a[st]=a[end];
            a[end]=temp;
            st++;
            end--;
        }
        return a;
    }

    //reverse the sentence not word;
    public static String revSentence(String s){
        s.trim();
        //Splint int words:-
        String []words=s.trim().split(" ");
        //reverse the sentence :-
        revStringArray(words);

        //rejoin the string and return:-
        return String.join(" ",words);

    }
}
