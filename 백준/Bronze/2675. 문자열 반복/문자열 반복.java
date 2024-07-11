import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            String[] input = br.readLine().split(" ");
            int r = Integer.parseInt(input[0]);
            String s = input[1];

            StringBuilder result = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    result.append(s.charAt(j));
                }


            }

            System.out.println(result.toString());


        }
    }
}