package Back;

import java.util.Scanner;

public class Back1236 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        Character[][] castle=new Character [N][M];
        for(int i=0;i<N;i++){
            String str=sc.next();
            for(int j=0;j<M;j++){
                castle[i][j]=str.charAt(j);
            }
        }
        //행의 경비원 개수와 열의 경비원 개수 비교
        int cnt=0;
        for(int i=0;i<N;i++){
            boolean flag=true;
            for(int j=0;j<M;j++){
                if(castle[i][j]=='X'){
                    flag=false;
                    break;
                }
            }
            if(flag){
                cnt++;
            }
        }
        int cnt2=0;
        for(int i=0;i<M;i++){
            boolean flag2=true;
            for(int j=0;j<N;j++){
                if(castle[j][i]=='X'){
                    flag2=false;
                    break;
                }
            }
            if(flag2){
                cnt2++;
            }
        }
        int answer=Math.max(cnt,cnt2);
        System.out.println(answer);
    }
}
