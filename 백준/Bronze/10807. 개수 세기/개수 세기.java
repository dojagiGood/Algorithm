
import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[n];

        StringTokenizer str = new StringTokenizer(br.readLine());
        //뒤에,""이거안해도 자동으로 공백기준으로 파싱됨

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
        }

        int b = Integer.parseInt(br.readLine());

        for (int j = 0; j < arr.length; j++) {
            if (b == arr[j]) {
                count++;
            }
        }

        System.out.println(count);

        br.close();
        bw.flush();
        bw.close();

    }

}
