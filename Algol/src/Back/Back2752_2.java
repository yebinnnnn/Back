package Back;

import java.util.Arrays;
import java.util.Scanner;

public class Back2752_2 {
    public static void main(String[] args) {//Array.sort(배열로 쓰는거)
        Scanner sc=new Scanner(System.in);
        int[] Min=new int [3];
        int[] Min0=new int [3];
        for(int i=0; i<3; i++){
            Min[i]=sc.nextInt();
        }
        for(int i=0; i<3; i++){
            Arrays.sort(Min);
            System.out.println(Min[i]);
        }
    }
}
