package test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

class N3Result{
    public static int countPairs(List<Integer> numbers,int k ){
        HashSet<Integer> set = new HashSet<>(numbers);
        int count = 0 ;
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            if(set.contains(iterator.next()+k))
                count++;
        }
        return count;
    }
}
public class N3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<N;i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        int k = Integer.parseInt(br.readLine());
        int result = N3Result.countPairs(list,k);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
