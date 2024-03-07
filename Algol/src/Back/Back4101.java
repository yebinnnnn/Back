package Back;
import java.util.Scanner;

public class Back4101 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true){
            int A = sc.nextInt(),B = sc.nextInt();
            if(A==0&&B==0){
                System.exit(0);
            }
            else if(A > B) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
