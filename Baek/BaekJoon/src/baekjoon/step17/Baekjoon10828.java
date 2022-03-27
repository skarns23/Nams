package baekjoon.step17;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Baekjoon10828 {
	
	static class Solution{
		static ArrayList<Integer> list;
		
		public Solution() {
			list = new ArrayList<Integer>();
		}
		public void push(int x) {
			list.add(x);
		}
		public int pop() {
			if(list.size()>0) {
				return list.remove(list.size()-1);
			}
			return -1;
		}
		
		public int size() {
			return list.size();
		}
		public int empty() {
			if(list.size()>0)
				return 0;
			
			return 1;
		}
		public int top() {
			if(list.size()<=0)
				return -1;

				return list.get(list.size()-1);
			
		}
	}
		
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc  =new Scanner(System.in);
		Solution sol = new Solution();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = sc.nextInt();
		for(int i = 0; i<num;i++) {
			String s = sc.next();
			
			switch (s) {
			case "push":
				int val = sc.nextInt();
				sol.push(val);
				break;
			case "pop":
				bw.write(sol.pop()+"\n");
				break;
			case "size":
				bw.write(sol.size()+"\n");
				break;
			case "empty":
				bw.write(sol.empty()+"\n");
				break;
			case "top":
				bw.write(sol.top()+"\n");
				break;
			}
		}
		bw.flush();
		bw.close();
	}

}
