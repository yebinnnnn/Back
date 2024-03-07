package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        String word= bf.readLine();
        int num=10000000;
        int [] same= new int [num];

        for(int i=0; i<word.length(); i++){
            for(char j='A'; j<='Z'; j++){
                char com=word.charAt(i);
                if(j==com||(char)(j+32)==com){
                    same[j]++;
                }
            }
        }
        int max=0;
        char key = 0;
        for(char j='A'; j<='Z'; j++){
            if(max<same[j]&&same[j]>=1){
                max=same[j];
                key=j;
            }
        }
        for(char j='A'; j<='Z'; j++){
            if(max==same[j]&&j!=key){
                System.out.println("?");
                System.exit(0);
            }
        }
        System.out.println(key);
    }
}
