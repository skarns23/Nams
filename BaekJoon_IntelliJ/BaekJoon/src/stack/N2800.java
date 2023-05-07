package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

// https://www.acmicpc.net/problem/2800
// 괄호 제거 문제
// 어떤 수식이 주어졌을 때, 괄호를 제거해서 나올 수 있는 서로 다른 식의 개수를 계산하는 프로그램을 작성하시오.
// 아이디어 : 스택을 활용하여 괄호를 짝지은 후, 재귀함수 호출을 통해 만들어질 수 있는 조합을 만들어 TreeSet에 넣음으로써 자동 정렬되도록 함
public class N2800 {
    public static String input;
    public static boolean[] visited;
    public static Stack<Integer> stack = new Stack<>();
    public static TreeSet<String> result = new TreeSet<>();
    public static List<Item> items = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        input = br.readLine();
        visited = new boolean[input.length()];
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(c=='('){
                stack.push(i);
            }else if(c==')'){
                items.add(new Item(stack.pop(),i));
            }
        }
        dfs(0);
       for(String s : result){
           bw.write(s+"\n");
       }
       bw.flush();
       bw.close();
    }

    public static void dfs(int depth){
        if(depth==items.size()){
            boolean flag = false;
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<input.length();i++){
                if(!visited[i]){
                    sb.append(input.charAt(i));
                }else flag = true;
            }
            if(flag) result.add(sb.toString());
            return ;
        }
        visited[items.get(depth).front] = true;
        visited[items.get(depth).back] = true;
        dfs(depth+1);

        visited[items.get(depth).front] = false;
        visited[items.get(depth).back] = false;
        dfs(depth+1);


    }
    public static class Item {
        int front;
        int back;
        public Item(int f,int b){
            this.front = f;
            this.back = b;
        }
    }
}
