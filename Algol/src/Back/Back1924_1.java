package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1924_1 { // 2007년 1월1일은 월요일이다.
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        StringTokenizer st= new StringTokenizer(bf.readLine());

        String [] cal= new String[]{"SON", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        //31일인 달은 1,3,5,7,8,10,12월. 2월은 28일까지 나머지 날(2,4,6,11)은 30일까지이다.
        for(int x=1;x<=12;x++){
            for(int y=1;y<=30;y++){
                int plus=0;
                if(x==2){
                    plus=31;
                }
                else if(x==3||x==4||x==5||x==6||x==7||x==8){
                    plus=28+31*(x/2)+((x-1)-(x/2)-1)*30;
                }
                else if(x>=9){ //9월 전까지는 완료. 7월8월에 대한 고려가 필요함
                    plus=243+(30*((x/2)-4))+(((x-1)-(x/2)-4)*31);
                }
                int day=plus+y; // 지나간 달에 따라 누적된 일수를 추가하자.
                int jump=day%7;

                sb.append(x).append("월").append(y).append("일").append(" ");
                sb.append(cal[jump]).append("\n");
                System.out.println(sb);
            }
        }
    }
}
