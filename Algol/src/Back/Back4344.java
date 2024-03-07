package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int case0=Integer.parseInt(bf.readLine());
        double [] aver= new double [case0];

        for(int i=0; i<case0; i++){
            aver[i]=caculate(bf);
        }
        for(int i=0; i<case0; i++){
            System.out.printf("%.3f",aver[i]);
            System.out.println("%");
        }
        bf.close();

    }
    public static double caculate(BufferedReader bf) throws IOException {
        StringTokenizer st= new StringTokenizer(bf.readLine());
        int sum=0;
        double average=0;
        double proper=0;

        int thiscase= Integer.parseInt(st.nextToken());
        int [] score = new int [thiscase];
        for(int j = 0; j<thiscase; j++){
            score[j]=Integer.parseInt(st.nextToken());
            sum+=score[j];
            if(!st.hasMoreTokens()){
                break;
            }
        }
        average=sum/(double)thiscase;
        int cnt=0; //몇명이 넘는지 세기 위한 정수
        for(int j=0; j<thiscase; j++){
            if(average<score[j]){
                cnt++;
            }
        }
        proper=cnt/(double)thiscase*100;
        return proper;
    }
}