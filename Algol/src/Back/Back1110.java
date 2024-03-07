package Back;

import java.io.*;

public class Back1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        int one, second;
        int in=num;
        int cnt=0;
        boolean here=true;
        while(here){ //같은수 나올때까지 반복스
            one=in/10;
            second=in%10;
            int ten=one+second;
            int nextnum =second * 10+(ten%10);
            if (nextnum == num) {
                here=false;
            }
            in=nextnum;
            cnt++;
        }
        System.out.println(cnt);
    }
}
