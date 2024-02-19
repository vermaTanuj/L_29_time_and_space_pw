package String;

public class String_Performence {
    public static void main(String[] args) {

        String alpha="";
        //filling:-
        for(int i=0;i<26;i++){
            char ch=(char) ('a'+i);
            alpha=alpha+ch ;
        }
        System.out.println(alpha);///:- creates new obj at every itteration so it is not optimised aproch
        System.out.println((int)'ૐ');//:-2768

        //String builder :- in it's obj you are mutable ,
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            char c=(char) ('a'+i);
            sb.append(c);
        }
        System.out.println(sb);
    }
}
