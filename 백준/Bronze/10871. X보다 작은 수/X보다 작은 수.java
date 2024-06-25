
import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer str = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(str.nextToken());
        int x = Integer.parseInt(str.nextToken());

        int[] arr = new int[n];

        str = new StringTokenizer(br.readLine(), " ");


        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < x) {
                bw.write(arr[j] + " ");
            }
        }





        br.close();
        bw.flush();
        bw.close();

    }

}
