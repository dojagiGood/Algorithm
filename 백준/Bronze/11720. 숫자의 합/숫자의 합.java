import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String numbers = br.readLine();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += numbers.charAt(i) - '0';
            //charAt(i)-'0'은 각 문자를 정수로 변환하는 역할을 함
            //각문자의 아스키코드값에서 '0'의 아스키코드값을 뺴면 해당 문자가 나타내는 숫자가 된다.
        }

        System.out.println(sum);

    }
}