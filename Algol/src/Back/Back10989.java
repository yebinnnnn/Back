package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Back10989 { //자바의 array.sort() 가 퀵정렬을 이용한다;;;;
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        int [] array= new int [n];

        for(int i=0; i<n; i++){
            array[i]=Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array);

        for(int i=0; i<n; i++){
            sb.append(array[i]).append('\n');
        }

        System.out.println(sb);
    }

}
