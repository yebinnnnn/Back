package Back;

import java.util.Scanner;

public class Back1 {
    public static void main(String[] args) {
        int sang, joong, ha;
        int col, sa;
        int Min=0;
        Scanner sc = new Scanner(System.in);
        sang = sc.nextInt();
        joong = sc.nextInt();
        ha = sc.nextInt();
        col = sc.nextInt();
        sa = sc.nextInt();
        int[] ham = {sang, joong, ha};
        int[] Min0 =new int[3];
        for(int j=0;j<ham.length; j++){
            int score = ham[j] + col-50;
            int score2 = ham[j] + sa-50;
            Min = Math.min(score, score2);
            Min0[j]=Min;
        }
        for(int i = 0; i < 1; i++){
            Min = Math.min(Min0[i], Min0[i+1]);
        }
        if(Min>=Min0[2]){
            Min=Min0[2];
        }
        System.out.println(Min);
    }
}