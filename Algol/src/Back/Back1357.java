package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1357 {  //개노가다 알고리즘 ...너무 구림 다른 best가 있을텐데
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int answer= Reverse((Reverse(X) + Reverse(Y)));
        System.out.println(answer);
    }

    public static int Reverse(int a) {
        if(a/1000!=0){ //입력되는수가 4자리를 넘어갈때
            int last=a/1000;
            a%=1000;
            int first=a/100;
            a%=100;
            int second=a/10;
            a%=10;
            return a*1000+second*100+first*10+last;
        }
        else if(a/100!=0){ //입력되는 수가 세자리
            int first=a/100;
            a%=100;
            int second=a/10;
            a%=10;
            return a*100+second*10+first;
        }
        else if(a/10!=0){ //입력되는 수가 두자리
            int second=a/10;
            a%=10;
            return a*10+second;
        }
        else{ //입력되는 수가 한자리 정수
            return a;
        }
    }
}
