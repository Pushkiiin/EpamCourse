package hackerrank30days.day8;

import java.util.HashMap;
import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> phonebook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phonebook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            System.out.println(phonebook.containsKey(s) ? s + "=" + phonebook.get(s) : "Not found");
        }
        in.close();
    }
}

