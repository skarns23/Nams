package implement;

import java.io.*;
// https://www.acmicpc.net/problem/20546
// 기적의 매매법
//
public class N20546 {

    public static void main(String[] args) throws Exception {
        People[] peoples = new People[2];
        boolean flag = false;
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int money = Integer.parseInt(br.readLine());
        for(int i=0;i<2;i++){
            peoples[i] = new People(money,0);
        }
        String[] values = br.readLine().split(" ");
        int endValue = Integer.parseInt(values[values.length-1]);
        int preValue = Integer.parseInt(values[0]);
        for(int i=0; i<values.length;i++){
            String sValue = values[i];
            int value = Integer.parseInt(sValue);
            if(peoples[0].money>=value){
                int funds = peoples[0].money/value;
                peoples[0].fund += funds;
                peoples[0].money -= funds*value;
            }
            int result = value-preValue;
            if(result ==0){
                 count = 0;
            }else if(result >0){
                count = flag ? count+1 : 1;
                flag = true;
            }else {
                count = !flag ? count-1 : -1;
                flag = false;
            }
            if(Math.abs(count)>=3){
                if(flag){
                    peoples[1].money += peoples[1].fund*value;
                    peoples[1].fund = 0;
                }else {
                    peoples[1].fund += peoples[1].money / value;
                    peoples[1].money -= (int)(peoples[1].money / value) * value;
                }
            }
            preValue = value;
        }
        int result1 = peoples[0].fund * endValue + peoples[0].money;
        int result2 = peoples[1].fund*endValue + peoples[1].money;
        bw.write(result1 >result2 ? "BNP" : result1 == result2 ? "SAMESAME" : "TIMING");
        bw.flush();

    }


    static class People{
        int money;
        int fund;
        public People(int m, int f){
            this.money = m;
            this.fund = f;
        }
        @Override
        public String toString(){
            return this.money +" "+this.fund;
        }
    }
}
