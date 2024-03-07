package Back;

import java.util.Scanner;

public class Back2752_1 {
    public static void main(String[] args) { // 정렬알고리즘 풀이->내가 쓴 코드는 버블정렬.
        Scanner sc=new Scanner(System.in);
        int[] Min=new int [3];
        int[] Min0=new int [3];
        for(int i=0; i<3; i++){
            Min[i]=sc.nextInt();
        }
        for(int i=0; i<2; i++) {
            for (int j = 0; j < 2-i; j++) {
                if (Min[j] > Min[j + 1]) {
                    int temp = Min[j + 1];
                    Min[j + 1] = Min[j];
                    Min[j] = temp;
                }
            }
        }
        for(int i=0; i<3; i++){
            System.out.println(Min[i]);
        }
    }
}
