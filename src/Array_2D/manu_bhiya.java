package Array_2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class manu_bhiya {

    public  List<String> modify(List<String> lst) {
        List<String> lst1= lst.stream().sorted().collect(Collectors.toList());
        return lst1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of words: ");
        int n = sc.nextInt();
        System.out.println("enter the word:");
        List<String> lst = new ArrayList<>();
        for(int i=0; i<n; i++) {
            String s = sc.next();
            lst.add(s);
        }
        manu_bhiya obj = new manu_bhiya();
        //Class called statically":-
        List<String> lst1 = obj.modify(lst);
        for(int i=0; i<lst.size(); i++) {
            System.out.println(lst1.get(i));
        }
    }
}
