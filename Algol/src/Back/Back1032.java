package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1032 {
    public static void main(String[] args) throws IOException {
        //문자열 기교가 들어갈거 같다.
        //비교하고 잘라내는게 중요할듯 (내가 잘 못함)
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(bf.readLine());
        String [] file=new String [n];

        for(int i=0;i<n; i++){
            file[i]=bf.readLine();
        }
        int fleng=file[0].length();
        char [] answer=new char [fleng];
        //1글자인 경우 예외처리
        if(n==1){
            for(int i=0; i<fleng;i++) {
                answer[i] = file[0].charAt(i);
            }
        }

        for(int i=0; i<n-1;i++){//이중반복문 쓰기 싫었는데... char 하나씩 뜯어쓸려면 이 방법만 있으나 replaceall을 쓰면 안써도 될지도
            for(int j=0; j<fleng;j++){
                char repl=file[i+1].charAt(j);
                if(file[i].charAt(j)!=file[i+1].charAt(j) || answer[j]=='?'){
                    answer[j]='?';
                }
                else{
                    answer[j]=repl;
                }
            }
        }
        System.out.println(answer);
    }
}
