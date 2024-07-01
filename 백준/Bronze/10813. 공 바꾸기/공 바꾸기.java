import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int x = 0; x < m; x++) {

            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int swap = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = swap;


        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }

}




