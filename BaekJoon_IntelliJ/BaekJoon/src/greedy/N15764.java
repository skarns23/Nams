package greedy;

import java.io.*;
import java.util.*;
// https://www.acmicpc.net/problem/15764
// Milking Order
// 주어진 조건 속 1번 소가 제일 빨리 젖을 짤 수 있는 위치를 구하는 문제
public class N15764 {
    public static void main(String[] args) throws IOException {
        // 문제에서 N은 총 소의 수, M은 특정 소의 지켜야할 위치, K는 위치가 정해진 소의 수이며 소의 번호, 인덱스로 알려줌

        // Reader와 Writer를 활용한 입출력을 위한 초기 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // StringTokenizer를 통해 줄 단위 입력을 문자 단위로 변경
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 지켜야하는 소들의 순서를 저장하는 list 생성
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        // 전체 소를 담을 수 있는 크기의 배열을 생성
        int[] arr  = new int [N];
        // 소들의 순서 중 목표로하는 1번 소가 포함된 경우와 아닌 경우의 처리 방식이 다름으로 flag 변수를 통해 확인
        boolean flag = false;
        // 이후 위치가 지정된 소들을 관리하기 위한 map
        Map<Integer, Integer> map = new HashMap<>();
        // 지켜야하는 소들의 순서를 입력받기위한 for문
        for(int i = 0 ;i<M;i++){
            int value = Integer.parseInt(st.nextToken());
            list.add(value);
            // 지켜야하는 순서의 소 중 목표 소가 포함된 경우 flag 변수를 true 변환
            if(value==1) {
                flag = true;
            }
        }
        // 위치가 지정된 소들을 입력받는 for문
        for(int i = 0 ; i<K;i++){
            st = new StringTokenizer(br.readLine());
            // 소의 번호를 담는 변수 num
            int num = Integer.parseInt(st.nextToken());
            // 해당 소의 위치를 담는 변수 idx
            int idx = Integer.parseInt(st.nextToken());
            map.put(num,idx); // map을 통해 소의 번호와 위치 인덱스를 같이 저장
            arr[idx-1] = num; // 소를 놔두는 배열에 값 설정 idx-1의 경우 문제에서 주어지는 입력이 인덱스 1을 기준으로 하기때문
        }
        // 소들의 순서에 1이 포함된 경우
        if(flag){
            // 소가 놓여진 배열을 앞에서부터 탐색
            for(int i = 0 ;i<arr.length;i++){
                // 현재 배열의 위치에 아무 소도 없고, 순서를 지켜야할 소가 존재하며 해당 소가 지정된 위치가 없는 경우
                if(arr[i]==0&&!list.isEmpty()&&!map.containsKey(list.get(0))){
                    arr[i] = list.remove(0); // 해당 위치에 순서를 지켜야할 소를 놓음
                }
                // 순서를 지켜야할 소가 존재하며, 해당 소가 지정된 위치가 있는 경우, 해당 위치 도달시 list에서 삭제
                if(!list.isEmpty()&&map.containsKey(list.get(0))&&arr[i]== list.get(0)) list.remove(0);
            }
        }else { // 목표 (1번)소를 제외하고, 순서를 지켜야하는 경우
            // 뒤에서부터 소를 놓아서 1번 소가 가능한 앞에 위치할 수 있도록 설정
            for(int i = arr.length-1;i>=0;i--){
                // 현재 배열의 위치에 아무 소도 없고, 뒤에서 부터 순서를 지켜야할 소가 존재하며 해당 소가 지정된 위치가 없는 경우
                if(arr[i]==0&&!list.isEmpty()&&!map.containsKey(list.get(list.size()-1))){
                    arr[i] = list.remove(list.size()-1);
                } // 순서를 지켜야할 소가 존재하며, 해당 소가 지정된 위치가 있는 경우, 해당 위치 도달시 list에서 삭제
                if(!list.isEmpty()&&map.containsKey(list.get(list.size()-1))&&(arr[i]==list.get(list.size()-1))) list.remove(list.size()-1);



            }
        }
        // flag가 true 인 경우 1로 소의 위치를 지정해주나
        // flag가 false 인 경우 0으로 위치에 소를 놓을 수 있음으로 for 문을 통해 탐색
        for(int i = 0 ;i<arr.length;i++){
            if((arr[i]==0&&!flag)||(flag&&arr[i]==1)){
                bw.write(i+1);
                break;
            }
        }
    }
}
