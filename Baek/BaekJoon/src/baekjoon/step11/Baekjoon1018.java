package baekjoon.step11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
public class Baekjoon1018 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int row =  Integer.parseInt(st.nextToken());
		int col =  Integer.parseInt(st.nextToken());
		
		char[] color = new char[] {'W','B'};
		char[][] arr =new char[row][col];
		for(int i =0;i<row;i++) {
			String s = br.readLine();
			for(int j = 0; j<col;j++)
				arr[i][j] = s.charAt(j);
		}
		int result = 64;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =0;i<row-7;i++) {
			
			for(int j = 0;j<col-7;j++) {
				
				int color_w = 0;
				int color_b = 0;
				
				for(int k =i;k<i+8;k++) {
					
					for(int z = j;z<j+8;z++) {
						
						if((k+z)%2==0) {
							if(arr[k][z]!='W')
								color_w++;
							if(arr[k][z]!='B')
								color_b++;
						}
						else if((k+z)%2==1) {
							if(arr[k][z]!='W')
								color_b++;
							if(arr[k][z]!='B')
								color_w++;
						}
					}
				}
				list.add(color_b);
				list.add(color_w);
				}
				
			}
		Collections.sort(list);
		bw.write(list.get(0)+"");
		bw.flush();	
		}
		
		
	}

