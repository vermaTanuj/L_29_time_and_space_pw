package String;

public class Que {
    public static void main(String[] args) {
        //Check wethere the string is palindrome or not;
        String s="abccba";
        System.out.println(palindromOrNot(s));
        System.out.println(palindromOrNot_1(s));
    }
    public static boolean palindromOrNot(String s){
        boolean rr=false;
        s.toLowerCase();

        char[] c=s.toCharArray();
        int l=c.length-1;
        for(int i=0;i<c.length;i++){
           if(c[i]==c[l--]){
               rr=true;
           }
           else{
               return false;
           }
        }

        return rr;
    }

    public static boolean palindromOrNot_1(String s){
        s.toLowerCase();
        boolean rr=false;
        char []c=s.toCharArray();
        int st=0;
        int end=s.length()-1;

        while(st<=end){
            if(c[st++]==c[end--]){
               rr=true;
            }
            else{
                return false;
            }
        }
        return rr;
    }
}
