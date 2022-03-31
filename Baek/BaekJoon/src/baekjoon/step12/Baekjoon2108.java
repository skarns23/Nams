package baekjoon.step12;
import java.io.*;
import java.util.*;
import java.math.*;
public class Baekjoon2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int [size]; //�߾� ���� ã�� �迭
		int[] index = new int [8001]; //ī���� ������ ������ �迭 
		int sum = 0;
		int max_value = Integer.MIN_VALUE;
		int min_value = Integer.MAX_VALUE;
		for(int i =0;i<size;i++) {
			int num = Integer.parseInt(br.readLine());
			index[num+4000]++;
			arr[i] = num;
			if(size == 1) 
			{
					max_value = num;
					min_value = num;
			}
			else
			{
				if(max_value<num)
					max_value = num;
				if(min_value>num)
					min_value = num;
			}
			sum +=num;
		}
		Arrays.sort(arr);
		double avg = (double)sum / size;
		
		
		
		int mode_max = 0;
		int mode = 10000;
		boolean flag = false;
		for(int i = min_value+4000;i<=max_value+4000;i++) {
			if(index[i]!=0) { //ī���� ������ �����߱⶧���� �ε����� ���� 0�̸� �������� ���� ���̹Ƿ� �������� ����
				
				if(index[i]>mode_max) { // index[i]�� ���� �ֺ� �� ���� ū ��� 
					mode_max = index[i]; // �ֺ� ���� �ٲٰ�
					mode = i - 4000; // �ش� �ϴ� value�� ����
					flag = true; // ó�� ������ ����̹Ƿ� true ����
				}
				else if(index[i] == mode_max &&flag) { // �ֺ� ���� �ι�°�� ������ ���
					flag = false; // �ι�°�� ����ϱ� ���� false�� ����
					mode = i-4000; // �ι����� ������ �ֺ� ���� mode������ ����
				}
			}
		}
		
		
		
		bw.write(Math.round(avg)+"\n");
		bw.write(arr[(size-1)/2]+"\n");
		bw.write(mode+"\n");
		bw.write(max_value-min_value+"");
		bw.flush();

		}
		
	}

		


