package String;

import java.util.Arrays;

public class Anagram_question {
    public static void main(String[] args) {
        String s="listen";
        String e="silent";

        AnagramCheckerClass a=new AnagramCheckerClass();
        System.out.println(   a.isAnagramOrNot(s,"listey"));



    }
}
class AnagramCheckerClass{
    public String isAnagramOrNot(String s1,String s2){
        String rr="No";

        char[]c1=s1.toCharArray();
        char[]c2=s2.toCharArray();

      Arrays.sort(c1);
      Arrays.sort(c2);

      if(c1.length!=c2.length){
          return rr;
      }
      else{
          if(c1.equals(c2)){
              rr="Yes";
          }
      }

        return rr;
    }
}




