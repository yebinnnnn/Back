package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1672 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        String lang =bf.readLine();
        char [] langto =new char[n];
        for(int i=0; i<n; i++){
            langto[i]=lang.charAt(i);
        }
        for(int i=n-1; i>0; i--){
            if(langto[i]==langto[i-1]){
                langto[i-1]=langto[i];
            }
            else if(langto[i]=='A'&&langto[i-1]=='G'||langto[i-1]=='A'&&langto[i]=='G'){
                langto[i-1]='C';
            }
            else if(langto[i]=='G'&&langto[i-1]=='C'||langto[i-1]=='G'&&langto[i]=='C'){
                langto[i-1]='T';
            }
            else if(langto[i]=='A'&&langto[i-1]=='T'||langto[i-1]=='A'&&langto[i]=='T'){
                langto[i-1]='G';
            }
            else if(langto[i]=='C'&&langto[i-1]=='T'||langto[i-1]=='C'&&langto[i]=='T'){
                langto[i-1]='G';
            }
            else if(langto[i]=='G'&&langto[i-1]=='T'||langto[i-1]=='G'&&langto[i]=='T'){
                langto[i-1]='A';
            }
            else if(langto[i]=='A'&&langto[i-1]=='C'||langto[i-1]=='C'&&langto[i]=='A'){
                langto[i-1]='A';
            }
        }
        System.out.println(langto[0]);
    }
}
