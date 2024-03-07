package Back;

import java.util.Scanner;

public class Back1037 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int[] count= new int [num];
        int answer=0;
        int min=0;
        int max=1;
        for(int i=0; i<num; i++){
            count[i]=sc.nextInt();
            max=Math.max(count[i],max);
        }
        for(int j=max+1;j<2147483647;j++){
            int n=0;
            for(int i=0;i<num;i++){
                n+=j%count[i];
            }
            if(n==0){
                answer=j;
                break;
            }
        }
        System.out.println(answer);
    }
}
