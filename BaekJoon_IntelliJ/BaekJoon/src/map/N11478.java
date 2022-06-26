package map;

import java.util.HashSet;
import java.util.Scanner;

public class N11478 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<String> hashSet = new HashSet<>();
        for(int i = 1; i<=s.length();i++){
            int start = 0;
            for(int j = i;j<=s.length();j++){
                hashSet.add(s.substring(start,j));
                start++;
            }
        }
        System.out.println(hashSet.size());
    }
}
