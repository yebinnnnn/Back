package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str=bf.readLine();
        String str2[]=str.split(" ");
        int D=Integer.parseInt(str2[0]);
        int H=Integer.parseInt(str2[1]);
        int W=Integer.parseInt(str2[2]);
        double key=Math.sqrt(H*H+W*W);
        double key2=(D/key);
        System.out.println((int)Math.floor(key2*H)+" "+(int)Math.floor(key2*W));
    }
}
