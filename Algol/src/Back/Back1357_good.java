package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1357_good {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int answer= Rev((Rev(X) + Rev(Y)));
        System.out.println(answer);

    }
    private static int Rev(int num){
        int result=0;
        while(num>0){ //이러면 자릿수에 관계없이 적용가능
            result=result*10+num%10; //기존수에 10씩 곱해주면서 num 은 10으로 깎이는수를 거꾸로 넣어주기
            num/=10;
        }
        return result;
    }
}
