package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//그림그리면서 하기 !!
//다이나믹 프로그래밍. 부분 문제로 전체 문제를 푼다. 동적 프로그래밍. (재귀와도 구분된다고 알고 있음)
//근데 재귀로 풀게 되는걸...? 단순재귀보다는 dp가 효율성이 좋아야한다.
public class Back2775 { //브1 레벨에서 제일 유명한 다이나믹 프로그래밍 문제. 이건 풀어야할듯
    static int [] pnum;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(bf.readLine());//test케이스 입력

        int[][] set = new int[num][1]; //set 배열에 주어진 케이스 저장
        for (int i = 0; i < num; i++) {
            set[i][0]=Integer.parseInt(bf.readLine());
            set[i][1]=Integer.parseInt(bf.readLine());
        }
        pnum= new int [set[0][0]+1];
        for(int i=0; i<num; i++) {
            System.out.println(people(set[i][0], set[i][1]));
        }
    }
    //주어진층 하나 아래의 1층~해당층 사이의 사람 수 합을 구해야함.
    //각각 해당층도 마찬가지. 0층인경우는 i호에 i명.
    public static int people(int floor, int house) {
        for (int i = 1; i <= house; i++) {
            if (floor == 0) {
                return i;
            }
            else if(floor>0) {
                people(floor - 1, i);
            }
        }
    }
}
