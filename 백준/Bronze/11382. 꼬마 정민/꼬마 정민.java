import java.util.Scanner;
public class Main {
//첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10^12)이 공백을 사이에 두고 주어진다.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long A = in.nextLong();
        long B = in.nextLong();
        long C = in.nextLong();


        System.out.println(A+B+C);
        in.close();
    }

}