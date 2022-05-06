package devmatching2021;
import java.util.*;
public class MatrixTurn {
	
	
	public static int[] solution(int rows,int cols, int[][]queries) {
		int[] answer = new int [queries.length];
		Queue <Integer> que = new LinkedList<>();
		int value = 1;
		int[][] arr = new int[rows][cols];
		for(int i = 0 ;i <rows;i++) {
			for(int j = 0; j<cols;j++) {
				arr[i][j] = value;
				value++;
			}
		}
		for(int i =0; i<queries.length;i++) {
			int x1 = queries[i][0]-1;
			int y1 = queries[i][1]-1;
			int x2 = queries[i][2]-1;
			int y2 = queries[i][3]-1;
			int x, y;
			int min = Integer.MAX_VALUE;
			int[][] arr2 = arr.clone();
			x = x1; y = y1+1;
			que.add(arr[x1][y1]);
			while(!(x ==x1 &&y == y1)){
			que.add(arr[x][y]);
			if(x==x1 &&y<y2)
				y++;
			else if(y==y2 &&x<x2)
				x++;
			else if(x==x2&&y>y1)
				y--;
			else if(y==y1 &&x>x1)
				x--;
			
			
			}
			y++;
			while(!que.isEmpty()) {
				int v = que.poll();
				if(v <min)
					min = v;
				arr[x][y] = v;
				if(x==x1 &&y<y2)
					y++;
				else if(y==y2 &&x<x2)
					x++;
				else if(x==x2&&y>y1)
					y--;
				else if(y==y1 &&x>x1)
					x--;
			}
			answer[i] = min;
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] queries = new int [][] {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		int[] result =solution(row,col,queries);
		for(int i : result) {
			System.out.print(i+" ");
		}
		
	}

}
