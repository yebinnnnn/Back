package Back;

import java.util.Scanner;

public class Back2 { //입력 단어 s를 index로 저장하는것
    //아스키 코드-> char단어 앞에 (int)하면 변환된다
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char[] ch=sc.next().toCharArray();
        int[] A=new int[26];
        for(int j=0; j<ch.length; j++){
            A[ch[j]-97]++;
        }
        for(int j=0; j<26; j++){
            System.out.print(A[j]+" ");
        }
    }
}
