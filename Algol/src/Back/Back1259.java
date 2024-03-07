package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num=1;
        while(true) {
            num = Integer.parseInt(bf.readLine());
            if(num==0){
                break;
            }
            else if (num==Rev(num)){
                sb.append("yes"+'\n');
            }
            else if (num!=Rev(num)){
                sb.append("no"+'\n');
            }
        }
        System.out.println(sb);
    }
    public static int Rev(int a){
        int result=0;
        while(a>0){
            result=result*10+a%10;
            a/=10;
        }
        return result;
    }
}
