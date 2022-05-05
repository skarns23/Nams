package devmatching2021;
import java.util.*;
public class MatrixTurn {
	
	
	public static int[] solution(int rows,int columns, int[][]queries) {
		int[] answer = new int [queries.length];
		int[][] arr = new int [rows][columns];
		int[][] arr2;
		int value = 1;
		int x1,y1,x2,y2;
		for(int i =0;i <rows;i++)
			for(int j = 0;j <columns;j++) {
				arr[i][j] = value;
				value++;
			}
		for(int i = 0 ; i<queries.length;i++) {
			x1 = queries[i][0]-1;
			y1 = queries[i][1]-1;			
			x2 = queries[i][2]-1;
			y2 = queries[i][3]-1;
			arr2 = arr.clone();
			int x = x1, y = y1+1;
			arr[x][y] = arr2[x][y-1];
			int min_value = Integer.MAX_VALUE;
			while(true) {
				if(x==x1 &&y==y1)
					break;
				if(min_value>arr2[x][y])
					min_value = arr2[x][y];
				if(x==x1 && y<y2) {
					y++;
					arr[x][y] = arr2[x][y-1];
				}
				else if(y==y2 &&x<x2) {
					x++;
					arr[x][y]=arr2[x-1][y];
				}
				else if(x==x2 &&y>y1) {
					y--;
					arr[x][y] = arr2[x][y+1];
				}
				else if(y==y1 &&x<x1) {
					x--;
					arr[x][y] =arr[x+1][y];
				}
				
			}
			answer[i] = min_value;
			
			
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
