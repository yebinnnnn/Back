package Back;

import java.util.Scanner;

public class Back2530 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int time=sc.nextInt();
        C+=time%60;
        B+=(time/60)%60;
        A+=time/3600;
        if(C>59){
            int plus1=C/60;
            C-=60*plus1;
            B+=plus1;
        }
        if(B>59){
            int plus2=B/60;
            B-=60*plus2;
            A+=plus2;
        }
        if(A>23){
            int plus3=A/24;
            A-=24*plus3;
        }
        System.out.println(A+" "+B+" "+C);
    }
}
