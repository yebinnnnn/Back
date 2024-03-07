package Back;

import java.util.Arrays;
import java.util.Scanner;

public class Back1037_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int[] count= new int [num];
        int max=1;
        for(int i=0; i<num; i++){
            count[i]=sc.nextInt();
            max=Math.max(count[i],max);
        }
        Arrays.sort(count);
        System.out.println(count[0]*count[num-1]);
    }
}

