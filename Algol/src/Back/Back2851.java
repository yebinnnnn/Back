package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int [] num= new int [10];
        for(int i=0; i<10; i++){
            num[i]= Integer.parseInt(bf.readLine());
        }
        int sum=0;
        int sum2;
        int answer=0;
        for(int i=0; i<10; i++){
            sum+=num[i];

            if(i==9){
                sum2=sum;
            }
            else{
                sum2=sum+num[i+1];
            }

            if(sum<=100 && sum2>=100){
                if(100-sum>=sum2-100){
                    answer=sum2;
                }
                else if(100-sum<sum2-100){
                    answer=sum;
                }
            }
            else if(sum2<=100){
                answer=sum2;
            }
        }
        System.out.println(answer);
    }
}
