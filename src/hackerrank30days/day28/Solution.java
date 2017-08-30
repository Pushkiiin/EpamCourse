package hackerrank30days.day28;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


//not exactly regex, but who cares, right? xD
//tbh I do...
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> list = new ArrayList<>();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();

            if(emailID.length() >= 10 && emailID.substring(emailID.length() - 10, emailID.length()).equals("@gmail.com")){
                list.add(firstName);
            }
        }
        list.sort(new myStringComparator());
        list.forEach(System.out::println);
    }
}

class myStringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
