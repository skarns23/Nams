package dp;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/9461
* 파도반 수열 문제 위치가 주어졌을 때 해당 위치에서의 값 반환하기
* */
public class N9461 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //총 실행될 테스트 케이스의 수
        int repeat = sc.nextInt();
        for(int x = 0; x<repeat;x++) {
            // 탐색할 파도반 수열의 위치 N
            int N = sc.nextInt();

            // 파도반 수열의 경우 int범위를 벗어나기때문에 long 자료형으로 설정
            long[] arr = new long[N + 1];

            //N값이 3보다 큰 경우에 대해 초기 값 설정
            if (N > 3) {
                for (int i = 1; i <= 3; i++) {
                    arr[i] = 1L;
                }
            }else{ // N이 3보다 작은 경우 1 2 3위치의 값은 모두 1로 같으므로 1 설정 및 반환
                arr[N]=1L;
            }

            // 이후 파도반 수열의 값을 구하는 점화식을 적용
            for (int i = 4; i <N + 1; i++) {
                arr[i] = arr[i - 2] + arr[i - 3];
            }
            // 마지막 테스트 케이스인 경우 개행을 포함하지 않도록 하기위함
            if(repeat-1==x){
                bw.write(arr[N]+"");
                break;
            }
            bw.write(arr[N]+"\n");
        }
        bw.flush();
    }
}
