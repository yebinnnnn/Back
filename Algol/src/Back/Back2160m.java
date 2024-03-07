package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back2160m { //브루트포스, 탐색 알고리즘  N-> 50개까지
    // 나중에 class 이용해서 풀어도 될거같다.
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(bf.readLine());
        String [][] draw= new String [num][]; // i는 입력되는 그림의 수 j는 그 그림의 열 (7개) 각각 입력값이 한 스트링.
        for(int i=0; i<num; i++){
            for(int j=0; j<5; j++) {
                draw[i][j]=bf.readLine();
            }
        }
        int start=0; //첫비교 대상
        for(int i=0; i<num; i++){ // 하나씩 기준점으로 잡고 나머지 비교, 숫자는 저장.
            for(int j=0; j<5; j++) {
                if(start==num){
                    break;
                }
            }
        }
    }
}
