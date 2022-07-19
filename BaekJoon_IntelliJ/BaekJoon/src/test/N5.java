package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class N5Result {

    public static List<List<Integer>> textQueries(List<String> sentences, List<String> queries) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i<queries.size();i++){
            String[] arr = queries.get(i).split(" ");
            List<Integer> inner_result = new ArrayList<>();
            int query_count = 0;
            for(int j = 0 ; j< sentences.size();j++){
                HashSet<String> set = new HashSet<>(Arrays.asList(sentences.get(j).split(" ")));
                int include = 0 ;
                for(int k = 0 ;k<arr.length;k++){
                    if(!set.contains(arr[k]))
                        break;
                    else
                        include++;
                }
                if(include==arr.length){
                    inner_result.add(j);
                    query_count++;
                }
            }
            if(query_count==0)
                inner_result.add(-1);
            result.add(inner_result);
        }



        return  result;
    }
}
public class N5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int sentencesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> sentences = IntStream.range(0, sentencesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<List<Integer>> result = N5Result.textQueries(sentences, queries);

        result.stream()
                .map(
                        r -> r.stream()
                                .map(Object::toString)
                                .collect(joining(" "))
                )
                .map(r -> r + "\n")
                .collect(toList())
                .forEach(e -> {
                    try {
                        bufferedWriter.write(e);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

        bufferedReader.close();
        bufferedWriter.close();
    }
    }

