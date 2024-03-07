package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1296 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        String name=bf.readLine();
        int nameLength= name.length();
        //제시되는 연두의 이름 길이 !
        //연두의 이름에 따른 LOVE 의 정수 먼저 구해보자. L의 개수를 알기위해
        //해당글자를 제외한 나머지 글자르 모두 없애고 길이르 계산해서 개수를 구했다!
        int L = nameLength-name.replaceAll("L","").length();
        int O = nameLength-name.replaceAll("O","").length();
        int V = nameLength-name.replaceAll("V","").length();
        int E = nameLength-name.replaceAll("E","").length();
        //팀의 개수 cnt
        int cnt=Integer.parseInt(bf.readLine());
        //초기 설정
        int max=0;
        String result= "ZZZZZZZZZZZZZZZZZZZZ";

        for(int i=0;i<cnt; i++) { //팀 개수 만큼 반복
            String team=bf.readLine();
            int teamLength=team.length(); //팀 글자수
            //아까랑 같은 메소드로 팀명에 해당하는 이름 카운트 와...
            int tL= teamLength-team.replaceAll("L","").length();
            int tO= teamLength-team.replaceAll("O","").length();
            int tV= teamLength-team.replaceAll("V","").length();
            int tE= teamLength-team.replaceAll("E","").length();

            int total=sum(L+tL,O+tO,V+tV,E+tE);

            if(max<total){
                max=total;
                result=team;
            }
            else if(max==total){ //승률이 같을때 알파벳순으로 정해주는 메소드
                if(result.compareTo(team)>0){
                    result=team;
                }
            }

        }
        System.out.println(result);
    }
    public static int sum(int l, int o, int v, int e){
        return ((l+o)*(l+v)*(l+e)*(o+v)*(o+e)*(v+e))%100;
    }
}
